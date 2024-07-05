package myassignment5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
	
			WebDriver driver = new ChromeDriver();
					// confirmation alert - OK & cancel
					driver.get("https://the-internet.herokuapp.com/javascript_alerts");
					
					driver.manage().window().maximize();
					// Normal alert with OK button
					
					driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
					
					Thread.sleep(3000);
					 
					// driver.switchTo().alert().accept(); // close alert using accept button 
					
					//driver.switchTo().alert().dismiss(); // close the alert using cancel button
					
					Alert myalert=driver.switchTo().alert();
					
					System.out.println(myalert.getText());
					
					myalert.dismiss();
					

	}

}
