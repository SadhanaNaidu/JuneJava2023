package com.training.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.Base.BasePage;

public class OppurtunitiesPage extends BasePage{

	public OppurtunitiesPage(WebDriver driver) 
	{
		super(driver);
		
	}

	@FindBy(id="username")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="Login")
	WebElement LoginButton;
	
	@FindBy(xpath="//a[@title='Opportunities Tab']")
	WebElement oppurtunities;
	
	@FindBy(xpath="//a[@id='tryLexDialogX']")
	WebElement prompt;
	
	@FindBy(id="fcf")
	List<WebElement> oppurtunitiesdropdown;
	
	@FindBy(xpath="//input[@name='new']")
	WebElement createnew;
	
	@FindBy(id="opp3")
	WebElement newopp;
	
	@FindBy(id="opp4")
	WebElement accountname;
	
	@FindBy(id="opp9")
	WebElement date;
	
	@FindBy(id="calMonthPicker")
	WebElement selectmonth;
	
	@FindBy(id="calYearPicker")
	WebElement selectyear;
	
	@FindBy(xpath="//tr[@id='calRow5']/td[3]")
	WebElement selectdate;
	
	@FindBy(id="opp11")
	WebElement stage;
	
	@FindBy(id="opp12")
	WebElement probability;
	
	@FindBy(id="opp6")
	WebElement leadsource;
	
	@FindBy(xpath="//input[@tabindex='18']")
	WebElement Save;
	
	@FindBy(xpath="//h2[@class='pageDescription']")
	WebElement text;
	
	@FindBy(xpath="//a[contains(text(),'Opportunity Pipeline')]")
	WebElement pipeline;
	
	@FindBy(xpath="//h1[contains(text(),'Opportunity Pipeline')]")
	WebElement pagetextPipe;
	
	@FindBy(xpath="//a[contains(text(),'Stuck Opportunities')]")
	WebElement stuckoppurlink;
	
	@FindBy(xpath="//h1[contains(text(),'Stuck Opportunities')]")
	WebElement pagetextStuck;
	
	@FindBy(id="quarter_q")
	WebElement interval;
	
	@FindBy(id="open")
	WebElement include;
	
	@FindBy(xpath="//h1[contains(text(),'Opportunity Report')]")
	WebElement pagetext;
	
	public void EnterintoUserName(String username)
	{
		UserName.sendKeys(username);
	}
	
	public void EnterintoPassword(String password)
	{
		Password.sendKeys(password);
	}
	public void ClickonLoginButton() 
	{ 
	  LoginButton.click(); 
	}

	public void ClickonOppurtunities() 
	{
		oppurtunities.click();
		wait(2000);
		prompt.click();
	}
	public void wait(int n)
	{
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ClickonViewDropdown() 
	{
		for(WebElement dropdown:oppurtunitiesdropdown)
		{
			String text = dropdown.getText();
			System.out.println(text);
		}
	}

	public void ClickOnNew() 
	{
		createnew.click();
	}

	public void EnterMandateDetails()
	{
		
		((JavascriptExecutor)driver).executeScript("arguments[0].value='Oppurtunities3';",newopp);//alternate way for entering value instead of SendKeys
		//should parameterize
		accountname.sendKeys("Naidu");
		date.click();
		Select selectMM = new Select(selectmonth);
		selectMM.selectByValue("11");//should parameterize
		
		Select selectYY = new Select(selectyear);
		selectYY.selectByValue("2024");
		
		selectdate.click();
		
		Select selectstage = new Select(stage);
		selectstage.selectByValue("Qualification");
		
		probability.clear();
		probability.sendKeys("90");
		
		Select selectleadsource = new Select(leadsource);
		selectleadsource.selectByValue("Web");
	}

	public void SaveandValidate()
	{
		Save.click();
		String title = driver.getTitle();
		System.out.println(title);
		String pagetext =  text.getText();
		System.out.println(pagetext);
	}

	public void ClickOnOppurtunityPipeLineandValidate() 
	{
		pipeline.click();
		String title = driver.getTitle();
		String text = pagetextPipe.getText();
		System.out.println(title+"\n"+text);
	}

	public void ClickOnStuckOppurtunitiesandValidate()
	{
		stuckoppurlink.click();
		String title = driver.getTitle();
		String text = pagetextStuck.getText();
		System.out.println(title+"\n"+text);
	}

	public void CheckQuarterlySummary()
	{
		Select Interval = new Select(interval);
		Interval.selectByVisibleText("Current and Next FQ");
		
		Select Include = new Select(include);
		Include.selectByVisibleText("All Opportunities");
		
		WebElement runreport = driver.findElement(By.xpath("//input[@title='Run Report']"));
		runreport.click();
		
		String title = driver.getTitle();
		String text = pagetext.getText();
		System.out.println(title+"\n"+text);
	}
	
	
	
}
