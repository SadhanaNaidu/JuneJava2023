package com.training.Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase31 extends TestCase30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		launchSF();
		loginSF();
		Contacts();
		CancelCreateView();
	}
	
	static void CancelCreateView()
	{
		WebElement createnewview = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		createnewview.click();
		wait(500);
		WebElement viewname = driver.findElement(By.id("fname"));
		viewname.sendKeys("ABCD");
		
		WebElement uniqueviewname = driver.findElement(By.id("devname"));
		uniqueviewname.click();//clicking because SF generates the uniwue name
		
		WebElement cancel = driver.findElement(By.xpath("//input[@title='Cancel']"));
		cancel.click();
		String title = driver.getTitle();
		String actual = driver.findElement(By.xpath("//h2[@class='pageDescription']")).getText();
		System.out.println(title+"\n"+actual);
	}
}
