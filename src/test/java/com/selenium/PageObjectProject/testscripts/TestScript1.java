package com.selenium.PageObjectProject.testscripts;

import org.testng.annotations.Test;

import com.selenium.PageObjectProject.pagelibrary.Login;
import com.selenium.PageObjectProject.testbase.testBase;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class TestScript1 extends testBase{
	
	String emailaddress = "test@gmail.com";
	
  @Test
  public void Signin() throws InterruptedException {
	  Login login =new Login();
	  
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	  Thread.sleep(2000);
	  
	  login.createemailadr(emailaddress);
	  login.CreateEmailbutton();
	  Thread.sleep(5000);
	  
 }
  @BeforeClass
  public void beforeClass() throws IOException {
	  init();
  }
  


  @AfterClass
  public void afterClass() {
	  exitbrowser();
  }

}
