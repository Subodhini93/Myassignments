package myassignments3;

import org.openqa.selenium.chrome.ChromeDriver;

public class InheritanceRealtimeExample {

	public static void main(String[] args) throws InterruptedException {
		
		// step launch the browser
        //for real time example of inheritance in Selenium perspective
		//just click on ChromeDriver and click f3 or right click open declaration
		// u will see chromeDriver extends chromiumDriver which is simple/single level inheritance
		// then u click on ChromiumDriver f3 or right click open declaration u will see Multilevel inheritance
		
		ChromeDriver driver = new ChromeDriver();
		
		// load the url
		
		driver.get("https://login.salesforce.com/");
		
		// maximise the window
		
		driver.manage().window().maximize();
		
		// wait time
		
		Thread.sleep(5000);
		
		// close
		
		driver.close();
	}

}
