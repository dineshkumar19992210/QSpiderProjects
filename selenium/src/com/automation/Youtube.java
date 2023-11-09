package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;

import org.openqa.selenium.WebElement;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("window.edge.driver", "C:\\Users\\dines\\Downloads\\edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		Youtube yt = new Youtube();
		// yt.tc1(driver);
		// yt.tc2(driver);
		//yt.tableTest(driver);
         // yt.selenium(driver);
          yt.JMeter(driver);
	}


	private void radioBtn() {
		System.out.println("Hi");
		hello(); //non static method call
		test(); //static method call
	}

	private void hello() {
		System.out.println("hello from non static method");
	}
	
	private static void test() {
		//System.out.println("test from non static method");
		Youtube yt =new Youtube();
		yt.hello();
	}
	
	public void tc1(WebDriver driver) throws InterruptedException {
		driver.navigate().to("https://www.youtube.com");
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("tamil movies");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		search.clear();
		search.sendKeys("iron man");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(6000);
	}

	public void tc2(WebDriver driver) throws InterruptedException {
		driver.navigate().to("https://www.facebook.com");
		WebElement facebook_email = driver.findElement(By.xpath("//input[@id='email']"));
		facebook_email.sendKeys("dineshrbkkrish@gmail.com");
		WebElement facebook_pass = driver.findElement(By.xpath("//input[@id='pass']"));
		facebook_pass.sendKeys("Dineshkd@98");
		facebook_pass.sendKeys(Keys.ENTER);
	}

	public void tableTest(WebDriver driver) {
		driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
		List<WebElement> customerTableList = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		for (WebElement row : customerTableList) {
			System.out.println(row.getText());
		}
		System.out.println();
		List<WebElement> thead = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr"));
		for (WebElement row : thead) {
			System.out.println(row.getText());

		}
		List<WebElement> tbody = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		for (WebElement row : tbody) {
			System.out.println(row.getText());
		}
		List<WebElement> tfoot = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr"));
		for (WebElement row : tfoot) {
			System.out.println(row.getText());
		}

		System.out.println();

		WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		List<WebElement> tbodyList = table.findElements(By.tagName("tbody"));
		for (WebElement row : tbodyList) {
			System.out.println(row.getText());
		}
	}

	public void selenium(WebDriver driver) {
		driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
		List<WebElement> dropdownList =driver.findElements(By.xpath("//a[@class='dropbtn' and contains( text(), 'Selenium')]"));
		List<WebElement> seleniumList =driver.findElements(By.xpath("//a[contains( text(), 'Selenium with Java')]"));
		Actions action = new Actions(driver);
		action.moveToElement(dropdownList.get(1)).perform();
		action.moveToElement(seleniumList.get(2)).click().perform();
//        for(WebElement obj: selenium) {
//        	if("".equals(obj.getText())) {
//            	System.out.println(obj.getText());
//            	obj.click();
//        	}
//        }
		
		

	}
    
	public void JMeter(WebDriver driver) {
		
		driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
		List<WebElement> dropdownList =driver.findElements(By.xpath("//a[@class='dropbtn' and contains (text() ,'JMeter')]"));
		List<WebElement> seleniumList =driver.findElements(By.xpath("//a[contains(text() ,'Performance Testing with Apache Jmeter')]"));
		Actions action = new Actions(driver);
		action.moveToElement(dropdownList.get(1)).perform();
		action.moveToElement(seleniumList.get(0)).click().perform();
		
	}
	
	
	
}


  
