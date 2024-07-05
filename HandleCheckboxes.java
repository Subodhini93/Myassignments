package myassignment5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		// 1 select specific checkbox
		
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		// if you want to select multiple or all the check boxes by looping statement
		
		// we need to find common attribute of the checkboxes

		List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
		
		
		// Normal for loop 
		
	/*	for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		*/
		// enhanced for loop
		
	//for (WebElement checkbox: checkboxes) {
		
	//	checkbox.click();
	//}
		// some conditional based requirement i want to select last three check box thursay friday saturday
	
	// formula normal for loop is used here
	
	//for (int i= 4; i<checkboxes.size();i++) {
		//checkboxes.get(i).click();
		
	//}
	// select checkboxex first three
		
	//	for (int i=0; i<3; i++) {
	//		checkboxes.get(i).click();
	//	}
	
		// u may have multiple checkboxes some of which have already selected so to unselect the checkboxes based on condition
			
		for (int i=0; i<3; i++) {
			checkboxes.get(i).click();
			
		}
		
		Thread.sleep(5000);
		for (int i=0; i<3; i++) {
			if(checkboxes.get(i).isSelected())
			checkboxes.get(i).click();
			
		}	
	}

}
