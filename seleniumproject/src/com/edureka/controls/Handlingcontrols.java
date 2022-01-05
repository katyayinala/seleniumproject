package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.sun.java.swing.action.NewAction;

public class Handlingcontrols {

	public static WebDriver driver= null; 
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
        driver.navigate().to("http://demo.automationtesting.in/Register.html");
	//Radiobuttons and CheckBox
	
	/*WebElement maleradiobutton=driver.findElement(By.xpath("//input[@value='Male']"));
	maleradiobutton.click();
	
	driver.findElement(By.id("checkbox1")).click();
	WebElement switchto=driver.findElement(By.xpath("//a[@href=\"SwitchTo.html\"]"));
	
	 
	Actions action=new Actions(driver);
	action.moveToElement(switchto).perform();
	
	driver.findElement(By.linkText("Alerts")).click();*/
	
        
      //  ENTER KEYS  in upper case
	 
        WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
       Actions action=new Actions(driver); 
        Action enterkeysinuppercase= action.keyDown(firstname, Keys.SHIFT).sendKeys("iam katyayani").keyUp(firstname, Keys.SHIFT).build();
        enterkeysinuppercase.perform();
	
	
	
	
	
	
	
	
	}

}
