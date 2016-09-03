package com.ERP.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Suppliers {

	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String Expval="� Stock Accounting System";
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
		driver.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a")).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		driver.findElement(By.id("x_Supplier_Name")).sendKeys("VISHNU");
		driver.findElement(By.id("x_Address")).sendKeys("ashok nagar,tirupati");
		driver.findElement(By.id("x_City")).sendKeys("tirupathi");
		driver.findElement(By.id("x_Country")).sendKeys("INDIA");
		driver.findElement(By.id("x_Contact_Person")).sendKeys("vinod");
		driver.findElement(By.id("x_Phone_Number")).sendKeys("0123456789");
		driver.findElement(By.id("x__Email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("x_Mobile_Number")).sendKeys("9876543210");
		driver.findElement(By.id("x_Notes")).sendKeys("sdfjdhs");
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}

}
