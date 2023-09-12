package com.training.base;
//import static org.testng.Assert.assertEquals;
import java.util.HashMap;

import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import java.lang.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.training.utilities.CommonUtilities;

public class BasePage {
	
	WebDriver driver;
	static CommonUtilities commonpath = new CommonUtilities();

	public HashMap<String, By> ObjectRepository = new HashMap<String, By>();
	
		
	public BasePage(WebDriver driver) 
	{
		this.driver = driver;
		
	}

	public void addObject(String LogicalName, By by)
	{
		ObjectRepository.put(LogicalName, by);
	}
	
	private WebElement getElement(String LogicalName)///for one element
	{
		By by = ObjectRepository.get(LogicalName);
		WebElement element = driver.findElement(by);
		return element;
	}
	
	private List<WebElement> getElements(String LogicalName)/////for list of elements
	{
		By by = ObjectRepository.get(LogicalName);
		List<WebElement> element = driver.findElements(by);
		return element;
	} 
	
	private void WaitForElement(WebElement element, int time)
	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	private void wait(int n)
	{
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void enterintoTextBox(String LogicalName, String Value)
	{
		WebElement element = getElement(LogicalName);
		wait(500);
		element.clear();
		element.sendKeys(Value);
	}
	
	public void clickonButton(String LogicalName)
	{
		WebElement element = getElement(LogicalName);
		//WaitForElement(element, 60);
		wait(1000);
		element.click();
	}

	public void getmessage(String LogicalName, String Message) 
	{
		WebElement element = getElement(LogicalName);
		String Actual = element.getText();
		Assert.assertEquals(Actual, Message);
		System.out.println("Error Message displayed is: "+Actual);
	}

	public void gettitle(String LogicalName, String Message) 
	{
		wait(1000);
		String Actual = driver.getTitle();
		Assert.assertEquals(Actual, Message);
		System.out.println("Page title displayed is: "+Actual);
	}

	public void close() 
	{
		driver.close();
	}

	public void ClickonRememberMe(String LogicalName) 
	{
		WebElement element = getElement(LogicalName);
		element.click();
		
	}

	public void ClickonUsernameMenu(String LogicalName) 
	{
		WebElement element = getElement(LogicalName);
		element.click();
	}

	public void gettext(String LogicalName, String Text)
	{
		WebElement element = getElement(LogicalName);
		//WaitForElement(element, 100);
		wait(3000);
		String Actual = element.getText();
		Assert.assertEquals(Actual, Text);
		System.out.println("Text displayed is: "+Actual);
	}


	public void displayUserlist(String LogicalName) 
	{
		
		List<WebElement> element = getElements(LogicalName);
		int i=0;
		String[] UserList = {"My Profile", "My Settings", "Developer Console", "Switch to Lightning Experience", "Logout"};
		//String[] OppList = {"All Opportunities", "Closing Next Month", "Closing This Month", "My Opportunities", "New Last Week", "New This Week", "Opportunity Pipeline", "Recently Viewed Opportunities",
						//	"Private", "Won"};
		
			for(WebElement list : element)
			{
				if(i<UserList.length)
				{
					Assert.assertEquals(list.getText(), UserList[i]);
					System.out.println(list.getText());
				}i++;
			}  
		
		
		
		
		////Trying with Iterator(Not working)
/*		Iterator<WebElement> list = element.iterator();
		while (list.hasNext())
		{
			if(i<text.length)
			{
				//Assert.assertEquals(list.getText(), text[i]);
				//System.out.println(list.getText());
			}i++;
		} */
	} 

	
	public void displayOpplist(String LogicalName) 
	{
		
		List<WebElement> element = getElements(LogicalName);
		int i=0;
		
		String[] OppList = {"All Opportunities", "Closing Next Month", "Closing This Month", "My Opportunities", "New Last Week", "New This Week", "Opportunity Pipeline", "Private", 
				"Recently Viewed Opportunities", "Won"};
		
			for(WebElement list : element)
			{
				if(i<OppList.length)
				{
					Assert.assertEquals(list.getText(), OppList[i]);
					System.out.println(list.getText());
				}i++;
			} 
	}

	public void clickonimage(String LogicalName)////should work on this
	{
		WebElement element = getElement(LogicalName);
		wait(9000);
		Actions edit = new Actions(driver);
		WaitForElement(element, 30);
		edit.moveToElement(element).build().perform();
		element.click();
	}
	public void clickontext(String LogicalName) 
	{
		WebElement element = getElement(LogicalName);
		WaitForElement(element, 50);
		wait(1000);
		element.click();
	}
	
	public void promptclose(String LogicalName)
	{
		WebElement element = getElement(LogicalName);
		//WaitForElement(element, 50);
		wait(1000);
		element.click();
	}

	public void ClickonTab(String LogicalName) 
	{
		WebElement element = getElement(LogicalName);
		WaitForElement(element, 30);
		element.click();
		wait(1000);
	}
	
	public void getValuefromlist(String LogicalName, String Value)
	{
		List<WebElement> element = getElements(LogicalName);
		for(WebElement list : element)
		{
			String value = list.getText();
			if(value.equals(Value))
			{
				System.out.println(value);
				break;
			}
		}  
		
	}

	public void selectvaluedropdown(String LogicalName, String Value) 
	{
		WebElement element = getElement(LogicalName);
		element.click();
		Select view = new Select(element);
		view.selectByVisibleText(Value);
	}
	
	public void selectvaluefromdropdownbox(String LogicalName, String Value) 
	{
		wait(500);
		WebElement element = getElement(LogicalName);
		WaitForElement(element, 30);
		Select view = new Select(element);
		view.selectByVisibleText(Value);
	}


	public void acceptalert() 
	{
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		System.out.println(title);
	}

	public void setTodaysDate(String LogicalName) 
	{
		LocalDateTime LDT = LocalDateTime.now();
		DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String FDT = LDT.format(DTF);
		
		WebElement element = getElement(LogicalName);
		element.clear();
		element.sendKeys(FDT);
	}

	public void selectvalue(String LogicalName) 
	{
		WebElement element = getElement(LogicalName);
		element.click();
		
	}

	public void SwitchTo(String LogicalName)
	{
		WebElement element = getElement(LogicalName);
		driver.switchTo().frame(element);
	}
	
	public void SwitchToWindow(String parentwindow)
	{
		
		driver.switchTo().window(parentwindow);
	}

	public void UploadFile(String LogicalName, String Path)
	{
		WebElement element = getElement(LogicalName);
		//String fileuploadpath = "C:\\Users\\Sadhana\\PicsUpload\\June Java Hackathon.txt";
		String fileuploadpath = null;
		try {
			fileuploadpath = commonpath.getproperty(Path); //gets path of file from applicatioi.properties file
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		element.sendKeys(fileuploadpath);
	}

	public void movetomoderator(String LogicalName)
	{
		WebElement element = getElement(LogicalName);
		Actions photo = new Actions(driver);
		photo.moveToElement(element).build().perform();
	}

	public void NewWindowHandle() 
	{
		for(String handle: driver.getWindowHandles())
		{
			driver.switchTo().window(handle);
			//System.out.println(handle);
		}
		wait(2000);
		String NewHandleTitle = driver.getTitle();
		System.out.println(NewHandleTitle);
		
	}

	

	
	
	
}


