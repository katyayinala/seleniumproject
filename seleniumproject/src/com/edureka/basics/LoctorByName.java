package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoctorByName {
	public static WebDriver driver = null;

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	   // driver.navigate().to("https://facebook.com");
	    driver.navigate().to("https://gmail.com");
	    
	/* WebElement email=driver.findElement(By.name("email"));
	    
	    email.sendKeys("kathyharish");	*/
	    
	    /* driver.findElement(By.name("email")).sendKeys("kathyharish");	*/
	    
	    driver.findElement(By.name("identifier")).sendKeys("kathyharish");
	}

}
