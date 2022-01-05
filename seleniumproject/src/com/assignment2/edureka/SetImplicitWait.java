package com.assignment2.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetImplicitWait 
{
	public static WebDriver driver=null;
	public static void main(String[] args) 
	{
	      System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.navigate().to("https://www.amazon.co.uk");
	driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
	
	
	driver.findElement(By.name("email")).sendKeys("katy.ayinala@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kathynaidu9");
	driver.findElement(By.id("signInSubmit")).click();
	}

}
