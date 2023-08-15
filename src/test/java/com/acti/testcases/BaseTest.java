package com.acti.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.driver.DriverManager;
import com.acti.pages.LoginPage;

public class BaseTest extends DriverManager 
{
LoginPage lp;
	
	@BeforeMethod
	public void PreTest()
	{
		initApplication();
	    lp = new LoginPage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		quitBrowser();
	}
}
