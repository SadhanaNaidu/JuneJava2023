package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseStep;

public class LoginPage extends BasePage{

	static WebDriver driver;
	public LoginPage()
	{
		super(driver=BaseStep.getDriver());
		addObject("Username", By.id("username"));
		addObject("Login", By.id("Login"));
		addObject("Password", By.id("password"));
		addObject("PasswordErrorMessage", By.id("error"));
		addObject("RememberMe", By.id("rememberUn"));
		addObject("UsernameMenu", By.id("userNavLabel"));
		addObject("Logout", By.xpath("//a[contains(text(),'Logout')]"));
		addObject("ValidateUsername", By.xpath("//span[@id='idcard-identity']"));
		addObject("ForgotPassword", By.id("forgot_password_link"));
		addObject("UsernameAgain", By.id("un"));
		addObject("Continue", By.id("continue"));
		addObject("ForgotPasswordMessage", By.id("header"));
		addObject("IncorrectUsername", By.id("username"));
		addObject("IncorrectUsernamePassword", By.id("password"));
		addObject("ValidateLoginCredentials", By.id("error"));
	}
	
}
