package com.training.SFDCUserMenu;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class TestCase9 extends TestCase8{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchSF();
		loginSF();
		usermenu();
		logoutSF();
	}
	
	static void logoutSF()
	{
		WebElement logout = driver.findElement(By.partialLinkText("Logout"));
		logout.click();
		String loginwindow = driver.getTitle();
		System.out.println(loginwindow);
	}
	
	

}
