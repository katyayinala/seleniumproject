package com.assignment2.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectAllCourcesFromMenu {
	  public static WebDriver driver = null;
	 
		
	
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    
	    
	    driver.manage().window().maximize();
	  
		driver.manage().deleteAllCookies();
	     
	    driver.navigate().to("https://www.edureka.co/");
	    driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(1000);
		
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("si_popup_email")));
		actions.sendKeys("katy.ayinala@gmail.com");
		actions.build().perform();
		
		actions.moveToElement(driver.findElement(By.id("si_popup_passwd")));
		actions.click();
		actions.sendKeys("Raja2987");
		actions.build().perform();
		Thread.sleep(2000);
		
		actions.moveToElement(driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")));
		Thread.sleep(2000);
		actions.click();
		actions.build().perform();
		
		driver.findElement(By.xpath("//img[@class=\'user_image\']")).click();
		Thread.sleep(2000);
	   
	  driver.findElement(By.xpath("//a[contains(text(),'Courses')]")).click();
	 
	}

}
