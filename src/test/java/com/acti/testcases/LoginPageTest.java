package com.acti.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.acti.pages.EnterTimePage;

public class LoginPageTest extends BaseTest
{	
	
	@Test(priority = 1)
	public void testLoginPageTitle()
	{
		logger = report.createTest("Test Login Page Title");
		String actual = "actiTIME - Login";
		String expected = lp.getLoginPageTitle();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		logger.pass("Actual title matched the expected");
		
	}
	
	
	@Test(priority = 2)
	public void testActiLogoDisplayed()
	{
		logger = report.createTest("Test actiTime logo");
		boolean expected = lp.acTiImgisDisplyed();
		System.out.println(expected);
		logger.pass("Acti Logo is dispalyed");
		
	}
	
	@Test(priority = 3)
	public void testActiLinkDisplayed()
	{
		logger = report.createTest("Test actiTime Link");
		boolean flag = lp.acTiImgisDisplyed();
		System.out.println(flag);
		logger.pass("ActiTime Link is Displayed");
	}
	
	@Test(priority = 4)
	public void testLoginFunction()
	{
		logger = report.createTest("Test Login Function");
		lp.enterUsername("admin");
		logger.pass("Entered the username");
		lp.enterPassword("manager");
		logger.pass("Entered the password");
		lp.clickLogin();
		logger.pass("Cliked on LoginButton");
		EnterTimePage ep = new EnterTimePage();
		String user = ep.getUserLoggedIn();
		Assert.assertTrue(user.contains("John"));
		System.out.println(user);
		logger.pass("User Logged in name contain John");
		ep.ClickLogout();
		logger.pass("Looged out from Applications");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
