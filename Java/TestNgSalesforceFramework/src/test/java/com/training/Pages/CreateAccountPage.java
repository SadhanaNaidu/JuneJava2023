package com.training.Pages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.training.Base.BasePage;

public class CreateAccountPage extends BasePage{

	public CreateAccountPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	
	@FindBy(id="username")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="Login")
	WebElement LoginButton;
	
	@FindBy(id="userNavLabel")
	WebElement Username;
	
	@FindBy(linkText="Accounts")
	WebElement Accounts;
	
	@FindBy(xpath="//a[@id='tryLexDialogX']")
	WebElement promptdisplayclose;
	
	@FindBy(xpath="//input[@name='new']")
	WebElement NewAccounts;
	
	@FindBy(xpath="//a[contains(text(),'Create New')]")
	WebElement CreateNewView;
	
	@FindBy(id="fname")
	WebElement ViewName;
	
	@FindBy(id="devname")
	WebElement UniqueViewName;
	
	@FindBy(xpath="//input[@name='save']")
	WebElement SaveView;
	
	@FindBy(id="fcf")
	WebElement Listview;
	
	@FindBy(xpath="//a[contains(text(),'Edit')]")
	WebElement Editview;
	
	@FindBy(id="fname")
	WebElement viewname;
	
	@FindBy(id="fcol1")
	WebElement field;
	
	@FindBy(id="fop1")
	WebElement operator;
	
	@FindBy(id="fval1")
	WebElement value;
	
	@FindBy(xpath="//select[@id='colselector_select_0']/option")
	List<WebElement> AvailableFields;
	
	@FindBy(xpath="//img[@title='Add']")
	WebElement add;
	
	@FindBy(xpath="//input[@value=' Save ']")
	WebElement save;
	
	@FindBy(xpath="//a[@href='/merge/accmergewizard.jsp?retURL=%2F001%2Fo']")
	WebElement mergeaccounts;
	
	@FindBy(xpath="//input[@id='srch']")
	WebElement writeaccountname;
	
	@FindBy(xpath="//input[@value='Find Accounts']")
	WebElement findaccounts;
	
	@FindBy(xpath="//input[@id='cid2']")
	WebElement thirduncheck;
	
	@FindBy(xpath="//input[@value=' Next ']")
	WebElement selectnext;
	
	@FindBy(xpath="//input[@value=' Merge ']")
	WebElement clickmerge;
	
	@FindBy(xpath="//a[contains(text(),'Accounts with last')]")
	WebElement lastactivity;
	
	@FindBy(id="ext-gen20")
	WebElement datefield;
	
	@FindBy(xpath="//div[contains(text(),'Created Date')]")
	WebElement selectcreatedate;
	
	@FindBy(id="ext-comp-1042")
	WebElement fromdatetoday;
	
	@FindBy(id="ext-comp-1045")
	WebElement todatetoday;
	
	@FindBy(id="ext-gen49")
	WebElement saveunsavedreport;
	
	@FindBy(id="saveReportDlg_reportNameField")
	WebElement popupreportname;
	
	@FindBy(id="saveReportDlg_DeveloperName")
	WebElement popupuniquereportname;
	
	@FindBy(id="dlgSaveReport")
	WebElement popupsave;
	
	@FindBy(id="ext-gen63")
	WebElement runreport; 
	
String parentwindow = driver.getWindowHandle();
	
	public void EnterintoUserName(String username)
	{
		UserName.sendKeys(username);
	}
	
	public void EnterintoPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void ClearPassword() 
	{ 
		Password.clear();
	}
	public void ClickonLoginButton() 
	{ 
	  LoginButton.click(); 
	}
	public void ClickonUserName()
	{
		Username.click();
	}

	public void ClickonAccounts() 
	{
		Accounts.click();
		wait(2000);
		promptdisplayclose.click();
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

	public void ClickonNewAccount() 
	{
		NewAccounts.click();
		wait(500);
		//promptdisplayclose.click();
		String accountwindow = driver.getTitle();
		System.out.println(accountwindow);
	}

	public void ClickonCreateNewView() 
	{
		CreateNewView.click();
	}

	public void EnterViewName(String Viewname)
	{
		ViewName.sendKeys(Viewname);
	}

	public void EnterViewUniqueName(String UniqueViewname) 
	{
		UniqueViewName.click();
		UniqueViewName.clear();
		UniqueViewName.sendKeys(UniqueViewname);
	}

	public void ClickonSave() 
	{
		SaveView.click();
	}

	public void Selectviewfromdropdown(String Viewname) 
	{
		Listview.click();
		Select view = new Select(Listview);
		view.selectByVisibleText(Viewname);
	}

	public void ClickonEdit()
	{
		Editview.click();
	}

	public void EditView(String EditView) 
	{
		viewname.clear();
		wait(100);
		viewname.sendKeys(EditView+" New");
	}

	public void SetFieldOperatorValue(String Field, String Operator, String Value)
	{
		field.click();
		Select fieldview = new Select(field);
		fieldview.selectByVisibleText(Field);
		
		operator.click();
		Select operatordropdown = new Select(operator);
		operatordropdown.selectByVisibleText(Operator);
		
		value.sendKeys(Value);
	}

	public void AddLastActivitytoSelectedfromAvailable() 
	{
		for(WebElement AF: AvailableFields)
		{
			if(AF.getText().equalsIgnoreCase("Last Activity")) 
			{ 
				AF.click(); 
				break; 
			}
		}
		add.click();
	}

	public void SavetheChanges()
	{
		save.click();
		WebElement getvalue = driver.findElement(By.xpath("//option[@selected='selected']"));
		String value = getvalue.getText();
		System.out.println("Edited view name: "+value);
	}

	public void ClickonMergeAccounts() 
	{
		mergeaccounts.click();
	}

	public void WriteAccountName(String accountName) 
	{
		writeaccountname.sendKeys(accountName);
	}

	public void ClickonFindAccounts() 
	{
		findaccounts.click();
	}

	public void UncheckThirdelement() 
	{
		thirduncheck.click();
	}

	public void ClickonNextButton() 
	{
		selectnext.click();
	}

	public void ClickonMergeButton()
	{
		clickmerge.click();
	}

	public void ClickOKonAlertMessage() 
	{
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		System.out.println(title);
	}

	public void SelectLastActivity() 
	{
		lastactivity.click();
	}

	public void SelectCreatedDateFromDateField() 
	{
		datefield.click();
		selectcreatedate.click();
	}

	public void SetFromandToDatetoTodaysDate()
	{
		LocalDateTime LDT = LocalDateTime.now();
		DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String FDT = LDT.format(DTF);
		
		fromdatetoday.sendKeys(FDT);
		todatetoday.clear();
		todatetoday.sendKeys(FDT);
	}

	public void ClickOnSaveButton()
	{
		saveunsavedreport.click();
	}

	public void EnterReportUniqueReportNameinPopUp(String Name1, String UniqueName1)
	{
		popupreportname.sendKeys(Name1);
		wait(500);
		popupuniquereportname.clear();
		wait(500);
		popupuniquereportname.sendKeys(UniqueName1);
		wait(1000); 
	}

	public void ClickSaveandRunReport() 
	{ 
		  popupsave.click(); 
		  wait(500); 
		  runreport.click();
	}

	public void CheckforReportNameafterSaving(String Name1) 
	{
		  WebElement pagetext =  driver.findElement(By.xpath("//h1[@class='noSecondHeader pageType']")); 
			 String actual = pagetext.getText();
			 String title = driver.getTitle();
			 String expected = Name1;
			 Assert.assertEquals(actual, expected);
			 System.out.println(title+"\n"+actual);
	}
}
