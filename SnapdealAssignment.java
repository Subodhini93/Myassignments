package myassignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealAssignment {

	public static void main(String[] args) throws InterruptedException {
		// first launch browser
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[contains(text(),'Cart')])/parent::div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //a[contains(text(),'START SHOPPING NOW')]")).click();
		
		
		}

}
