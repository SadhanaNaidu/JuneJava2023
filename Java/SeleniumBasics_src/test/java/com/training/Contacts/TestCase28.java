package com.training.Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase28 extends TestCase27{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchSF();
		loginSF();
		Contacts();
		Mycontacts();
	}
	static void Mycontacts()
	{
		WebElement mycontacts = driver.findElement(By.id("fcf"));
		Select select = new Select(mycontacts);
		select.selectByVisibleText("My Contacts");
		
		WebElement gobutton = driver.findElement(By.xpath("//input[@title='Go!']"));
		gobutton.click();
		
		WebElement validate = driver.findElement(By.xpath("//select/option[@selected='selected'] "));
		String text = validate.getText();
		System.out.println(text);
	}
}
