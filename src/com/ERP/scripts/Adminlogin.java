package com.ERP.scripts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Adminlogin {

	public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
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
		
			
			

	}

}
