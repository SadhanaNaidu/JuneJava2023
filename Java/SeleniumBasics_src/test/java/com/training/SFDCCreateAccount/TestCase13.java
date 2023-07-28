package com.training.SFDCCreateAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase13 extends TestCase12{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		launchSF();
		loginSF();
		accounts();
		mergeaccounts();
	}
	static void mergeaccounts()
	{
		
		WebElement mergeaccounts = driver.findElement(By.xpath("//a[@href='/merge/accmergewizard.jsp?retURL=%2F001%2Fo']"));
		mergeaccounts.click();
		
		WebElement writeaccountname = driver.findElement(By.xpath("//input[@id='srch']"));
		writeaccountname.sendKeys("Naidu");
		
		WebElement findaccounts = driver.findElement(By.xpath("//input[@value='Find Accounts']"));
		findaccounts.click();
		
		WebElement uncheckfirst = driver.findElement(By.xpath("//input[@id='cid0']"));
		uncheckfirst.click();
		
		WebElement selectnext = driver.findElement(By.xpath("//input[@value=' Next ']"));
		selectnext.click();
		
		WebElement clickmerge = driver.findElement(By.xpath("//input[@value=' Merge ']"));
		clickmerge.click();
		
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}

