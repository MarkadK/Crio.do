package takeHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedIn {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.linkedin.com/home");
	       
	        driver.findElement(By.id("session_key")).sendKeys("markadk@gmail.com");
	        driver.findElement(By.id("session_password")).sendKeys("Kishor2511@");
	        driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']")).click();
	        
	        

	        }

	}


