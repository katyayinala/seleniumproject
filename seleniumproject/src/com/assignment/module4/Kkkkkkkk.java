package com.assignment.module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Kkkkkkkk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Actions actions = new Actions(driver);
		  
			//actions.moveToElement(driver.findElement(By.xpath("//label[@for=\"oneWayTrip\"]"))).click();
			actions.moveToElement(driver.findElement(By.xpath("//input[@placeholder='From']"))).click();
		
			actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Bengaluru')]"))).click();
		
			actions.moveToElement(driver.findElement(By.xpath("//input[@placeholder='To']")));
			actions.sendKeys("Lucknow");

			actions.moveToElement(driver.findElement(By.name("passenger"))).click();
		
		WebElement AdultListbox= driver.findElement(By.id("Adult(s)"));
	    Select Adult=new Select(AdultListbox);  
	    Adult.selectByIndex(3);
		
		
		
	    WebElement childrenListbox= driver.findElement(By.id("Children"));
	    Select Children=new Select(childrenListbox);  
	    Children.selectByIndex(2);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.id("continue-button"));
		
	}

}
