package takeHome;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class HandleWindows {

	

	public static void main(String[] args) throws InterruptedException, IOException {
		String url ;
		String title;
		System.setProperty("webdriver.gecko.driver", "E:\\GeckoDriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
	    WebElement iframe = driver.findElement(By.xpath("//div[@id='iframewrapper']/iframe"));
	    	
	    String parentWinId = driver.getWindowHandle();
	    
	    driver.switchTo().frame(iframe);
	    
	    driver.findElement(By.xpath("//button[text()='Try it']")).click();
	    
	    Set<String> bothWin = driver.getWindowHandles();
		
		Thread.sleep(1000);
		
		for (String childWinId : bothWin) {
			if(!childWinId.equalsIgnoreCase(parentWinId)) {
				url = driver.getCurrentUrl();
				title = driver.getTitle();
				TakesScreenshot scrShot = ((TakesScreenshot) driver);
		           File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		           File scr=new File("./img6.png");
		           FileHandler.copy(SrcFile, scr);
		           
				}
			}

	}

}
