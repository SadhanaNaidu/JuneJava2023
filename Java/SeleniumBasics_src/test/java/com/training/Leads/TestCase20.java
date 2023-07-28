package com.training.Leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.training.CreateOpportunities.*;

public class TestCase20 extends TestCase19{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchSF();
		loginSF();
		Leads();
	}
	
	static void Leads()
	{
		WebElement leads = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		leads.click();
		
		wait(1500);
		WebElement promptdisplayclose = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		promptdisplayclose.click();
		
		String title = driver.getTitle();
		System.out.println(title);
		WebElement leadstext1 = driver.findElement(By.xpath("//h1[@class='pageType']"));
		WebElement leadstext2 = driver.findElement(By.xpath("//h2[@class='pageDescription']"));
		String text1 = leadstext1.getText();
		String text2 = leadstext2.getText();
		System.out.println(text1+"\n"+text2);
	}

}
