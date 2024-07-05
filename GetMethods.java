package myassignment5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class GetMethods {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		
	

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// get() method used to launch url
		driver.get("https://www.orangehrm.com");
		// get() method used for return title of page
		System.out.println(driver.getTitle());
		// get() method used for current url
		System.out.println(driver.getCurrentUrl());
		// get() method page source source code
		//System.out.println(driver.getPageSource());
		// get() method return ID of single browser window or multiple windows
		System.out.println(driver.getWindowHandle());
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonAccept']")).click();
		
        Thread.sleep(5000);
        
        
        WebElement mouseover =driver.findElement(By.xpath("/html/body/footer/section/div[2]/div/div/div[1]/div/ul/li[4]/a"));
		
	    Actions act = new Actions (driver);
	    
	    act.moveToElement(mouseover).perform();
	    
	    act.doubleClick(mouseover).perform();
	 
	     System.out.println(driver.getWindowHandles());
	 
	     driver.close();
	 
	 
	 
	    
	    
	    
     
       
        
     
	}


	}

