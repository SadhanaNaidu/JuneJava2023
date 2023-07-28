package com.training.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Day8Robot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver fdriver = new FirefoxDriver();
		
		fdriver.get("https://www.w3schools.com/html/default.asp");
		
		Robot robot = new Robot();
		fdriver.manage().window().maximize();
		Thread.sleep(1000);
		robot.mouseMove(1450, 400);//screen coordinates  x, y is given
		
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); //used to press and release action of mouse
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseWheel(50);//scrolldown by 50
		robot.mouseWheel(-20);//scrollup by 20 from last position
		robot.keyPress(KeyEvent.VK_CONTROL);//to choose cntrl button from keyboard
		robot.mouseRelease(KeyEvent.VK_CONTROL);//for evry press there should be release
		robot.keyPress(KeyEvent.VK_A);//to choose A button from keyboard
		robot.mouseRelease(KeyEvent.VK_A);
	}

}
