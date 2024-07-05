package myassignments4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapShot {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.jqueryui.com/droppable");
		
		WebElement d =driver.findElement(By.xpath("//h1[text()='Droppable']"));
		
		File scr = d.getScreenshotAs(OutputType.FILE);
		
	    File dest = new File("./Snap/img1.png");
	    
	    FileUtils.copyFile(scr, dest);
	
		
		
		
	}

}
