package com.assignment.edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoLinktextPartial 
{

	public static WebDriver driver = null;
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	   driver.navigate().to("https://www.edureka.co/");
	    
    //  driver.findElement(By.linkText("Log In")).click();
	
	   
	  // driver.findElement(By.partialLinkText("Log")).click();             
                
	   
	 
	   
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
