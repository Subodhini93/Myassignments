package myassignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebook {

	public static void main(String[] args) throws InterruptedException {
		// first launch browser
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@title='Decline optional cookies'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Subodhini");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Khairmode");
		
		
	}

}
