package com.maven.abc.com.maven.abc;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
public class Example1 extends SeleniumHelper1 {

	/*
	 * Hashtable Keys
	   tcid ,tcdesc ,tcmethod, 
	   tcexecute, username ,password
	 * 
	 */
	
	Hashtable<String,Object> testdata=null;
	static String testcaseid;
	public static boolean runflag=false;
	  
	  @Test()
	  public void testcognizantMail() throws IOException{
		 testcaseid="TC001";
		 testdata=ExcelReader1.readTCData(testcaseid);
		 runflag=(Boolean) testdata.get("tcexecute");
		 
		 if(runflag){
		
		 System.out.println("Running Test testcognizantMail");
		 initializeBrowser();
		 driver.findElement(
				 By.id("com.experitest.ExperiBank:id/usernameTextField"))
				 .sendKeys("company");
				 driver.findElement(
				 By.id("com.experitest.ExperiBank:id/passwordTextField"))
				 .sendKeys("company");
				 driver.findElement(By.id("com.experitest.ExperiBank:id/loginButton"))
				 .click();
	
		  }
		  else{
			  throw new SkipException("skipping test testcognizantMail");
		  }
	  }
	  
	  @Test
	  public void testRandom() throws IOException{
		  testcaseid="TC002";
		  testdata=ExcelReader1.readTCData(testcaseid);
		  runflag=(Boolean) testdata.get("tcexecute");
		  if(runflag){
			  System.out.println("Hi Man This is Random Test");
			  initializeBrowser();
		  }
		  else{
			  throw new SkipException("skipping test testRandom");  
		  }
	  }
	  
	  
}
