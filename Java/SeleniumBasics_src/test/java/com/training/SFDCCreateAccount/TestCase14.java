package com.training.SFDCCreateAccount;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestCase14 extends TestCase13{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launchSF();
		loginSF();
		accounts();
		accountslastactivity();
	}
	static void accountslastactivity()
	{
		WebElement lastactivity = driver.findElement(By.xpath("//a[contains(text(),'Accounts with last')]"));
		lastactivity.click();
		
		WebElement datefield = driver.findElement(By.id("ext-gen20"));
		datefield.click();
		
		WebElement selectcreatedate = driver.findElement(By.xpath("//div[contains(text(),'Created Date')]"));
		selectcreatedate.click();
		
		//WebElement fromdate = driver.findElement(By.id("ext-gen152"));
		//fromdate.click();
		wait(300);
		/*
		 * List<WebElement> selecttodayfromdate =
		 * driver.findElements(By.xpath("//table[@class='x-date-inner']/tbody/tr/td"));/
		 * //to select todays for(WebElement fromdateelement:selecttodayfromdate)//to
		 * select todays date in From date(NOT WORKING) {
		 * if(fromdateelement.getText().contains("Today")) { fromdateelement.click();
		 * break; } }
		 */
		LocalDateTime LDT = LocalDateTime.now();
		DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String FDT = LDT.format(DTF);

		WebElement fromdatetoday = driver.findElement(By.id("ext-comp-1042"));
		fromdatetoday.sendKeys(FDT);
		
		//WebElement todate = driver.findElement(By.id("ext-gen154"));
		//todate.click();
		WebElement todatetoday = driver.findElement(By.id("ext-comp-1045"));
		todatetoday.clear();
		todatetoday.sendKeys(FDT);
		
		WebElement saveunsavedreport = driver.findElement(By.id("ext-gen49"));
		saveunsavedreport.click();
		
		WebElement popupreportname = driver.findElement(By.id("saveReportDlg_reportNameField"));
		popupreportname.sendKeys("New Report");
		wait(500);
		WebElement popupuniquereportname = driver.findElement(By.id("saveReportDlg_DeveloperName"));
		popupuniquereportname.clear();
		wait(500);
		popupuniquereportname.sendKeys("NewUniqueReport");
		wait(1000); 
		
		  WebElement popupsave = driver.findElement(By.id("dlgSaveReport"));
		  popupsave.click(); 
		  wait(500); 
		  WebElement runreport =  driver.findElement(By.id("ext-gen63")); 
		  runreport.click();
		  String title = driver.getTitle();
		  
		  WebElement pagetext =  driver.findElement(By.xpath("//h1[@class='noSecondHeader pageType']")); 
		 String actual = pagetext.getText();
		 String expected = "New Report";
		 Assert.assertEquals(actual, expected);
		 System.out.println(title+"\n"+actual);
		//WebElement popupsaveandrunreport = driver.findElement(By.xpath("//button[contains(text(),'Save and Run Report')]"));
		//popupsaveandrunreport.click();
		
		
	}

}
