package com.edureka.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToGmail {

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
	    
	 WebElement email= driver.findElement(By.id("identifierId"));
	    email.sendKeys("katyayannaidu9@gmail.com");
	     
	 driver.findElement(By.xpath("//span[text()='Next']")).click(); 
	
	 driver.findElement(By.name("password")).sendKeys("warenbafet");
	 driver.findElement(By.xpath("//span[text()='Next']")).click(); 
	
	 wait.until(ExpectedConditions.titleContains("katyayannaidu9@gmail.com"));
	 String title= driver.getTitle();
	 System.out.println("title");

	 if(title.contains("Inbox"))
	 {
		 System.out.println("succesfull");
     }
	 else  
	 {
	     System.out.println("fail");
	 }
	 
	
	
	
	
	
	}

}
