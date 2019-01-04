package com.ibm.jenkins.com.ibm.jenkins;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchRealTest {
	WebDriver driver;
	
	@Test
	public void demoTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Training\\Selenium setup files\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://realestate.hommelle.com/");
		  String s = driver.getTitle();
		  
		  String expected = "Real Estate";
		  
		  assertEquals(s, expected);
	  
	}

}
