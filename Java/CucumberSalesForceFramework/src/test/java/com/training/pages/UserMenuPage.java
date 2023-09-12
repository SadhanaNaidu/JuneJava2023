package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseStep;

public class UserMenuPage extends BasePage{

	static WebDriver driver;
	public UserMenuPage()
	{
		super(driver=BaseStep.getDriver());
		//addObject("Key", By.id("value"));
		addObject("UsernameMenu", By.id("userNavLabel"));
		addObject("UserMenuList", By.xpath("//div[@id='userNav-menuItems']/a"));
		addObject("MyProfile", By.xpath("//a[contains(text(),'My Profile')]"));
//EditProfile actions elements
		addObject("EditProfile", By.xpath("//h3 [contains(text(),'Contact')]/div/div/a/img[@alt='Edit Profile']"));
		addObject("EditProfileFrame", By.xpath("//iframe[@id='contactInfoContentId']"));
		addObject("About", By.xpath("//a[contains(text(),'About')]"));
		addObject("LastName", By.id("lastName"));
		addObject("saveAll", By.xpath("//input[@value='Save All']"));
//Post action elements
		addObject("Post", By.linkText("Post"));
		addObject("Frame", By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		addObject("enterText", By.xpath("//body[contains(text(),'Share an update, @mention someone...')]"));
		addObject("share", By.xpath("//input[@title='Share']"));
//File action elements
		addObject("File", By.linkText("File"));
		addObject("UploadFromComputer", By.id("chatterUploadFileAction"));
		addObject("chooseFile", By.id("chatterFile"));
			//share button is same as Share(For Post)
//AddPhoto action elements	
		addObject("moderator", By.xpath("//img[@src='https://homecompany-dev-ed.develop.file.force.com/profilephoto/005/F']"));
		addObject("AddPhoto", By.id("uploadLink"));
		addObject("UploadPhotoFrame", By.id("uploadPhotoContentId"));
		addObject("choosePhoto", By.id("j_id0:uploadFileForm:uploadInputFile"));
		addObject("Save", By.id("j_id0:uploadFileForm:uploadBtn"));
		addObject("photoFrame", By.xpath("//iframe[@id='uploadPhotoContentId']"));
		addObject("SaveAgain", By.id("j_id0:j_id7:save"));
//MySettings action elements		
		addObject("MySettings",By.xpath("//a[contains(text(),'My Settings')]"));
		addObject("Personal",By.linkText("Personal"));
		addObject("LoginHistory", By.linkText("Login History"));
		addObject("DownloadLoginHistory", By.xpath("//a[contains(text(),'Download login history for last six months')]"));
		addObject("Display&Layout", By.id("DisplayAndLayout_font"));
		addObject("CustomizemyTabs", By.id("CustomizeTabs_font"));
		addObject("CustomAppValue", By.id("p4"));
		addObject("AvailableTabs", By.id("duel_select_0"));
		addObject("Add", By.id("duel_select_0_right"));
		addObject("savebutton", By.xpath("//input[@class='btn primary']"));
		addObject("Email", By.id("EmailSetup_font"));
		addObject("EmailSettings", By.id("EmailSettings_font"));
		addObject("EmailName", By.id("sender_name"));
		addObject("Emailaddress", By.id("sender_email"));
		addObject("clickOnBcc", By.id("auto_bcc1"));
		addObject("SaveEmail", By.xpath("//input[@class='btn primary']"));
		addObject("Calendar&Reminders", By.id("CalendarAndReminders_font"));
		addObject("ActivityReminders", By.id("Reminders_font"));
		addObject("TestReminders", By.id("testbtn"));
//Developer Console action elements
		addObject("DeveloperConsole", By.xpath("//a[contains(text(),'Developer Console')]"));
	}
	
}
