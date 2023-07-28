package com.training.SFDCUserMenu;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.training.SFDCLogin.TestCase2;

import junit.framework.Assert;

public class TestCase5 extends TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchSF();
		loginSF();
		usermenu();
		validateusermenu();
		
		
	}
	
	static void usermenu()
	{
		WebElement username = driver.findElement(By.id("userNavLabel"));
		username.click();
	}
	static void validateusermenu()
	{
		WebElement myprofile = driver.findElement(By.xpath("//a[@title='My Profile']"));
		String actualprofile = myprofile.getText();
		String expectedprofile = "My Profile";
		//Assert.assertEquals(expectedprofile, actualprofile);//junit.framework.assert
		assertEquals(actualprofile, expectedprofile);//testng.assert
		System.out.println(actualprofile);
		
		WebElement mysettings = driver.findElement(By.xpath("//a[@title='My Settings']"));
		String actualsettings = mysettings.getText();
		String expectedsettings = "My Settings";
		//Assert.assertEquals(expectedsettings, actualsettings);//junit.framework.assert
		assertEquals(actualsettings, expectedsettings);//testng.assert
		System.out.println(actualsettings);
		
		WebElement devconsole = driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']"));
		String actualdevconsole = devconsole.getText();
		String expecteddevconsole = "Developer Console";
		//Assert.assertEquals(expecteddevconsole, actualdevconsole);//junit.framework.assert
		assertEquals(actualdevconsole, expecteddevconsole);//testng.assert
		System.out.println(actualdevconsole);
		
		WebElement lightexp = driver.findElement(By.xpath("//a[@title='Switch to Lightning Experience']"));
		String actuallightexp = lightexp.getText();
		String expectedlightexp = "Switch to Lightning Experience";
		//Assert.assertEquals(expectedlightexp, actuallightexp);//junit.framework.assert
		assertEquals(actuallightexp, expectedlightexp);//testng.assert
		System.out.println(actuallightexp);
		
		WebElement logout = driver.findElement(By.xpath("//a[@title='Logout']"));
		String actuallogout = logout.getText();
		String expectedlogout = "Logout";
		//Assert.assertEquals(expectedlogout, actuallogout);//junit.framework.assert
		assertEquals(actuallogout, expectedlogout);//testng.assert
		System.out.println(actuallogout);
	}

}
