package com.edureka.controls;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildbrowserpopup {

	public static WebDriver driver= null; 
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
        driver.navigate().to("http://popuptest.com");
	
	driver.findElement(By.linkText("Multi-PopUp Test")).click();
	
	
	String parent= driver.getWindowHandle();
	
	
	Set<String>allbrowsers=driver.getWindowHandles();
	
	   for(String handle :allbrowsers)
	     {
		 if(handle.equals(parent))  
		   continue;
		   else
		   {
	 driver.switchTo().window(handle);
      driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  driver.close();
	       }
	     }
	   
	   driver.findElement(By.xpath("//input[@value=\"  BACK  \"]")).click();
		   
	}

}
