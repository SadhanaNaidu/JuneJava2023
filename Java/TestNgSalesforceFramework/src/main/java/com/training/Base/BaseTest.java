package com.training.Base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.Utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	CommonUtilities common = new CommonUtilities();
	
	
	public WebDriver getDriver()
	{
		if(driver==null)
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	public String getvalue(String key) 
	{
		
		String value = common.getProperty(key);
		return value;
	}
	
	public void takescreenshot(WebDriver driver)
	{
		TakesScreenshot screenshot = ((TakesScreenshot)driver); //creating object of  Interface TakesScreenshot
		File srcfile = screenshot.getScreenshotAs(OutputType.FILE);//takes screenshot and is stored in a file object srcfile
		Date currentDate = new Date(); //create date object
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(currentDate);//format the currentDate and pass it as String object
		String filepath = "C:\\Users\\User\\eclipse-workspace\\JavaBasic\\TestNgSalesforceFramework\\screenshots\\screenshot"+timestamp+".jpeg";//path to store screenshot
		File destfile = new File(filepath);//converts string object(filepath) to type File
		
		try {
			FileUtils.copyFile(srcfile, destfile); //copies srcfile(Selenium screenshot) content to destfile(physical file)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
		
		
	}
	
	

}
