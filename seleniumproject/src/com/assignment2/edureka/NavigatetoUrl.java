package com.assignment2.edureka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatetoUrl {
	public static WebDriver driver= null;                                            
    public static void main(String[] args)
    {
	
    	System.setProperty("webdriver.chrome.driver", "C:\\selenium edureka workspace may19th\\seleniumproject\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    	driver.navigate().to("https://www.edureka.co/");

	

	}

}
