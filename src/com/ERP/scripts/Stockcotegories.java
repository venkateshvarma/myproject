package com.ERP.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;



public class Stockcotegories {

	public static void main(String[] args) {
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
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
	    driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
	    driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
	    driver.findElement(By.xpath(".//*[@id='x_Category_Name']")).sendKeys("Vmoblies");
	    driver.findElement(By.id("btnAction")).click();
	    driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	    Alert alt=driver.switchTo().alert();
		alt.accept();
		

	}

}
