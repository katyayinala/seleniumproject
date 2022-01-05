package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorById 
{
	public static WebDriver driver= null; 
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    //driver.navigate().to("https://www.facebook.com");
	    
	    //driver.navigate().to("https://www.gmail.com");
	    driver.navigate().to("https://www.theperfumeshop.com/");
	    
	   /* WebElement email = driver.findElement(By.id("email"));
	    
        email.sendKeys("katyharish");*/
        
	   // identifierId identifierId= driver.findElement(By.id("identifierId"));
//WebElement identifierId = driver.findElement(By.id("identifierId"));
	    
//identifierId.sendKeys("katyharish");
	    

	}

}
