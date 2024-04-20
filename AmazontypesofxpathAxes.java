package myassignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazontypesofxpathAxes {


	public static void main(String[] args) throws InterruptedException {
		// first launch browser and load url
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		// when index value is beyond 5 then we go to advance xpath or axes xpath
		// some xpath may work some xpath may not work
		
		//Type 1 parent to child
		//syntax(parent relative (basic) xpath)/(tagname of child)
		
		driver.findElement(By.xpath("//div[@class='nav-search-field ']/input")).sendKeys("laptop");
		
		//Type 2 Grandparent to child 
		// syntax (Grandparent relative xpath // tagname of grandchild)
		
		//driver.findElement(By.xpath("//form[@id='nav-search-bar-form']//input")).sendKeys("Laptop");
		
		//Type 3 child to parent
		//syntax child relative xpath/parent::parent tagName
		// :: is called as scope operator
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/parent::div")).sendKeys("Laptop");
		// Type 4 Grandchild to Grandparent 
		//syntax Grandchild relative xpath/ancestor::tagName of grandparent
		
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/ancestor::div[@class='nav-fill'])[2]")).sendKeys("Laptop");
		
		// Type 5 
		
	}

}
