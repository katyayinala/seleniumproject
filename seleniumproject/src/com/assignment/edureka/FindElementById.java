package com.assignment.edureka;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementById {


	public static WebDriver driver= null; 
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.navigate().to("https://www.gmail.com");
		
       //driver.findElement(By.id("identifierId")).sendKeys("katyharish");
	  
	    //driver.findElement(By.name("identifier")).sendKeys("katyharish");
	
	    //driver.findElement(By.className("AxOyFc snByac")).sendKeys("katyharish");
	
	    //driver.findElement(By.xpath("//input[@type='email']")).sendKeys("12222222");
	 
	   /* List<WebElement> AllLinks =driver.findElements(By.tagName("a"));
	    System.out.println(AllLinks.size());
	    
	    for(WebElement link:AllLinks)
	    {
	    	
	    	System.out.println(link.getText());
	    
	    
	    }*/
	   
	   // driver.findElement(By.linkText("Learn more")).click();
		driver.findElement(By.partialLinkText("Learn")).click();
		   
		            
	
	
	
	
	}

}
