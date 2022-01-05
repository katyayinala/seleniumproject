package com.assignment.module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndigoPortal {
	public static WebDriver driver = null;
	public static WebDriverWait wait= null;
	
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		wait = new WebDriverWait(driver,20);
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	     
		driver.navigate().to("https://www.goindigo.in/?linkNav=home_header");
	    driver.findElement(By.xpath("//label[text()='One Way']")).click();
		Thread.sleep(5000);
		System.out.println("Selecting the City From dropdown"+"\n");
		//Actions actions = new Actions(driver);
	
	//actions.moveToElement(
		driver.findElement(By.xpath("//input[@placeholder='From']")).clear();
	
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bengaluru");
	    
	driver.findElement(By.xpath("//a[contains(text(),'Bengaluru')]")).click();
		   
	Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Lucknow");
	
	    Thread.sleep(5000);
		
	    WebElement AdultListbox= driver.findElement(By.id("Adult(s)"));
	    Select Adult=new Select(AdultListbox);  
	    Adult.selectByIndex(3);
	
	    WebElement childListbox= driver.findElement(By.id("Children"));
	    Select Children=new Select(childListbox);  
	    Children.selectByIndex(2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

    

}
