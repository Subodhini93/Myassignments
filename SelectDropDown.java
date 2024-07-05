package myassignment5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
	

        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://testautomationpractice.blogspot.com");
		
		driver.manage().window().maximize();
		
		WebElement drpCountryEle =driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drpCountry = new Select(drpCountryEle); // this is the special class
		
		// select option from the drop down
		
		//drpCountry.selectByVisibleText("United Kingdom");

		//drpCountry.selectByValue("india");
		
		drpCountry.selectByIndex(5);
		
		
		// capture options from drop down
		
		List<WebElement>options = drpCountry.getOptions();
		System.out.println("Total no of options:" + options.size());
		
		// printing the options by normal for loop
		
		//for(int i=0;i<options.size();i++)
		//{
		//System.out.println(options.get(i).getText());
		
		//}
		
		//printing the options by enhanced for loop
		
		for(WebElement op:options) {
			
			System.out.println(op.getText());
		}
		
		
		
	}

}
