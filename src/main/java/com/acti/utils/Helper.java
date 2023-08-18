package com.acti.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper 

{
public static String captureScreen(WebDriver driver)
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String ScreenPath = "/Users/rucks/git/com.automation.actiTime/Reports/Screenshots/image.png";
	try {
		FileHandler.copy(src, new File(ScreenPath));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return ScreenPath;
	
	
}

	
}
