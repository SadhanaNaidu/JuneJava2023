package com.training.RandomScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestCase36 extends TestCase35{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchSF();
		loginSF();
		Hometab();
		Eventcalendar();
	}
	
	static void Eventcalendar()
	{
		WebElement currentdate = driver.findElement(By.xpath("//a[@href='/00U/c?md3=208&md0=2023']"));
		currentdate.click();
		
		String pagetext = driver.findElement(By.className("pageType")).getText();
		System.out.println(pagetext);
		
		WebElement eightpm = driver.findElement(By.id("p:f:j_id25:j_id61:28:j_id64"));
		eightpm.click();
		String pageheader1 = driver.findElement(By.className("pageType")).getText();
		String pageheader2 = driver.findElement(By.className("pageDescription")).getText();
		System.out.println(pageheader1+" : "+pageheader2);
		
		WebElement subjectcombo = driver.findElement(By.xpath("//a[@title='Combo (New Window)']"));
		subjectcombo.click();
		
		String parentwindow = driver.getWindowHandle();
		for(String handle:driver.getWindowHandles())
		{
			if(!parentwindow.equals(handle))
			{
				driver.switchTo().window(handle);
			}
		}
		System.out.println(driver.getTitle());
	
		WebElement other = driver.findElement(By.xpath("//a[contains(text(),'Other')]"));
		other.click();
		
		driver.switchTo().window(parentwindow);
		
		WebElement endtime = driver.findElement(By.id("EndDateTime_time"));
		endtime.click();
		
		WebElement selectendtime = driver.findElement(By.xpath("//div[@id='timePickerItem_42']"));
		selectendtime.click();
		
		WebElement save = driver.findElement(By.xpath("//input[@name='save']"));
		save.click();
		
		WebElement othereightpm = driver.findElement(By.xpath("//span[@class='event_00UHu000019rXVZ']"));
		Actions action = new Actions(driver);
		action.moveToElement(othereightpm).build().perform();
		String alertext = driver.switchTo().alert().getText();
		System.out.println(alertext);
	}

}
