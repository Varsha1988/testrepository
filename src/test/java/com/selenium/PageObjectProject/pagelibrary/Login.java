package com.selenium.PageObjectProject.pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.PageObjectProject.testbase.testBase;

public class Login extends testBase {
	
	
	By Createaccountemailadrs = By.id("email_create");
	By Createbutton = By.id("SubmitCreate");
	

	public void createemailadr (String emailaddress) {
		
		driver.findElement(this.Createaccountemailadrs).sendKeys(emailaddress);
		
	}
	
	public void CreateEmailbutton () {
		
		driver.findElement(this.Createbutton).click();
		
	}
	
	
	
}
