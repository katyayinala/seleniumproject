package com.assignment.module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentEdurekaPortal {

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
	     
	    driver.get("https://www.edureka.co/");
		Thread.sleep(1000);
		
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
		
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		Thread.sleep(2000);
		
		
		WebDriverWait waitElement = new WebDriverWait(driver,20);
		waitElement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='active']//a[@data-toggle='tab'][contains(text(),'My Profile')]")));
		driver.findElement(By.xpath("//li[@class='active']//a[contains(text(),'My Profile')]")).click();
		String Pagetitle = driver.getTitle();
	    System.out.println("Pagetitle");
	    
	   driver.findElement(By.id("personal_details")).click(); 
	 
	    Thread.sleep(2000);
	
	   
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("katy");
	  
	    
	    
	    Thread.sleep(2000);
	    System.out.println("b");driver.navigate().to("https://learning.edureka.co/my-profile");
	    Thread.sleep(2000);
	    System.out.println("a");
	    System.out.println("abc");
	    driver.navigate().to("https://learning.edureka.co/onboarding/careerinterests");
	    Thread.sleep(3000);
	    Select dropdownCurrentJob = new Select(driver.findElement(By.xpath("//select[@name='interestedJob']")));
	    Thread.sleep(2000);
	    dropdownCurrentJob.selectByVisibleText("Software Testing");
	    Thread.sleep(2000);
	    Select dropdownEmployementType = new Select(driver.findElement(By.xpath("//select[@name='elementType']")));
	    Thread.sleep(2000);dropdownEmployementType.selectByVisibleText("Both");
	    
	    driver.findElement(By.name("currentCity")).sendKeys("maidenhead");
	    
	   
	    driver.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	    driver.navigate().to("https://learning.edureka.co/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='user_name']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	    Thread.sleep(2000);
	    System.out.println("a");
	    try {Thread.sleep(2000);
	    } catch (InterruptedException e) {
	    e.printStackTrace();
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
	    
	    
	
	}

}
