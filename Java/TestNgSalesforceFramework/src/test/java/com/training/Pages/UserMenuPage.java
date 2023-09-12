package com.training.Pages;

import java.util.List;

//import java.util.Collections;
import java.util.Iterator;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.training.Base.BasePage;

public class UserMenuPage extends BasePage{

	public UserMenuPage(WebDriver driver) {
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
	
	@FindBy(xpath="//div[@id='userNav-menuItems']/a")
	List<WebElement> listusermenu;
	
	@FindBy(xpath="//a[contains(text(),'My Profile')]")
	WebElement MyProfile;
	
	@FindBy(xpath="//img[@alt='Edit Profile']")
	WebElement Editprofile;
	
	@FindBy(xpath="//iframe[@id='contactInfoContentId']")
	WebElement Editprofileframe;
	
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement EditAbout;
	
	@FindBy(id="lastName")
	WebElement Lastname;
	
	@FindBy(xpath="//input[@value='Save All']")
	WebElement Saveall;
	
	@FindBy(linkText="Post")
	WebElement PostLink;
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement TextAreaFrame;
	
	@FindBy(xpath="//body[contains(text(),'Share an update, @mention someone...')]")
	WebElement WritePost;
	
	@FindBy(xpath="//input[@title='Share']")
	WebElement Share;
	
	@FindBy(linkText="File")
	WebElement FileLink;
	
	@FindBy(id="chatterUploadFileAction")
	WebElement FilefromComp;
	
	@FindBy(id="chatterFile")
	WebElement FileUpload;
	
	@FindBy(xpath="//img[@src='https://homecompany-dev-ed.develop.file.force.com/profilephoto/005/F']")
	WebElement Photoimage;
	
	@FindBy(id="uploadLink")
	WebElement Addphoto;
	
	@FindBy(id="uploadPhotoContentId")
	WebElement UploadPhotoFrame;
	
	@FindBy(id="j_id0:uploadFileForm:uploadInputFile")
	WebElement PhotoUpload;
	
	@FindBy(id="j_id0:uploadFileForm:uploadBtn")
	WebElement FirstSave;
	
	@FindBy(id="j_id0:j_id7:save")
	WebElement SaveAgain;
	
	@FindBy(xpath="//a[contains(text(),'Developer Console')]")
	WebElement DevConsole;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement Logout;
	
	@FindBy(xpath="//a[contains(text(),'My Settings')]")
	WebElement MySettings;
	
	@FindBy(linkText="Personal")
	WebElement Personal;
	
	@FindBy(linkText="Login History")
	WebElement LoginHistory;
	
	@FindBy(xpath="//a[contains(text(),'Download login history for last six months')]")
	WebElement DownloadHistory;
	
	@FindBy(id="DisplayAndLayout_font")
	WebElement DisplaLayout;
	
	@FindBy(id="CustomizeTabs_font")
	WebElement CustomTab;
	
	@FindBy(id="p4")
	WebElement CustomApp;
	
	@FindBy(id="duel_select_0")
	WebElement Availtab;
	
	@FindBy(xpath="//img[@alt='Add']")
	WebElement TabAdd;
	
	@FindBy(id="EmailSetup_font")
	WebElement Email;
	
	@FindBy(id="EmailSettings_font")
	WebElement EmailSettings;
	
	@FindBy(id="sender_name")
	WebElement Emailname;
	
	@FindBy(id="sender_email")
	WebElement Emailaddress;
	
	@FindBy(id="auto_bcc1")
	WebElement Bccbuttonyes;
	
	@FindBy(xpath="//input[@class='btn primary']")
	WebElement Emailsave;
	
	@FindBy(id="CalendarAndReminders_font")
	WebElement CalenderReminders;
	
	@FindBy(id="Reminders_font")
	WebElement ActivityReminders;
	
	@FindBy(id="testbtn")
	WebElement TestReminder;
	
	@FindBy(xpath="//input[@class='btn primary']")
	WebElement Save;
	
	
	
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

	public void ListUserMenuDropDown() 
	{
		int i=0;
		String[] text = {"My Profile", "My Settings", "Developer Console", "Switch to Lightning Experience", "Logout"};
		for(WebElement list : listusermenu)
		{
			if(i<text.length)
			{
				Assert.assertEquals(list.getText(), text[i]);
				System.out.println(list.getText());
			}i++;
		}         
		
		
/*		Iterator<WebElement> list = listusermenu.iterator();
		while (list.hasNext())
		{
			if(i<text.length)
			{
				Assert.assertEquals(list.getText(), text[i]);
				System.out.println(list.getText());
			}i++;
		} */
		
	}

	public void ClickonMyProfile() 
	{
		MyProfile.click();
	}
	public void ClickonEditProfile() 
	{
		Actions edit = new Actions(driver);
		edit.moveToElement(Editprofile).build().perform();
		Editprofile.click();
	}

	public void ClickonAboutTab() 
	{
		driver.switchTo().frame(Editprofileframe);	
		EditAbout.click();
	}

	public void EditLastName(String lastname) 
	{
		Lastname.clear();
		Lastname.sendKeys(lastname);
	}

	public void ClickOnSaveAll()
	{
		Saveall.click();
		driver.switchTo().window(parentwindow);
	}

	public void ClickOnPostLink() 
	{
		PostLink.click();
	}

	public void WritePostinPostLink(String message) 
	{
		driver.switchTo().frame(TextAreaFrame);
		WritePost.sendKeys(message);
	}

	public void ClickOnShareButton() 
	{
		driver.switchTo().window(parentwindow);//getting the driver focus out of frame to main window
		Share.click();
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
	public void waitforWebElement(WebElement element, int time)
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void ClickOnFileLink()
	{
		FileLink.click();
	}

	public void ClickOnUploadfromComputer(String filepath) 
	{
		FilefromComp.click();
		FileUpload.sendKeys(filepath);
	}

	public void ClickOnPhotoLink()
	{
		Actions photo = new Actions(driver);
		photo.moveToElement(Photoimage).build().perform();
		Addphoto.click();
	}

	public void UploadPhoto(String photopath)
	{
		driver.switchTo().frame(UploadPhotoFrame);
		PhotoUpload.sendKeys(photopath);
		wait(1000);
		FirstSave.click();
		wait(2000);
		SaveAgain.click();
		driver.switchTo().window(parentwindow);
	}

	public void ClickonDeveloperConsole()
	{
		DevConsole.click();
	}
	public void Windowhandles()
	{
/*		for(String handle: driver.getWindowHandles())
		{
			driver.switchTo().window(handle);
			System.out.println(handle);
		}     */
		
		Iterator<String> handle = driver.getWindowHandles().iterator();
		while (handle.hasNext())
		{
		String windowkey = handle.next();
		driver.switchTo().window(windowkey);
		System.out.println(handle.next());
		}
	}
	
	public void CloseDeveloperConsole()
	{
		Windowhandles();
		GetTitle();
		driver.close();
		driver.switchTo().window(parentwindow);
	}
	public void GetTitle()
	{
		String Title = driver.getTitle();
		System.out.println(Title);
	}
	
	public void gettext(WebElement element, String expected)
	{
		String actual = element.getText();
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
	}
	
	public void ClickonLogout()
	{
		Logout.click();
		GetTitle();
	}

	public void ClickonMySettings() 
	{
		wait(1000);
		MySettings.click();
	}

	public void ClickonPersonal() 
	{
		wait(1000);
		Personal.click();
	}

	public void ClickonLoginHistory()
	{
		LoginHistory.click();
	}

	public void ClickonDownloadHistory() 
	{
		wait(1000);
		DownloadHistory.click();
	}

	public void ClickonDisplayLayout() 
	{
		wait(1000);
		DisplaLayout.click();
	}

	public void ClickonCustomizeMyTabs() 
	{
		wait(1000);
		CustomTab.click();
	}

	public void SelectSalesForceChatterFromCustomAppDropdown() 
	{
		wait(1000);
		Select sfchatter = new Select(CustomApp);
		//sfchatter.selectByIndex(8);
		sfchatter.selectByVisibleText("Salesforce Chatter");//selecting salesforce chatter
	}

	public void AddAcountsfromAvailabletoSelected() 
	{
		Select availtaboption = new Select(Availtab);
		availtaboption.selectByValue("report");//selecting reports
		TabAdd.click();
		wait(1000);
		Save.click();
	}

	public void ClickonEmail() 
	{
		wait(1000);
		Email.click();
	}

	public void ClickonMyEmailSettings()
	{
		EmailSettings.click();
	}

	public void EnterEmailNameandAddress(String Name, String Email) 
	{
		wait(1000);
		Emailname.sendKeys(Name);
		Emailaddress.clear();
		Emailaddress.sendKeys(Email);
	}

	public void ClickBccandSave() 
	{
		Bccbuttonyes.click();
		Emailsave.click();
	}

	public void ClickonCalenderReminders() 
	{
		wait(1000);
		CalenderReminders.click();
	}

	public void SelectActivityReminders()
	{
		ActivityReminders.click();
	}

	public void ClickTestReminder()
	{
		wait(1000);
		TestReminder.click();
		Windowhandles();
		GetTitle();
	}
}
