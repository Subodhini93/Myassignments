package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestcaseAmazon {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get(" https://www.amazon.in/\n ");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys");
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//div[@role='button'])")).click();

		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[contains(text(),'Expand all')]")).click();

		Thread.sleep(6000);
		driver.findElement(By.xpath("  //a[contains(text(),'Collapse all')]")).click();
        
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//a[@data-csa-c-func-deps='aui-da-a-expander-toggle'])[4]")).click();
		
	
		Thread.sleep(6000);
		driver.findElement(By.xpath("//li[@aria-label='American Tourister']")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[class='a-dropdown-prompt'][5] ")).click();
	
		
		
		
		
		
		
		

		
	}

}
