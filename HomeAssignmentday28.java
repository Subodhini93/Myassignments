package myassignment5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssignmentday28 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  try {
		driver.get("https://testautomationpractice.blogspot.com/");
		
		 List<WebElement> links = driver.findElements(By.tagName("a"));

		
	driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");	
	driver.findElement(By.xpath("//input[@class ='wikipedia-search-button']")).click();
	
	driver.findElement(By.xpath("//a[text()='Selenium'] ")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[text()='Selenium in biology'] ")).click();
	
	Thread.sleep(3000);

	driver.findElement(By.xpath("//a[text()='Selenium (software)'] ")).click();
	
	Thread.sleep(6000);
	
	driver.findElement(By.xpath("//a[contains(text(),'Selenium disulfide')] ")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath(" //a[text()='Selenium dioxide'] ")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath(" //a[text()='More »'] ")).click();
	
	System.out.println(driver.getWindowHandles());
	
	
	
	Set<String>windowIDs = driver.getWindowHandles();
	
	/*List<String>windowList = new ArrayList(windowIDs);
	
	String parentID= windowList.get(0);
	String childID1= windowList.get(1);
	String childID2= windowList.get(2);
	
	*/

	// Enhanced for loop to switch control
	
		for (String winId: windowIDs)
		{
			String title = driver.switchTo().window(winId).getTitle();
			
			if (title.equals("Selenium in biology - Wikipedia"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}
	
	
	
	
		  } catch (JavascriptException e) {
	            System.out.println("JavaScript execution failed: " + e.getMessage());
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	}

}
