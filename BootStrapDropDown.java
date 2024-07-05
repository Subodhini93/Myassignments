package myassignment5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class BootStrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().window().maximize();
		
		Thread .sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"qc-cmp2-ui\"]/div[2]/div/button[2]")).click();
		
		// to select single option 
		Thread .sleep(3000);
		
		driver.findElement(By.xpath("//button[@contains='multiselect']")).click();
		
		Thread .sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Java']")).click();	
		Thread .sleep(3000);
		
		// capture all the options and find out size
		
	List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	System.out.println("Number of Options :"+options.size());
	
	// printing all the options from drop down by enhanced for loop
	
	for(WebElement op: options) {
		System.out.println(op.getText());
		
	// select multiple options 
		
		for (WebElement op1: options) {
			
			String option = op1.getText();
			if(option.equals("Java")|| option.equals("Python")||option.equals("MySQL"))
				
{
				op1.click();
				
				
			
			
		}
		
	}
		
		
	}}}


