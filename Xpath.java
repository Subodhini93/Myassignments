package week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[@title='Decline optional cookies'])[1]")).click();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Subodhini");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Khairmode");
		
		
		
		
		
		
		
		
	}
}