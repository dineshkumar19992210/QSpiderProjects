package com.automation;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButtonTest {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("window.edge.driver", "C:\\Users\\dines\\Downloads\\edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		WebElement firstname =driver.findElement(By.xpath(FormPage.FIRST_NAME));
		firstname.sendKeys("dinesh");
		WebElement lastname =driver.findElement(By.xpath(FormPage.LAST_NAME));
		lastname.sendKeys("kumar");
		WebElement email =driver.findElement(By.xpath(FormPage.USER_EMAL));
		email.sendKeys("dineshrbkkrish@gmail.com");
		List<WebElement> gender=driver.findElements(By.xpath(FormPage.GENDER));
		Actions action = new Actions(driver);
		action.moveToElement(gender.get(0)).click().perform();
		for(WebElement element: gender) {
			System.out.println(element.isSelected());
		
		WebElement mobileNo =driver.findElement(By.xpath(FormPage.MOBILE_NO));
		mobileNo.sendKeys("8220600237");
		WebElement birth =driver.findElement(By.xpath(FormPage.BIRTH));
		birth.clear();
		birth.sendKeys("25 Oct 1999");
		birth.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		
		WebElement sub =driver.findElement(By.xpath(FormPage.SUBJECT));
		action.moveToElement(sub).click().perform();
		Thread.sleep(2000);
		sub.sendKeys("computer science");
		//List<WebElement> hobbie=driver.findElements(By.xpath("//input[@value='1']"));
	//	Actions sports = new Actions(driver);
		//sports.moveToElement(sports.get(0)).click().perform();
		//for(WebElement element: sports) {
		//	System.out.println(element.isSelected());
		
		WebElement upload =driver.findElement(By.xpath(FormPage.UPLOAD));
		upload.sendKeys("C:\\Users\\dines\\Downloads\\stretched-5120-2880-517273.jpg");
		WebElement addres =driver.findElement(By.xpath("//textarea"));
		addres.sendKeys("rajvgandi nagar, koduvillar patti ,theni");
		
		
		
	//List<WebElement> gender=driver.findElements(By.xpath("//input[@name='gender']"));
		//Actions action = new Actions(driver);
		//action.moveToElement(gender.get(0)).click().perform();
		//for(WebElement element: gender) {
			//System.out.println(element.isSel
		}
		 
	}
	
	
	
	
}
 