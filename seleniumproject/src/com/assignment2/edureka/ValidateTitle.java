package com.assignment2.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidateTitle {

	public static WebDriver driver= null;                                             //declaration

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
 
    
    driver.navigate().to("https://www.facebook.com");   
  
   System.out.println( driver.getTitle());
   
   
	driver.quit();
	
	}

}
