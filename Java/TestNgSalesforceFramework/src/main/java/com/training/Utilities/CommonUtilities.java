package com.training.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {

	

	public String getProperty(String key)  {
		// TODO Auto-generated method stub
		
		String spath = "C:\\Users\\User\\eclipse-workspace\\JavaBasic\\TestNgSalesforceFramework\\Properties\\application.properties";
		FileInputStream fileinput = null;
		try {
			fileinput = new FileInputStream(spath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties property = new Properties();//throws exception and all calling methods should have throw exception, hence putting in try-catch method
		try {
			property.load(fileinput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		String value = property.getProperty(key);
		return value;
		
	}

}
