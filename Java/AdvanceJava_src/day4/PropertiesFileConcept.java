package day4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileConcept {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//1. defining path of file to read
		String spath = "C:\\Users\\User\\eclipse-workspace\\JavaBasic\\TestingPropertyFile.txt";
		
		// 2. create object of FileInputStream and load the object with filepath
		FileInputStream fileinput = new FileInputStream(spath);
		
		//3/ Create object of Property class
		Properties property = new Properties();
		
		//4. load the Object of FileInputStream to properties
		property.load(fileinput); //add throws Exception
		
		//5. fetch data from property file
		System.out.println(property.get("url"));
		
	}

}
