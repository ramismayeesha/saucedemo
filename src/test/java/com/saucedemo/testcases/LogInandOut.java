package com.saucedemo.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.saucedemo.base.TestBase;

public class LogInandOut extends TestBase{

	@BeforeTest
	public static void login() {
		sendKeys(By.xpath(OR.getProperty("USERNAME_BUTTON")), OR.getProperty("USERNAME"));
		sendKeys(By.xpath(OR.getProperty("PASSWORD_BUTTON")), OR.getProperty("PASSWORD"));
		clickBy(By.xpath(OR.getProperty("LOGIN_BUTTON")));
	
	}

	@AfterTest
	public static void logout () {
		
	}
	
}
