package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByPartialLinkText {

	public static WebDriver driver = null;
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();

driver.navigate().to("https://www.facebook.co/");
	  // driver.navigate().to("https://www.edureka.co/");
 WebElement forgottenAccnt = driver.findElement(By.partialLinkText("account?"));
	   
	   forgottenAccnt.click();
	
	   /*WebElement logi = driver.findElement(By.partialLinkText("log?"));
	   
	  logi.click();*/
	   
	   
	   
	   
	}

}
