package register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginassinment {
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("dineshrbkkrish@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("Dineshkd@1999");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(6000);
   }
}
