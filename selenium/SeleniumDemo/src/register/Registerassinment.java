package register;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registerassinment {
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("dinesh");
		driver.findElement(By.id("LastName")).sendKeys("kumar");
		driver.findElement(By.id("Email")).sendKeys("dineshrbkkrish@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("Dineshkd@1999");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Dineshkd@1999");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(5000);
		driver.navigate().back();

   }
}

