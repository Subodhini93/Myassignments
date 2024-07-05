package myassignment5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		// Conditional statements is a command which access through web element

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// get() method used to launch url
		driver.get("https://demo.nopcommerce.com/register");
		
		// isDisplayed() method check whether logo is displayed or any other element is displayed
		
WebElement logo = driver.findElement(By.xpath(" //img[@alt='nopCommerce demo store'] "));

System.out.println("Display Status of logo:    "+logo.isDisplayed());// true

// u can write in this way as well mentioned bellow

boolean status=driver.findElement(By.xpath(" //img[@alt='nopCommerce demo store'] ")).isDisplayed();

System.out.println("Display Status of image  "+status);
 
// isEnabled()
boolean status1 = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();

System.out.println("Display Status input search box  "+status1);

//isSelected()

System.out.println("Before selecting radio button......");

boolean status2 = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();

System.out.println("Display Status of radio button male   "+status2);

//boolean status3 = driver.findElement(By.xpath("//input[@id='gender-female']")).isSelected();

//System.out.println("Display Status of radio button female   "+status2);

WebElement female_rd= driver.findElement(By.xpath("//input[@id='gender-female']"));

System.out.println("Display Status of radio button male   "+female_rd.isSelected());



System.out.println("After selecting female radio button......");



female_rd.click();
		
System.out.println("Display Status of radio button female   "+female_rd);
		
System.out.println("Display Status of radio button male   "+status2);
		
		// check box
		
WebElement status_newsletter=driver.findElement(By.xpath("//input[@id='Newsletter']"));
	
System.out.println("Display ststus of newsletter checkbox    "+status_newsletter.isSelected());
	

		driver.close();
		
	}

}
