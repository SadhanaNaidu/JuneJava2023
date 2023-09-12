package com.training.Base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BasePage {

	protected WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver = driver;
		//page factory initialization
		PageFactory.initElements(driver, this);
	}
	
	

}
