package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByClassName
{
	public static WebDriver driver = null;

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.navigate().to("https://facebook.com");
	    
	   WebElement mobile= driver.findElement(By.className("_ihd _3ma mbs _6n _6s _6v"));
	   
	   mobile.sendKeys("23456");
	   
	   
	}

}
