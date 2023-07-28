package com.training.SFDCUserMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase8 extends TestCase7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		launchSF();
		loginSF();
		usermenu();
		devconsole();
	}
	
	static void devconsole()
	{
		WebElement dconsole = driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]"));
		dconsole.click();
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		for(String handle: driver.getWindowHandles())
		{
			driver.switchTo().window(handle);
		}
		wait(1000);
		String childid = driver.getTitle();
		System.out.println(childid);
		wait(2000);
		driver.close();
	}

}
