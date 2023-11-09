package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {
	
	public static void main (String[]args)throws InterruptedException {
		
		System.setProperty("window.edge.driver"," C:\\Users\\dines\\Downloads\\edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		Facebook facebook = new Facebook();
		
		driver.navigate().to("https://www.facebook.com/");
		WebElement facebookid  =driver.findElement(By.xpath(PomClass.FACEBOOK_ID));
	    facebookid.sendKeys("Dineshrbkkrish@gamil.com");
		WebElement password =driver.findElement(By.xpath(PomClass.PASS_WORD));
		password .sendKeys("Dinshkd@1998");
		WebElement login =driver.findElement(By.xpath(PomClass.LOG_IN));
		login.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	public  void tc1(WebDriver driver)  throws InterruptedException {
		
		driver.navigate().to("https://www.instagram.com/");
		WebElement Instagram  =driver.findElement(By.xpath(PomClass.INSTAGRAM));
		Instagram .sendKeys("dineshrbkkrish@gamil.com");
		WebElement  passwordk =driver.findElement(By.xpath(PomClass.PASS_WORDK));
		passwordk .sendKeys("Dinshkd@1998");
		WebElement logini =driver.findElement(By.xpath(PomClass.LOG_INI));
		logini.sendKeys(Keys.ENTER);
	}
}
