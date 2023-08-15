package com.acti.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.acti.pages.EnterTimePage;

public class LoginPageTest extends BaseTest
{	
	
	@Test(priority = 1)
	public void testLoginPageTitle()
	{
		
		String expected = lp.getLoginPageTitle();
		System.out.println(expected);
		
	}
	
	
	@Test(priority = 2)
	public void testActiLogoDisplayed()
	{
		boolean expected = lp.acTiImgisDisplyed();
		System.out.println(expected);
	}
	
	@Test(priority = 3)
	public void testActiLinkDisplayed()
	{
		boolean flag = lp.acTiImgisDisplyed();
		System.out.println(flag);
		
	}
	
	@Test(priority = 4)
	public void testLoginFunction()
	{
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLogin();
		EnterTimePage ep = new EnterTimePage();
		String user = ep.getUserLoggedIn();
		Assert.assertTrue(user.contains("John"));
		ep.ClickLogout();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
