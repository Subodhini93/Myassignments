package myassignment5;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// find total no of ROWS in a static table
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
        System.out.println("Number of rows:"+ rows);
        
        // by tag name there is problem in it it will show all tables row from all the tables on web page when u have single table u can use
        
       int rows1= driver.findElements(By.tagName("tr")).size();
       
       System.out.println("Total no of rows :"+ rows1);
       
       // find no of columns in a table
       
       int colunms = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
       
       System.out.println("Total no of columns:"+ colunms);
       
       // by tag name
       
       int colunms1 =  driver.findElements(By.tagName("th")).size();
       
       System.out.println("Total no of columns:"+ colunms1);
       
       // read data from specific row and column
       
       String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
       
       System.out.println(bookName);
       
       // read the data from all the rows and  columns
       
       for (int r=2;r<= rows;r++) {
    	   
    	   for(int c=1;c<= colunms;c++) {

    	       String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
    	    	System.out.println(value);	   
    	    		   
    	     
    		   
    	   }
       }
       
      
       
       
       

		
		

	}

}
