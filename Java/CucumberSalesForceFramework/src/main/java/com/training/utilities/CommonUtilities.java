package com.training.utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {
	
	public String getproperty(String key) throws IOException
	{
		String path = "C:\\Users\\User\\eclipse-workspace\\JavaBasic\\CucumberSalesForceFramework\\properties\\application.properties";
		FileInputStream fileinput = null;
		fileinput = new FileInputStream(path);
		Properties prop = new Properties();
		try {
			prop.load(fileinput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String value = prop.getProperty(key);
		return value;
		
	}
	
	

}
