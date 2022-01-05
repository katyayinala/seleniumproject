package com.assignment2.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigateToPreviousPage {

	public static WebDriver driver = null;
	public static WebDriverWait wait= null;
	
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		wait = new WebDriverWait(driver,20);
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	     
	    driver.navigate().to("https://www.gmail.com");
	    
	  driver.navigate().to("https://www.hollandandbarrett.com/");
	driver.navigate().back();
	
	}

}
