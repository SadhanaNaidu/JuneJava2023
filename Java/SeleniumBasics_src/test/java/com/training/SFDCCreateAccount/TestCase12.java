package com.training.SFDCCreateAccount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase12 extends TestCase11{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		launchSF();
		loginSF();
		accounts();
		editview("SadhanaMe", "Account Name", "contains");
	}

	static void editview(String Viewname, String Field, String Operator)
	{
		WebElement listview = driver.findElement(By.id("fcf"));
		listview.click();
		Select view = new Select(listview);
		view.selectByVisibleText(Viewname);
		
		/*
		 * List<WebElement> ViewList =
		 * driver.findElements(By.xpath("//select[@title='View:']/option"));
		 * for(WebElement element:ViewList) {
		 * if(element.getText().equalsIgnoreCase(Viewname)) { element.click(); break; }
		 * }
		 */
		WebElement editview = driver.findElement(By.xpath("//a[contains(text(),'Edit')]"));
		editview.click();
		
		WebElement viewname = driver.findElement(By.id("fname"));
		viewname.clear();
		wait(100);
		viewname.sendKeys(Viewname+" New");
		
		WebElement field = driver.findElement(By.id("fcol1"));
		field.click();
		Select fieldview = new Select(field);
		fieldview.selectByVisibleText(Field);
		
		WebElement operator = driver.findElement(By.id("fop1"));
		operator.click();
		Select operatordropdown = new Select(operator);
		operatordropdown.selectByVisibleText(Operator);
		
		//WebElement value = driver.findElement(By.id("fval1"));// not able to select value a 
		//value.click();
		//Select selectvalue = new Select(value);
		//selectvalue.selectByVisibleText("a");
		
		List<WebElement> AvailableFields = driver.findElements(By.xpath("//select[@id='colselector_select_0']/option"));
		for(WebElement AF: AvailableFields)
		{
			if(AF.getText().equalsIgnoreCase("Last Activity")) 
			{ 
				AF.click(); 
				break; 
			}
		}
		//Select LastActivity = new Select(AvailableFields);
		//LastActivity.selectByVisibleText("Last Activity");
		
		WebElement add = driver.findElement(By.xpath("//img[@title='Add']"));
		add.click();
		
		WebElement save = driver.findElement(By.xpath("//input[@value=' Save ']"));
		save.click();
		
		WebElement getvalue = driver.findElement(By.xpath("//option[@selected='selected']"));
		String value = getvalue.getText();
		System.out.println("Edited view name: "+value);
	}
	
}
