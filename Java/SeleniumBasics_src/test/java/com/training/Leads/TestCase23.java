package com.training.Leads;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase23 extends TestCase22{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchSF();
		loginSF();
		Leads();
		Todaysleads();
	}
	static void Todaysleads()
	{
		WebElement todaysleads = driver.findElement(By.id("fcf"));
		todaysleads.click();
		String unread = "Today's Leads";
		List<WebElement> dropdownleads = driver.findElements(By.xpath("//select[@id='fcf']/option"));
		for(WebElement element: dropdownleads)
		{
			String text = element.getText();
			if(text.equals(unread))
			{
				System.out.println(text);
				element.click();
				break;
			}
		}
		//WebElement displaytext = driver.findElement(By.xpath("//select[@id='00BHu00000HSGom_listSelect']/option [@selected='selected']"));
		//String text = displaytext.getText();
		//System.out.println(text);

	}

}
