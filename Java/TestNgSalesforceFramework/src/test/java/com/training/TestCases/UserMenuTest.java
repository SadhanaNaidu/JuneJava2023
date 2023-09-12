package com.training.TestCases;
import org.openqa.selenium.WebDriver;


//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.Base.BaseTest;
import com.training.Pages.UserMenuPage;

public class UserMenuTest extends BaseTest{

	static WebDriver driver;
	String url;
	UserMenuPage usermenupage;
	String username, password;
	String lastname;
	String message;
	String fileuploadpath;
	String photouploadpath;
	String name;
	String email;
	
	
	@BeforeMethod
	public void Beforemethod()
	{
		driver = getDriver();
		url = getvalue("qaurl");
		driver.get(url);
		usermenupage = new UserMenuPage(driver);
		driver.manage().window().maximize();
		username = getvalue("username");
		password = getvalue("password");
		lastname = getvalue("lastname");
		message = getvalue("message");
		fileuploadpath = getvalue("fileuploadpath");
		photouploadpath = getvalue("photouploadpath");
		name = getvalue("Name");
		email = getvalue("Email");
	}
	
		@Test(priority = 1)
	public void CheckUserMenuDropDown()
	{
		usermenupage.EnterintoUserName(username);
		usermenupage.EnterintoPassword(password);
		usermenupage.ClickonLoginButton();
		usermenupage.ClickonUserName();
		usermenupage.ListUserMenuDropDown();
	}
	
		/*	@Test(priority=2)
	public void ActionOnMyProfile()
	{
		usermenupage.EnterintoUserName(username);
		usermenupage.EnterintoPassword(password);
		usermenupage.ClickonLoginButton();
		usermenupage.ClickonUserName();
		usermenupage.ClickonMyProfile();
	//My profile Edit-About tab steps
		usermenupage.wait(1000);
		usermenupage.ClickonEditProfile();
		usermenupage.wait(1000);
		usermenupage.ClickonAboutTab();
		usermenupage.EditLastName(lastname);
		usermenupage.ClickOnSaveAll();
	//My profile PostLink steps
		usermenupage.wait(1000);
		usermenupage.ClickOnPostLink();
		usermenupage.wait(1000);
		usermenupage.WritePostinPostLink(message);
		usermenupage.wait(1000);
		usermenupage.ClickOnShareButton();
	//My profile FileLink steps
		usermenupage.wait(1000);
		usermenupage.ClickOnFileLink();
		usermenupage.wait(1000);
		usermenupage.ClickOnUploadfromComputer(fileuploadpath);
		usermenupage.wait(1000);
		usermenupage.ClickOnShareButton();//share buttom is same for postlink and filelink
	///My profile Link steps
		usermenupage.wait(1000);
		usermenupage.ClickOnPhotoLink();
		usermenupage.wait(1000);
		usermenupage.UploadPhoto(photouploadpath);
		
	}
	
	@Test(priority=3)
	public void ActionOnMySettings()
	{
		usermenupage.EnterintoUserName(username);
		usermenupage.EnterintoPassword(password);
		usermenupage.ClickonLoginButton();
		usermenupage.ClickonUserName();
		usermenupage.ClickonMySettings();
	// My Settings: Actions on Personal
		usermenupage.ClickonPersonal();
		usermenupage.ClickonLoginHistory();
		usermenupage.ClickonDownloadHistory();
	//My Settings: Actions on Display Layout
		usermenupage.ClickonDisplayLayout();
		usermenupage.ClickonCustomizeMyTabs();
		usermenupage.SelectSalesForceChatterFromCustomAppDropdown();
		usermenupage.AddAcountsfromAvailabletoSelected();
	//My Settings Email Action
		usermenupage.ClickonEmail();
		usermenupage.ClickonMyEmailSettings();
		usermenupage.EnterEmailNameandAddress(name,email);
		usermenupage.ClickBccandSave();
	//My Settings Calendars%Reminders
		usermenupage.ClickonCalenderReminders();
		usermenupage.SelectActivityReminders();
		usermenupage.ClickTestReminder();
		
	} 
	
	
	@Test(priority=4)
	public void ActionOnDeveloperConsole()
	{
		usermenupage.EnterintoUserName(username);
		usermenupage.EnterintoPassword(password);
		usermenupage.ClickonLoginButton();
		usermenupage.ClickonUserName();
		usermenupage.ClickonDeveloperConsole();
		usermenupage.wait(2000);
		usermenupage.CloseDeveloperConsole();
	}
	
	
	@Test(priority=5)
	public void ActionOnLogout()
	{
		usermenupage.EnterintoUserName(username);
		usermenupage.EnterintoPassword(password);
		usermenupage.ClickonLoginButton();
		usermenupage.ClickonUserName();
		usermenupage.ListUserMenuDropDown();
		usermenupage.ClickonLogout();
		usermenupage.GetTitle();
	}*/
	
	
	
/*	 @AfterSuite() 
	  public void aftermethod() 
	  { 
		  driver.quit(); 
		  driver=null; 
	  }*/
}
