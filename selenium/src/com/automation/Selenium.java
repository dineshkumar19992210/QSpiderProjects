package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium {
	
	public static void main(String[] args) {

		System.setProperty("window.edge.driver", "C:\\Users\\dines\\Downloads\\edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//driver.navigate().to("https://www.facebook.com");
		driver.navigate().to("https://www.instagram.com");  

		WebElement email =  driver.findElement(By.xpath("//input[@name='username']"));
		email.sendKeys("dineshrbkkrish@email.com");

		WebElement password =  driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Dineshkd@98");
		
		WebElement login =  driver.findElement(By.xpath("//button[@class='_acan _aiit _acap _aijb _acas _aj1-']"));
		login.click();
		
		
		//driver.close();

	
	}

}
