package com.training.Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase27 extends TestCase26{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchSF();
		loginSF();
		Contacts();
		Recentlycreatedcontact();
		
	}
	static void Recentlycreatedcontact()
	{
		WebElement recent = driver.findElement(By.id("hotlist_mode"));
		Select select = new Select(recent);
		select.selectByVisibleText("Recently Created");
		
		WebElement textdisplayed = driver.findElement(By.xpath("//h3[contains(text(),'Recent')]"));
		String text = textdisplayed.getText();
		System.out.println(text);
	}

}
