package com.training.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.testng.annotations.AfterSuite;
import com.training.Base.BaseTest;
import com.training.Pages.CreateAccountPage;


public class CreateAccountTest extends BaseTest{

	static WebDriver driver;
	String url;
	CreateAccountPage createaccountpage;
	String username, password;
	String Viewname, UniqueViewname;
	String EditViewName;
	String EditView;
	String Field,Operator,Value;
	String AccountName, Name1, UniqueName1;
	
	
	@BeforeMethod
	public void Beforemethod()
	{
		driver = getDriver();
		url = getvalue("qaurl");
		driver.get(url);
		createaccountpage = new CreateAccountPage(driver);
		driver.manage().window().maximize();
		username = getvalue("username");
		password = getvalue("password");
		Viewname = getvalue("Viewname");
		UniqueViewname = getvalue("UniqueViewname");
		EditViewName = getvalue("EditViewName");
		EditView = getvalue("EditView");
		Field = getvalue("Field");
		Operator = getvalue("Operator");
		Value = getvalue("Value");
		AccountName=getvalue("AccountName");
		Name1=getvalue("Name1");
		UniqueName1=getvalue("UniqueName1");
	}
	
	
	@Test
	public void CreateAccount()
	{
		
		createaccountpage.EnterintoUserName(username);
		createaccountpage.EnterintoPassword(password);
		createaccountpage.ClickonLoginButton();
		createaccountpage.ClickonAccounts();
		createaccountpage.ClickonNewAccount();
		
	}
	
	@Test
	public void CreateNewView()
	{
		createaccountpage.EnterintoUserName(username);
		createaccountpage.EnterintoPassword(password);
		createaccountpage.ClickonLoginButton();
		createaccountpage.ClickonAccounts();
		createaccountpage.ClickonCreateNewView();
		createaccountpage.EnterViewName(Viewname);
		createaccountpage.EnterViewUniqueName(UniqueViewname);
		createaccountpage.ClickonSave();
	}
	
	@Test
	public void EditView()
	{
		createaccountpage.EnterintoUserName(username);
		createaccountpage.EnterintoPassword(password);
		createaccountpage.ClickonLoginButton();
		createaccountpage.ClickonAccounts();
		createaccountpage.Selectviewfromdropdown(EditViewName);
		createaccountpage.ClickonEdit();
		createaccountpage.EditView(EditView);
		createaccountpage.SetFieldOperatorValue(Field,Operator,Value);
		createaccountpage.AddLastActivitytoSelectedfromAvailable();
		createaccountpage.SavetheChanges();
	}
	
	
	@Test
	public void MergeAccounts()
	{
		createaccountpage.EnterintoUserName(username);
		createaccountpage.EnterintoPassword(password);
		createaccountpage.ClickonLoginButton();
		createaccountpage.ClickonAccounts();
		createaccountpage.ClickonMergeAccounts();
		createaccountpage.WriteAccountName(AccountName);
		createaccountpage.ClickonFindAccounts();
		createaccountpage.UncheckThirdelement();
		createaccountpage.ClickonNextButton();
		createaccountpage.ClickonMergeButton();
		createaccountpage.ClickOKonAlertMessage();
	}
	
	
	@Test
	public void AccountReport()
	{
		createaccountpage.EnterintoUserName(username);
		createaccountpage.EnterintoPassword(password);
		createaccountpage.ClickonLoginButton();
		createaccountpage.ClickonAccounts();
		createaccountpage.SelectLastActivity();
		createaccountpage.SelectCreatedDateFromDateField();
		createaccountpage.SetFromandToDatetoTodaysDate();
		createaccountpage.ClickOnSaveButton();
		createaccountpage.EnterReportUniqueReportNameinPopUp(Name1, UniqueName1);
		createaccountpage.ClickSaveandRunReport();
		createaccountpage.CheckforReportNameafterSaving(Name1);
		
	}
	
	
	
/*	 @AfterSuite() 
	  public void aftermethod() 
	  { 
		  driver.quit(); 
		  driver=null; 
	  }*/
}
