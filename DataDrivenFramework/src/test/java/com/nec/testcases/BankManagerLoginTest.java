package com.nec.testcases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nec.base.TestBase;

public class BankManagerLoginTest extends TestBase {

	@Test
	public void loginAsBankManager() throws InterruptedException,IOException{  
	
		
	    System.setProperty("org.uncommons.reportng.escape-output", "false");
		log.debug("Inside Login Test");
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
	//driver.findElement(By.cssSelector("div > div:last-child > .btn.btn-primary.btn-lg")).click();
		//Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))), "login is successfull");
		log.debug("Login Successfully Executed");
	
		Reporter.log("login successfully");
		Reporter.log("<a target=\"_blank\" href=\" C:\\Users\\dmrin\\OneDrive\\Pictures\\Screenshots\\Screenshot%20(67).png\">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href=\" C:\\Users\\dmrin\\OneDrive\\Pictures\\Screenshots\\Screenshot%20(67).png\"><img src=\" C:\\Users\\dmrin\\OneDrive\\Pictures\\Screenshots\\Screenshot%20(67).png\" height=200 width=200< </img> </a>");	
	}
}
