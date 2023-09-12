package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseStep;

public class CreateAccountPage extends BasePage{
	
	static WebDriver driver;
	public CreateAccountPage()
	{
		super(driver=BaseStep.getDriver());
		addObject("Accounts", By.linkText("Accounts"));
		addObject("Prompt", By.xpath("//a[@id='tryLexDialogX']"));
		addObject("New", By.xpath("//input[@name='new']"));
		addObject("CreateNewView", By.xpath("//a[contains(text(),'Create New')]"));
		addObject("ViewName", By.id("fname"));
		addObject("UniqueViewName", By.id("devname"));
		addObject("Save", By.xpath("//input[@name='save']"));
		addObject("ListView", By.xpath("//select[@title='View:']/option"));
		addObject("value", By.id("fcf"));
		addObject("Edit", By.xpath("//a[contains(text(),'Edit')]"));
		addObject("feild", By.id("fcol1"));
		addObject("operator", By.id("fop1"));
		addObject("Value", By.id("fval1"));
		addObject("AvailableFields", By.id("colselector_select_0"));
		addObject("Add", By.xpath("//img[@title='Add']"));
		addObject("Save", By.xpath("//input[@value=' Save ']"));
		addObject("MergeAccounts", By.xpath("//a[@href='/merge/accmergewizard.jsp?retURL=%2F001%2Fo']"));
		addObject("AccountName", By.xpath("//input[@id='srch']"));
		addObject("FindAccounts", By.xpath("//input[@value='Find Accounts']"));
		addObject("Checkbox", By.xpath("//input[@id='cid0']"));
		addObject("Next", By.xpath("//input[@value=' Next ']"));
		addObject("Merge", By.xpath("//input[@value=' Merge ']"));
		addObject("RecentlyView", By.xpath("//tr[@class='headerRow']/th"));
		addObject("lastactivity", By.xpath("//a[contains(text(),'Accounts with last')]"));
		addObject("datefield", By.id("ext-gen20"));
		addObject("datefieldValue", By.xpath("//div[contains(text(),'Created Date')]"));
		addObject("FromDate", By.id("ext-comp-1042"));
		addObject("ToDate", By.id("ext-comp-1045"));
		addObject("Save", By.id("ext-gen49"));
		addObject("ReportName", By.cssSelector("#saveReportDlg_reportNameField"));
		addObject("UniqueReportName", By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
		addObject("PopUpSave", By.id("dlgSaveReport"));
		addObject("RunReport", By.id("ext-gen63"));
		addObject("PageReportName", By.xpath("//h1[@class='noSecondHeader pageType']"));
		addObject("SaveRunRport", By.id("ext-gen282"));
	}
	

}
