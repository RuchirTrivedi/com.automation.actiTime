package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.driver.DriverManager;

public class TaskPage extends DriverManager

{
	//************************* Page Elements ******************************
	
	@FindBy(className = "content tasks") WebElement tasklink;
	@FindBy(className = "title ellipsis") WebElement addnewbutton;
	@FindBy(className = "item createNewCustomer") WebElement createnewCustomer;
	@FindBy(xpath = "//input[@placeholder='Enter Customer Name']") WebElement EnterCustomername;
	@FindBy(className = "textarea") WebElement DescText;
	@FindBy(className = "emptySelection") WebElement CompanyButton;
	@FindBy(className = "components_button_label") WebElement createButton;
	
	//************************* Page Initialization ******************************
	
		public TaskPage()
		{
			PageFactory.initElements(driver, this);
		}
	
    //************************* Page Action/Functions ******************************


		public void clickTaskLink()
		{
			tasklink.click();
		}
		public void clickAddNew()
		{
			addnewbutton.click();
		}
		public void addNewCustomer()
		{
			createnewCustomer.click();
		}
		public void enterName(String Custname)
		{
			EnterCustomername.sendKeys(Custname);
		}
		public void enterDesc(String Desc)
		{
			DescText.sendKeys(Desc);
		}
	
		public void comButton()
		{
			CompanyButton.click();
		}
		
		public void createCustomer()
		{
			createButton.click();
		}
		
}
