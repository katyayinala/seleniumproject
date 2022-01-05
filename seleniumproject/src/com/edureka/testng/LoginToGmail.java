package com.edureka.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginToGmail
{
	public static WebDriver driver = null;
	public static WebDriverWait wait= null;
	
	@DataProvider
	public String[][] getData()
	{
		
	String[][]credentials=new String[3][2];
	credentials[0][0]="katyayannaidu9@gmail.com";
	credentials[0][1]="warenbafet";

	credentials[1][0]="katyayannaidu9@gmail.com";
	credentials[1][1]="warenbafet";
	
	
	credentials[2][0]="seleniumedureka@gmail.com";
	credentials[2][1]="Apple12345";
	
	return credentials;
     }
			@Parameters("browser") 
			@BeforeMethod
     public void launchApp(String browser)
     {
		if(browser.equalsIgnoreCase("CHROME")) 
		  {
				System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
		  }	
		else if(browser.equalsIgnoreCase("FIREFOX"))
		   {
			System.setProperty("webdriver.gecko.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		    }
			
			wait = new WebDriverWait(driver,20);
		    
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
	        driver.navigate().to("https://www.gmail.com");
	 driver.get("https://www.gmail.com");
     }
	        
	        @Test (dataProvider="getData")
     public void loginToGmail(String username,String password)
     {
		 WebElement email= driver.findElement(By.id("identifierId"));
		    email.sendKeys(username);
		     
		 driver.findElement(By.xpath("//span[text()='Next']")).click(); 
		
		 driver.findElement(By.name("password")).sendKeys(password);
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
	
	
	
	 @AfterMethod
     public void closeApplication()
     {
		 driver.quit();
     }
	
	
	
	
	
	
	}
