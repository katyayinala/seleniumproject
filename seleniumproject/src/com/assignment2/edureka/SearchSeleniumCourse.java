package com.assignment2.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSeleniumCourse {

	public static WebDriver driver = null;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.navigate().to("https://edureka.co/");
	    
	  
          WebElement textbox  = driver.findElement(By.id("search-inp"));
	    
          textbox.sendKeys("selenium");
        

	    driver.findElement(By.xpath("//span[@class='typeahead__button']")).click();

	}

}
