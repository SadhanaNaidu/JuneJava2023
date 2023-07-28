package com.training.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> tableheader = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		for(WebElement element: tableheader)
		{
			//System.out.println(element.getText());
		}
		
		List<WebElement> tablecontent = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));//fetching allrow first column data
		for(WebElement element: tablecontent)
		{
			System.out.println(element.getText());
		}
	}

}
