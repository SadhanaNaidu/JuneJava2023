package com.training.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseStep {

	public static WebDriver driver;
	static CommonUtilities common = new CommonUtilities();
	static String url;
	public static void launchapplication() 
	{
		driver = getDriver();
		
			try {
				url = common.getproperty("url");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		driver.get(url);
	}
	
	public static WebDriver getDriver()
	{
		if(driver==null)
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
		return driver;
	}

}
