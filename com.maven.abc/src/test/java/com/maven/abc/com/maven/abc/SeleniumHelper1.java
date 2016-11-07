package com.maven.abc.com.maven.abc;

import org.testng.annotations.AfterMethod;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class SeleniumHelper1 {

	public static AppiumDriver driver=null;
	

	// ********************* BEFORE   SECTION    ****************************
	
	public void initializeBrowser(){
		
		String projectPath=System.getProperty("user.dir");
		System.out.println("user.dir is :"+projectPath);
		
	
	    try {
	    	
	    	DesiredCapabilities capabilities=new DesiredCapabilities();
	    	capabilities.setCapability("deviceName", "device");
			driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
    @BeforeMethod()	
	public void getData(){
    	System.out.println("beforemethod");
    	
    	}
	
	
	// ********************* AFTER   SECTION    ****************************
	
	
	@AfterMethod(alwaysRun = true)
	  public void tearDown() throws Exception {
		
		if(Example1.runflag){
			driver.quit();
		}
	
	  }
	
}
