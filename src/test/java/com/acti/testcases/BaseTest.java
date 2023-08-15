package com.acti.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.acti.driver.DriverManager;
import com.acti.pages.LoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest extends DriverManager 
{
	
	protected static ExtentSparkReporter extent;
	protected static ExtentReports report;
	protected static ExtentTest logger;
	LoginPage lp;
	


	@BeforeSuite
	public void setUpReport()
	{
		extent = new ExtentSparkReporter("./Reports/actiindex.html");
		report = new ExtentReports();
		report.attachReporter(extent);
		
	}


	@BeforeMethod
	public void PreTest()
	{
		initApplication();
	    lp = new LoginPage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		report.flush();
		quitBrowser();
	}
}
