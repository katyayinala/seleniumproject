package com.assignment.edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributesid {


	public static WebDriver driver = null;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.navigate().to("https://facebook.com");
	    
	    
	    WebElement monthid = driver.findElement(By.id("month")); 
	    System.out.println(monthid.getAttribute("id"));

	    WebElement monthclass = driver.findElement(By.id("month")); 
	    System.out.println(monthclass.getAttribute("class"));
	
	    WebElement monthname = driver.findElement(By.id("month")); 
	    System.out.println(monthname.getAttribute("name"));
	   
	    WebElement monthtitle = driver.findElement(By.id("month")); 
	    System.out.println(monthtitle.getAttribute("title"));
	
	
	}

}
