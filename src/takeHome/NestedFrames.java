package takeHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedFrames {

	public static void main(String[] args) throws InterruptedException {
		 
				//System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
				System.setProperty("webdriver.gecko.driver", "E:\\GeckoDriver\\geckodriver.exe");
				//WebDriverManager.chromedriver().setup();
		        WebDriver driver=new FirefoxDriver();
		        driver.get("https://the-internet.herokuapp.com/nested_frames");
		        WebElement topFrame = driver.findElement(By.name("frame-top"));
		        driver.switchTo().frame(topFrame);
		        Thread.sleep(2000);
		        WebElement frameLeft = driver.findElement(By.xpath("(//frameset[@name='frameset-middle']/frame)[1]"));
		        String text1 = driver.switchTo().frame(frameLeft).getTitle();
		        System.out.println(text1);
		        driver.switchTo().parentFrame();
		        WebElement frameMiddle = driver.findElement(By.xpath("(//frameset[@name='frameset-middle']/frame)[2]"));
		        String text2 = driver.switchTo().frame(frameMiddle).getTitle();
		        System.out.println(text2);
		        driver.switchTo().parentFrame();
		        WebElement frameRight = driver.findElement(By.xpath("(//frameset[@name='frameset-middle']/frame)[3]"));
		        String text3 = driver.switchTo().frame(frameRight).getTitle();
		        System.out.println(text3);
		        driver.switchTo().defaultContent();
		        WebElement frameBottom = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		        String text4 = driver.switchTo().frame(frameBottom).getTitle();
		        System.out.println(text4);
		        
	}

}//
