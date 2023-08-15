package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.driver.DriverManager;

public class EnterTimePage extends DriverManager
{
	//************************* Page Elements ******************************
	
	@FindBy(id = "logoutLink") WebElement logoutLink;
	@FindBy(xpath = "//a[@class='userProfileLink username ']") WebElement userprofileText;
	
	//************************* Page Initialization ******************************
	
	public EnterTimePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//************************* Page Action/Functions ******************************

	public String getUserLoggedIn()
	{
		return userprofileText.getText();
	}
	
	public String getEnterpageTitle()
	{
		return driver.getTitle();
	}
	
	public void ClickLogout()
	{
		logoutLink.click();
	}
	
}
