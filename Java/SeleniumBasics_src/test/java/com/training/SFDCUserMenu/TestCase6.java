package com.training.SFDCUserMenu;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Mouse;

import junit.framework.Assert;

public class TestCase6  extends TestCase5 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		launchSF();
		loginSF();
		usermenu();
		myprofile();
		//editprofile();
		//editprofileabout();
		//postlink();
		//filelink();
		addphotolink();
		
	}
	
	static void myprofile()
	{
		wait(1000);
		WebElement profile = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		profile.click();
		wait(1000);
		String actual = driver.getTitle();
		String expected = "User: Sadhana Naidu ~ Salesforce - Developer Edition";
		Assert.assertEquals(expected, actual);
		System.out.println(actual);
	}
	static void editprofile()
	{
		wait(1000);
		WebElement editprofile = driver.findElement(By.xpath("//img[@alt='Edit Profile']"));
		Actions edit = new Actions(driver);
		edit.moveToElement(editprofile).build().perform();
		String actual = editprofile.getText();//not able to get the tool tip
		//System.out.println(actual);
		editprofile.click();
		wait(1000);
		WebElement editwindow = driver.findElement(By.id("contactInfoTitle"));
		String alertwindow = editwindow.getText();
		System.out.println(alertwindow);
		
	}
	static void editprofileabout() 
	{
		
		WebElement editprofileframe = driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));//edit profile popu[ is frame
		driver.switchTo().frame(editprofileframe);
		WebElement editabout = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		//explicitwait(editprofileframe, 10);
		editabout.click();
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.clear();
		lastname.sendKeys("Naiduagain");
		WebElement saveall = driver.findElement(By.xpath("//input[@value='Save All']"));
		saveall.click();
	}
	static void postlink()
	{
		String parentwindow = driver.getWindowHandle();//getting id of main window
		WebElement post = driver.findElement(By.linkText("Post"));
		post.click();
		WebElement textareaframe = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(textareaframe);
		WebElement writepost = driver.findElement(By.xpath("//body[contains(text(),'Share an update, @mention someone...')]"));
		writepost.sendKeys("Hello World");
		String check = writepost.getAttribute("value");//if no value attribute for the given webelement, how do we fetch textentered ?
		System.out.println(check);
		driver.switchTo().window(parentwindow);//getting the driver focus out of frame to main window
		WebElement share = driver.findElement(By.xpath("//input[@title='Share']"));
		wait(3000);
		
		share.click();
	}
	static void filelink()
	{
		
		WebElement file = driver.findElement(By.linkText("File"));
		file.click();
		
		WebElement filecomp = driver.findElement(By.id("chatterUploadFileAction"));
		filecomp.click();
		/*
		 * Robot choosefile = null;//using robot class to choose file try { choosefile =
		 * new Robot(); } catch (AWTException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } choosefile.mouseMove(300,420);
		 * choosefile.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		 * choosefile.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		 */
		WebElement fileupload = driver.findElement(By.id("chatterFile"));
		String fileuploadpath = "C:\\Users\\Sadhana\\PicsUpload\\June Java Hackathon.txt";
		fileupload.sendKeys(fileuploadpath);
		WebElement share = driver.findElement(By.id("publishersharebutton"));
		share.click();
		
	}
	static void addphotolink() 
	{
		WebElement addphoto = driver.findElement(By.xpath("//img[@src='https://homecompany-dev-ed.develop.file.force.com/profilephoto/005/F']"));
		Actions photo = new Actions(driver);
		photo.moveToElement(addphoto).build().perform();
		WebElement Addphoto = driver.findElement(By.id("uploadLink"));
		Addphoto.click();
		WebElement title = driver.findElement(By.id("uploadPhotoTitle"));
		String titlecheck = title.getText();
		System.out.println(titlecheck);
		String parentid = driver.getWindowHandle();
		WebElement frame = driver.findElement(By.id("uploadPhotoContentId"));
		driver.switchTo().frame(frame);
		//driver.manage().window().maximize();
		/*
		 * Robot choosephoto = null; try { choosephoto = new Robot(); } catch
		 * (AWTException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * choosephoto.mouseMove(350,550);
		 * choosephoto.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		 * choosephoto.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		 * //choosephoto.mouseMove(465,600);//savebutton
		 * //choosephoto.mouseMove(500,600);//cancel button
		 */		
		WebElement photoupload = driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));
		String photouploadpath = "C:\\Users\\Sadhana\\PicsUpload\\QuaverAvatar.png";
		photoupload.sendKeys(photouploadpath);
		wait(1000);
		WebElement firstsave = driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn"));
		firstsave.click();
		wait(2000);
		WebElement saveagain = driver.findElement(By.id("j_id0:j_id7:save"));
		saveagain.click();
	}

}
