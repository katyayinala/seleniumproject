package com.assignment.edureka;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWebElements {
	public static WebDriver driver= null; 
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.navigate().to("https://www.gmail.com");
	
	

	    List<WebElement>elements  =driver.findElements(By.xpath("//*"));
	    System.out.println(elements.size());
	    
	    for(WebElement x:elements)
	    {
	    	
	    	System.out.println(x.getText());
	    
	    
	    }
	
	
	
	
	
	
	
	}		
}
