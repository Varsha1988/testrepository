package com.selenium.PageObjectProject.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBase {
	
public static WebDriver driver;


public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}

public void init() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/varshagupta1/eclipse-workspace/project1/chromedriver");
	 driver = new ChromeDriver();
	 driver.get("http://automationpractice.com/");
	 driver.manage().window().maximize();
	
}

public void exitbrowser() {
	
	driver.close();
	
}

}
