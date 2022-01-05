package com.edureka.testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo
{

	@BeforeSuite

public void setUp()
{
		Reporter.log("establish connections with servers/databases/downloadfiles");

}
	 
	
	@BeforeTest
	public void beforeTestMethod()
	{
		Reporter.log("this gets executed before each and every test blocks in testing.xml file");
	}
	
	
	
	     @BeforeClass
	public void  beforeClassMethod()
	{
	    	 Reporter.log("this gets executed before each and every class in testing.xml file");
	}
	     
	     
	     
	           @BeforeMethod
	          public void precondition()
	         {
	    	 Reporter.log("method gets execute before each and every test method ");
	          }
	     @Test
	     public void actualTestCases()
	     {
	     
	    	 Reporter.log("executable block of code");
	     }
	     
	     
	        @AfterMethod
	        public void closeBrowser() 
	       {
	        	Reporter.log("method gets execute after each and every test method ");
	       }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     @AfterClass
	public void  afterClassMethod()
	{
	    	 Reporter.log("this gets executed after each and every class in testing.xml file");
	}
	     
	     
	     
	     
	
	@AfterTest
	public void afterTestMethod()
	{
		Reporter.log("this gets executed after each and every test blocks in testing.xml file");
	}
	
	
	

@AfterSuite

public void afterSuitMethod()
{
	Reporter.log("disconnect the connections/Trigger an email");
}



























}
