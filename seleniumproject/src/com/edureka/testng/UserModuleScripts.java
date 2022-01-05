package com.edureka.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UserModuleScripts 
{
  @Test(groups= {"Smoke"})
 public void createUser()
 {

 Reporter.log("user created succesfully");

 }

 
  
  @Test(groups= {"Regression"})
  public void editUser()
  {

  Reporter.log("user created succesfully");

  }
  
  @Test(groups= {"Regression"})
  public void deleteUser()
  {

  Reporter.log("user created succesfully");

  }





}
