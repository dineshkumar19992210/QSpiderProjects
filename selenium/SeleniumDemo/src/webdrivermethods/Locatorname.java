package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorname {
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement newsLetter=driver.findElement(By.name("NewsletterEmail"));
		newsLetter.sendKeys("hello");
		Thread.sleep(2000);
		newsLetter.clear();
		Thread.sleep(2000);
		newsLetter.sendKeys("hi");
		Thread.sleep(2000);
	}

}
