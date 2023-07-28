package com.training.Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TestCase29 extends TestCase28{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchSF();
		loginSF();
		Contacts();
		Viewcontactpage();
		
	}
	static void Viewcontactpage()
	{
		wait(5000);
		WebElement contactpage = driver.findElement(By.xpath("//table[@class='list']/tbody/tr[8]/th[1]"));//doesnt work if tr value is parameterized
		//Select select = new Select(contactpage);
		//select.selectByIndex(8);
		contactpage.click();
		//contactpage.click();
		
		WebElement pageheader = driver.findElement(By.xpath("//h2[@class='topName'] "));
		String text = pageheader.getText();
		String title = driver.getTitle();
		System.out.println(title+"\n"+text);
	}
}
