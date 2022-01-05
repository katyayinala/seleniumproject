package com.edureka.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser
{
	public static WebDriver driver= null;                                             //declaration

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
    driver = new ChromeDriver();
		
    
    String browserId = driver.getWindowHandle();
    System.out.println(browserId);  //991EFAB95EB50EA5C7CDB568594B6099
    
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
     
   // driver.get("https://www.google.com");
    
    driver.navigate().to("https://www.google.com");
    
    
    
    String title= driver.getTitle();
    System.out.println(title);
    
  String url= driver.getCurrentUrl();
  System.out.println(url);
  
  driver.close();
  
  driver.quit();
  
  
  
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   

	}
}
