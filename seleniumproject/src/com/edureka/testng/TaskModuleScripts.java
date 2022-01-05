package com.edureka.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModuleScripts {
	
	@Test(groups= {"Smoke"})
	
	 public void createTask()
	 {

	 Reporter.log("task created succesfully");
	
	 }

	
	  
	  @Test(groups= {"Regression"})
	  public void editTask()
	  {

	  Reporter.log("task created succesfully");

	  }
	  
	 
	  @Test(groups= {"Regression"})
	  public void deleteTask()
	  {

	  Reporter.log("task created succesfully");

	  }


}
