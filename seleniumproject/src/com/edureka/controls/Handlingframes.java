package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handlingframes {

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
		    
			
			driver.navigate().to("http://demo.automationtesting.in/Frames.html");
		 
			//driver.switchTo().frame(0);
		//driver.switchTo().frame(SingleFrame);
		   
		  /* driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		   driver.switchTo().frame(SingleFrame);
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium edureka");*/

	driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		
	WebElement outerframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(outerframe);
		driver.switchTo().frame(0);
		
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("HandlingControls");
		 
		  
		  
		  /////SWITCH TO PARENT FRAME
		  
		/*  driver.switchTo().parentFrame();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Single Iframe")).click();*/
		
		

	}

}
