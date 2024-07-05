package myassignment5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// alert with text, OK & cancel button
		

		WebDriver driver = new ChromeDriver();
				 
				driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				
				driver.manage().window().maximize();
				//alert with text OK & cancel button
				
				driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
				// store this alert in variable were as variable is alert type
				
				Alert myalert=driver.switchTo().alert();
				
				System.out.println(myalert.getText());
				
				Thread.sleep(3000);
				myalert.sendKeys("Welcome");
				
				myalert.accept();
				
				
				// without switching command how can we handle alert
				// Using Explicit Wait u can handle alert

	}

}
