package myassignment5;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait {

public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();


WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));// explicit wait declaration
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		// Normal alert with OK button
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		
		Thread.sleep(3000);
		Alert myalert= mywait.until(ExpectedConditions.alertIsPresent());// capture alert instead switchTo method
		
		
		System.out.println(myalert.getText());
		
		myalert.accept();
	
		

	}

}
