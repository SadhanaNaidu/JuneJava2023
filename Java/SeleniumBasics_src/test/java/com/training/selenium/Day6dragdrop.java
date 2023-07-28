package com.training.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver fdriver = new FirefoxDriver();
		fdriver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement imageframe = fdriver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		fdriver.switchTo().frame(imageframe);
		
		
		WebElement imagefrom = fdriver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement imageto = fdriver.findElement(By.id("trash"));
		Actions selectimage1 = new Actions(fdriver);
		selectimage1.dragAndDrop(imagefrom,imageto).build().perform();
		
		
	}

}
