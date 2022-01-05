package com.edureka.controls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingListBox {

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
			    driver.navigate().to("http://demo.automationtesting.in/Register.html");
			
			 
			/* WebElement yearListbox= driver.findElement(By.id("year"));
			        Select skillyear=new Select(yearListbox);   */               ///droplist 
			  
			    /*WebElement skillsListbox= driver.findElement(By.id("Skills"));
			         Select skills=new Select(skillsListbox); */ 
			         //skills.selectByIndex(8);
			         //skills.selectByValue("Art Design");
		    
	               //  skills.selectByVisibleText("Engineering");
			
			//   INTERVIEW QUESTIONS
			//how many  in list box
			    /* List<WebElement> alloptions=skills.getOptions();
			System.out.println( alloptions.size());*/ 
			
			
			//all the options in list box
			
			/*for(WebElement option:alloptions)
			{
			String listText=option.getText();
			System.out.println(listText);
			
			}*/
			
			ArrayList<String>countryList = new ArrayList<String>();
			WebElement countrydropdown=driver.findElement(By.id("countries"));
			Select country=new Select(countrydropdown); 
			List<WebElement>allCountries=country.getOptions();
			for(int i=0;i<allCountries.size();i++)
			{
			WebElement country1 = allCountries.get(i);
			String countryText=country1.getText();
			countryList.add(countryText);
			}
			Collections.sort(countryList);
			for(String text : countryList)
			{
			System.out.println(text);	
			}
			
			
			
			
			}

}
