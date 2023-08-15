package com.acti.driver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Script : DriverManger
 * Description: This Class Manages all the driver instance and also a parent class for other driver classes which uses driver
 * Developed By: Ruchir Trivedi
 * Approved By: Ruchir Trivedi
 * Developed Date: 2023-08-08
 * 
 */



public class DriverManager 
{

	public static WebDriver driver;
	Properties prop;
	
/*
 * DriverManager: Constructor to Load to the properties file	
 */
	
	public DriverManager()
	{
		try
		{
			File file = new File("./src/test/resources/config/config.properties");
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
			
		}
		catch(Exception e)
		{
			System.out.println("unable to load the properties file "+e.getMessage());
            e.printStackTrace();
		}
	}
	
	/*
	 * InitApplication method to get the browser properties file value and lunch the browsers accordingly
	 */

	public void initApplication()
	{
		String browser = prop.getProperty("browser");
		System.out.println("Browser Selected "+browser);
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		else 
		{
			System.out.println("browser not supported, please check the config.propertise file");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
		getAppURL();
	}
	
	public void getAppURL()
	{
		String url = prop.getProperty("url");
		driver.get(url);
	}
	
	public void quitBrowser()
	{
		driver.close();
	}
	
}
