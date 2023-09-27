package takeHome;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountAllLinks {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		//  WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://in.bookmyshow.com/explore/home/chennai");
	        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	       
	        System.out.println(allLinks.size());
	        
	        Iterator<WebElement> it = allLinks.iterator();


	        while(it.hasNext()) {
	        	
	        	WebElement link = it.next();
	        	System.out.println( link.getText());

	        	
	        	
	        }
	       
	}

}
