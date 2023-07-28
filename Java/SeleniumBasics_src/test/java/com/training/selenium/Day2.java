package com.training.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;




import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Day2 {
	static WebDriver fdriver;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Launch();
		Login();
		Home();
		
	}
	
		// to launch firefox browser
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
		// checking if loginpage launched is correct or not by checking the title of the page and by checking the text from the page
		
		String title = fdriver.getTitle();
		String expected = "Selenium";
		if(expected.equals(title))
		{
		// entering values for uername and password
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
		else
		{
			System.out.println("Wrong login page launched");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fdriver.close();
		}
	}
	static void Home()
	{
		//clicking on Home tab
		WebElement home = fdriver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		home.click();
	
	}
}
		

	


