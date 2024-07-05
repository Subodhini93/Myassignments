package myassignment5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) {
		

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// get() method used to launch url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
        System.out.println(driver.getWindowHandles());
        
        //when u command driver.close() first window gets closed but u cannot perform action 
        //on second window because the control is still in window one
        // u can find NoSuchwindowexception when u try to perform action on second window
        
        //that is we can say driver focus on first browser window
        
	    driver.quit();	   

	}

}
