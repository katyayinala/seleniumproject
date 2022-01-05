package com.edureka.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AssignmentEdureka 
{
	public static WebDriver driver = null;
	public static WebDriverWait wait= null;
	
	
	@DataProvider
	public String[][] getData()
	{
		
	String[][]credentials=new String[2][2];
	credentials[0][0]="katy.ayinala@gmail.com";
	credentials[0][1]="Raja2987";

	credentials[1][0]="katy.ayinala@gmail.com";
	credentials[1][1]="Raja2987";

	return credentials;
    }
	
	
	@BeforeMethod
    public void launchApp()
    {
	

		System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
        wait = new WebDriverWait(driver,20);
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
    driver.navigate().to("https://www.edureka.co/");
    }
	


	@Test (dataProvider="getData")
    public void loginToGmail(String username,String password) throws InterruptedException
    {

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("si_popup_email")));
		actions.sendKeys("username");
		actions.build().perform();
		
		actions.moveToElement(driver.findElement(By.id("si_popup_passwd")));
		actions.click();
		actions.sendKeys("password");
		actions.build().perform();
		Thread.sleep(2000);
		
		actions.moveToElement(driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")));
		Thread.sleep(2000);
		actions.click();
		actions.build().perform();
		
		
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Courses')]")).click();
    
    
		 driver.findElement(By.xpath("//span[@class='user_name']")).click();
		    Thread.sleep(2000);
		    
		    
		    
		    
		    
		    
		  driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		    
		   
		   /* try {Thread.sleep(2000);
		    } catch (InterruptedException e) {
		    e.printStackTrace();
		    }*/
    
    }
  
		   @AfterMethod
		public void closeApplication() 
		   {
			   driver.quit();
		   }
		   
		
    }

	



































}
