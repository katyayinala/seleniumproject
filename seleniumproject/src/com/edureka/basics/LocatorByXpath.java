package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByXpath {

	public static WebDriver driver= null;                                             //declaration

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.navigate().to("http://demo.automationtesting.in/Register.html");
    
     String absoluteXpath="/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input";
    
    // Relative Xpath-attribute and value pairs-//tagname[@attribute='value']
    
     WebElement fname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
     fname.sendKeys("katyharish");
    
  // Relative Xpath-text() method - //tagname[text()='value']
    
     WebElement address=driver.findElement(By.xpath("//label[text()='Address']"));
    System.out.println(address.getText());
    
    //Relative Xpath-pattern matching--> start-with and contains
    
    
 /* //tagname[start with(@attribute,'value')]  or  //tagname[start with(text(),'value')]  */
    
 /* //tagname[contain(@attribute,'value')]  or  //tagname[contain(text(),'value')]  */
    
    WebElement text=driver.findElement(By.xpath("//div[starts-with(text(),'Click your')]"));   //facebook
    System.out.println(text.getText());
    
	//Xpath Axes
	
    WebElement emailAddress=driver.findElement(By.xpath("//span[text()='Email']//following::input)")); 
    System.out.println(emailAddress.getText());
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
