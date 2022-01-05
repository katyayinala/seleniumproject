package com.edureka.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByTagName 
{
	public static WebDriver driver = null;
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    //driver.navigate().to("https://www.facebook.co/");
	    
	    driver.navigate().to("https://www.gmail.com");
	    
	    List<WebElement> AllLinks =driver.findElements(By.tagName("a"));
	    System.out.println(AllLinks.size());
	    
	    for(WebElement link:AllLinks)
	    {
	    	
	    	System.out.println(link.getText());
	    
	    
	    }
	   
	    	
	    
	    } 
	    
	    

}
