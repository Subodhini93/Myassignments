package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookLogin {

		public static void main(String[] args) throws InterruptedException {
			
			
			ChromeDriver driver = new ChromeDriver();
				 
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("(//button[@title='Decline optional cookies'])[1]")).click();
			
		    driver.findElement(By.id("email")).sendKeys("subodhini93@gmail.com");
		    
		    driver.findElement(By.name("pass")).sendKeys("Myanaya@19");
		    
		   
		   
		    
		  
		    
			
			
			

	}

}
