package webdrivermethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	  //  Window win = opts.window();
		//win.maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("login")).click();
		Thread.sleep(5000);
		Navigation navi=driver.navigate();
		navi.back();
		Thread.sleep(5000);
		navi.forward();
		Thread.sleep(5000);
		navi.refresh();
		Thread.sleep(5000);
		System.out.println("success");
		
		
		String title=driver.getTitle();
		System.out.println(title);
		
        String url=	driver.getCurrentUrl();
        System.out.println(url);
        
        String pagesource=driver. getPageSource();
        System.out.println(pagesource);
        
        String handle=driver.getWindowHandle();
        System.out.println(handle);
        
        driver.quit();
        
        
	}

}
