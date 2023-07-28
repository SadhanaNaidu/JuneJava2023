package com.training.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8Calculator {

	static WebDriver fdriver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Launch();
		Login();
		calculator();
		calculatoradd();
	}
	
		
		
		static void Launch()
		{
			WebDriverManager.firefoxdriver().setup();
			fdriver = new FirefoxDriver();
			fdriver.get("https://selenium-prd.firebaseapp.com/");
			try {
				Thread.sleep(10000);//wait time for further excution 10sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		static void Login() 
		{
			WebElement userid = fdriver.findElement(By.id("email_field"));
			userid.sendKeys("admin123@gmail.com");
			WebElement password = fdriver.findElement(By.id("password_field"));
			password.sendKeys("admin123");
			
			// clicking on button login
			WebElement loginbutton = fdriver.findElement(By.xpath("//button[@onclick='login()']"));
			loginbutton.click();
			try {
				Thread.sleep(5000);//adding sleep for 5 sec for the page to load fully, otherwise we might get " org.openqa.selenium.ElementNotInteractableException: "
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		static void calculator()
		{
			WebElement calc = fdriver.findElement(By.xpath("//a[contains(text(),'Calculator')]"));
			//Actions action = new Actions(fdriver);
			//action.moveToElement(calc).build().perform();
			calc.click();
		}
		static void calculatoradd() 
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement num1 = fdriver.findElement(By.xpath("//input[@value='2']"));
			num1.click();
			WebElement oppplus = fdriver.findElement(By.xpath("//input[@value='+']"));
			oppplus.click();
			WebElement num2 = fdriver.findElement(By.xpath("//input[@value='3']"));
			num2.click();
			WebElement oppequals = fdriver.findElement(By.xpath("//input[@value='=']"));
			oppequals.click();
			WebElement display = fdriver.findElement(By.id("display"));
			String value = display.getAttribute("value");
			System.out.println(value);
		}
				
			
	}


