package com.maven.sample;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static AppiumDriver driver=null;
  @Test
  public void fo() {
	  System.out.println("kumar");
	  System.out.println("kumar pucomit");
	  
//		 driver.findElement(
//				 By.id("com.experitest.ExperiBank:id/usernameTextField"))
//				 .sendKeys("company");
//				 driver.findElement(
//				 By.id("com.experitest.ExperiBank:id/passwordTextField"))
//				 .sendKeys("company");
//				 driver.findElement(By.id("com.experitest.ExperiBank:id/loginButton"))
//				 .click();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	  desiredCapabilities.setCapability("deviceName", "e9d85f8f");
	  //
	  
//	  try {
//		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
//	} catch (MalformedURLException e) {
//		// TODO Auto-generated catch block
//		
//		e.printStackTrace();
//	}
	  
  }

  @AfterTest
  public void afterTest() {
//	  driver.quit();
  }


}
