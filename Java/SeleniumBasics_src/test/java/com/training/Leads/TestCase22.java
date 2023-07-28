package com.training.Leads;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase22 extends TestCase21{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launchSF();
		loginSF();
		Leads();
		Unreadleads();
		LogoutSF();
		wait(500);
		loginSF();
		Leadswithoutprompt();
		leadsgo();
	}

	static void Unreadleads()
	{
		WebElement unreadleads = driver.findElement(By.id("fcf"));
		unreadleads.click();
		String unread = "My Unread Leads";
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

	}
	static void leadsgo()
	{
		WebElement gobutton = driver.findElement(By.xpath("//input[@title='Go!']"));
		gobutton.click();
		wait(100);
		//WebElement selectedleadvalue = driver.findElement(By.id("00BHu00000HSGoY_listSelect"));
		//String value = selectedleadvalue.getText();
		String title = driver.getTitle();
		System.out.println(title);
		WebElement displayselectedleadtext = driver.findElement(By.xpath("//select[@id='00BHu00000HSGom_listSelect']/option [@selected='selected']"));
		String text = displayselectedleadtext.getText();
		System.out.println(text);
		
	}
	static void Leadswithoutprompt()
	{
		WebElement leads = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		leads.click();
	}
}
