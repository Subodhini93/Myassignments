package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserAndLoadUrl {

	public static void main(String[] args) throws InterruptedException {
		
		// step 1 launch chrome browser
		
		ChromeDriver driver = new ChromeDriver();
		
		// step 2 load url facebook
		 
		driver.get("https://www.facebook.com/");
		
		// step 3 maximize the screen 
		
		driver.manage().window().maximize();
		
		// step 4 wait 
		
		Thread.sleep(6000);
		
		// step 5
		
		driver.close();
		

	}

}
