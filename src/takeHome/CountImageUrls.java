package takeHome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountImageUrls {

	

	public static void main(String[] args) {

	    System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		//	  	WebDriverManager.chromedriver().setup();
		        WebDriver driver=new ChromeDriver();
		        driver.get("https://in.bookmyshow.com/explore/home/chennai");
		        driver.findElement(By.xpath("//div[text()='See All ›']")).click();
		        
		        List<WebElement> imageUrls = driver.findElements(By.xpath("//div[@class='sc-1ljcxl3-0 iGFUdZ']/a"));
		        
		        for(WebElement url:imageUrls) {
		        	
		        	String urls = driver.findElement(By.xpath("//div[@class='sc-1ljcxl3-0 iGFUdZ']/a")).getAttribute("href");
		        	System.out.println(urls);
		        }
		        driver.navigate().back();
		        String nameLanguage = driver.findElement(By.xpath("(//div[@class='sc-lnhrs7-4 hpUsIF']/a/div/div[3])[2]")).getText();
		        System.out.println(nameLanguage);
	}

}
