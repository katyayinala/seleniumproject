package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByLinkText 
    {

	public static WebDriver driver = null;
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	     driver.navigate().to("https://www.facebook.co/");
	    
	    //driver.navigate().to("https://www.edureka.co/");
	    
	   // driver.navigate().to("https://www.gmail.com");
	    
	WebElement forgottenAccnt = driver.findElement(By.linkText("forgotten account?"));
	   
	forgottenAccnt.click();
	   
	    /* WebElement Logi = driver.findElement(By.linkText("Login"));
	   
	  Logi.click();*/
	   
	    /* WebElement learnmor = driver.findElement(By.linkText("learnmore?"));
		   
	    learnmor .click();*/
	   
	   
	   
	   
	}

}
