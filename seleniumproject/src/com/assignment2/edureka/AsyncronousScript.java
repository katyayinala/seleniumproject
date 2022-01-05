package com.assignment2.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AsyncronousScript {


	public static WebDriver driver = null;
	public static WebDriverWait wait= null;
	
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    wait = new WebDriverWait(driver,20);
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	   driver.get("https://www.edureka.co/");
	   long start_time = System.currentTimeMillis();
       js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
	
       System.out.println("Passed time: " + (System.currentTimeMillis() - start_time));
	}

}
