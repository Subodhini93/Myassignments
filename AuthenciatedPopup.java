package myassignment5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AuthenciatedPopup {

	public static void main(String[] args) {
	
			WebDriver driver = new ChromeDriver();

					driver.get("http://admin:admin@the-internet.herokuapp.com/basic_authI");
					
					driver.manage().window().maximize();
				
				
		

	}

}
//http://the-internet.herokuapp.com/basic_auth