package com.selenium.PageObjectProject.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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

public void init() throws IOException {
	
	File file = new File("/Users/varshagupta1/Documents/testrepo/src/test/java/com/selenium/PageObjectProject/config/config.properties");
	FileInputStream fileInput = new FileInputStream(file);
	
	Properties prop = new Properties();
	prop.load(fileInput);
	
	if(prop.getProperty("Browser").equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "/Users/varshagupta1/eclipse-workspace/project1/chromedriver");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
	}
	
	else {
		System.out.println("Browser not chrome");
	}
	
}

public void exitbrowser() {
	
	driver.close();
	
}

}
