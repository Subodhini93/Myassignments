package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseAbhiBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		ChromeDriver driver = new ChromeDriver();
			 
		driver.get("https://www.abhibus.com/\n");
		
		driver.manage().window().maximize();
		
		//implicitlyWait - 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='From Station'] ")).sendKeys("Chennai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='collection-item auto-complete-list-item '])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Banglore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='collection-item auto-complete-list-item '][1]")).click();
		driver.findElement(By.xpath(" //button[contains(text(),'Tomorrow')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//Span[text()='Sleeper']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Show Seats')][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'L14')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='label'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='label'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("  //span[contains(text(),'Continue')]")).click();
		driver.close();
		
		
	}

}
