package com.training.selenium;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TryXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver fire =new FirefoxDriver();
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.yahoo.com/");
		//WebElement news = driver.findElement(By.xpath("//a[@href='https://news.yahoo.com']"));
		//WebElement news =  driver.findElement(By.xpath("//a[@data-ylk='cpos:1;slk:News;elm:navcat;sec:ybar;subsec:navrail;pkgt:mid;itc:0;']"));
		
		fire.get("https://www.yahoo.com/");
		WebElement news = fire.findElement(By.xpath("//a[@data-ylk='cpos:1;slk:News;elm:navcat;sec:ybar;subsec:navrail;pkgt:mid;itc:0;']"));
		Thread.sleep(5000);
		//fire.manage().window().maximize();// maximizes the window
		news.click();
		
		
		//news.click();
		

	}

}
