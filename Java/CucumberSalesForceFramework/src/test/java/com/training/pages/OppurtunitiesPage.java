package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseStep;

public class OppurtunitiesPage extends BasePage{

	static WebDriver driver;
	public OppurtunitiesPage()
	{
		super(driver=BaseStep.getDriver());
		addObject("Oppurtunities", By.xpath("//a[@title='Opportunities Tab']"));
		addObject("Prompt", By.xpath("//a[@id='tryLexDialogX']"));
		addObject("OppViewList", By.xpath("//select[@id='fcf']/option"));
		addObject("New", By.xpath("//input[@name='new']"));
		addObject("OppName", By.id("opp3"));
		addObject("AccName", By.id("opp4"));
		addObject("CloseDateField", By.id("opp9"));
		addObject("SelectMonth", By.id("calMonthPicker"));
		addObject("SelectYear", By.id("calYearPicker"));
		addObject("Date", By.xpath("//tr[@id='calRow5']/td[3]"));
		addObject("Stage", By.id("opp11"));
		addObject("Probability", By.id("opp12"));
		addObject("LeadSource", By.id("opp6"));
		addObject("Save", By.xpath("//input[@tabindex='18']"));
		addObject("OppurtunityPipeline", By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
		addObject("PipeLinePageText", By.xpath("//h1[contains(text(),'Opportunity Pipeline')]"));
		addObject("StuckOppurtunity", By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
		addObject("StuckOppurtunityText", By.xpath("//h1[contains(text(),'Stuck Opportunities')]"));
		addObject("Interval", By.id("quarter_q"));
		addObject("Include", By.id("open"));
		addObject("RunReport", By.xpath("//input[@title='Run Report']"));
	}
	
	

}
