package com.ERP.scripts;



import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StockItem {


	
	public static void main(String[] args) 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String Expval="« Stock Accounting System";
		driver.get("http://webapp.qedgetech.com/");
		String Actval=driver.getTitle();
		System.out.println(Actval);
		if (Expval.equalsIgnoreCase(Actval))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.findElement(By.id("btnreset")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		driver.findElement(By.id("mi_a_stock_items")).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
		Select catlist=new Select(driver.findElement(By.xpath(".//*[@id='x_Category']")));
		catlist.selectByVisibleText("Vmoblies");
		Select supNo=new Select(driver.findElement(By.xpath(".//*[@id='x_Supplier_Number']")));
		supNo.selectByValue("Supplier-00000003015");
		driver.findElement(By.id("x_Stock_Name")).sendKeys("Smartphones");
		Select UOMlist=new Select(driver.findElement(By.xpath(".//*[@id='x_Unit_Of_Measurement']")));
		UOMlist.selectByVisibleText("Items");
		driver.findElement(By.id("x_Purchasing_Price")).sendKeys("200000");
		driver.findElement(By.id("x_Selling_Price")).sendKeys("400000");
		driver.findElement(By.id("x_Notes")).sendKeys("touch");
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}

}
