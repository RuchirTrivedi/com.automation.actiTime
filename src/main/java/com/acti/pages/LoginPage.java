package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.driver.DriverManager;

public class LoginPage extends DriverManager

{
//************************* Page Element ************************************

	@FindBy(id = "username")WebElement useNameField;
	@FindBy(name = "pwd") WebElement passwordField;
	@FindBy(xpath = "//div[text() = 'Login ']")WebElement LoginButton;
	@FindBy(className = "atLogoImg")WebElement ActiImg;
	@FindBy(linkText = "actiTIME Inc.")WebElement Link;
	
	
//************************* Page Initialization ******************************
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//************************* Page Action/Functions ******************************

public boolean acTiImgisDisplyed()
{
	return ActiImg.isDisplayed();
}

public String getLoginPageTitle()
{
	return driver.getTitle();
	
}
public boolean actiTimeLinkDisplayed()
{
	return Link.isDisplayed();
}

public void enterUsername(String username)
{
	useNameField.clear();
	useNameField.sendKeys(username);
}
public void enterPassword(String password)
{
	passwordField.sendKeys(password);
}
public void clickLogin()
{
	LoginButton.click();
}


}
