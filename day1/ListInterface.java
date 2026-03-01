package Week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class ListInterface {

	public static void main(String[] args) {
		
		 ChromeDriver driver =new ChromeDriver ();
		  
		  
		 driver.get("https://www.amazon.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones") ;
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 
	    List<WebElement> Phonesbyprices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	     
	    int size = Phonesbyprices.size();
	    System.out.println(size);
	    
	    
	    for (WebElement each: Phonesbyprices) {
	    	String text = each.getText();
	    	
	    	System.out.println(text);
	    	
	    	
	    	
	    
	    }
		  
		 
 }

}
