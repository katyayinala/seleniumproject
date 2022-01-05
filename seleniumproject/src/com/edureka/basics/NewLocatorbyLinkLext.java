package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewLocatorbyLinkLext 
{
    public static  WebDriver driver=null;
    public static void main(String[] args) 
    {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	     //driver.navigate().to("https://www.facebook.co/");
	   // driver.navigate().to("https://www.gmail.com");
   
	    driver.navigate().to("https://www.edureka.co/");
	   
	    	/* WebElement forgottenAccnt = driver.findElement(By.linkText("Forgotten account?"));
        forgottenAccnt.click();*/
       
	    
     // driver.findElement(By.linkText("Learn more")).click();
      
      //driver.findElement(By.partialLinkText("Learn")).click();
	     
	   
      
	    driver.findElement(By.linkText("Log In")).click();
	      
    
    
    }
    

}
