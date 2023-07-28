package com.training.SFDCCreateAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.training.SFDCUserMenu.TestCase9;

public class TestCase10 extends TestCase9{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launchSF();
		loginSF();
		accounts();
		newaccounts();

	}
	static void accounts()
	{
		WebElement Accounts = driver.findElement(By.linkText("Accounts"));
		Accounts.click();
		wait(2000);
		WebElement promptdisplayclose = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		promptdisplayclose.click();
	}
	static void newaccounts()
	{
		WebElement newAccounts = driver.findElement(By.xpath("//input[@name='new']"));
		newAccounts.click();
		
		WebElement promptdisplayclose = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		promptdisplayclose.click();
		
		String accountwindow = driver.getTitle();
		System.out.println(accountwindow);
		
		//input[@value='No Thanks']...nothanks button
		//a[@id='tryLexDialogX']....close button
	}

}
