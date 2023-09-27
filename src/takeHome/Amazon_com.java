package takeHome;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_com {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.google.com/");
	        driver.findElement(By.name("q")).sendKeys("amazon");
	        driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
	        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	        
	        Iterator<WebElement> it = allLinks.iterator();
	        while (it.hasNext()) {
				boolean flag = it.next().getText().contains("amazon.in");
				System.out.println(flag);
			}       
	}
}
