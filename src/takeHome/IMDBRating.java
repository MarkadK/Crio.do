package takeHome;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IMDBRating {
    //ChromeDriver driver;
	WebDriver driver;

    public IMDBRating(){
        //System.out.println("Constructor: TestCases");
        System.setProperty("webdriver.gecko.driver", "E:\\GeckoDriver\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void endTest(){
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();
    }
public static void main(String[] args) {
	
	IMDBRating imdb=new IMDBRating();
	
	imdb.movieRating();
	imdb.endTest();
}
    public void movieRating(){


        driver.get("https://www.imdb.com/chart/top/");



        WebElement highestRatedMovie = driver.findElement(By.xpath("//ul[contains(@class,'ipc-metadata-list')]/child::li[1]/descendant::span[6][contains(@aria-label,'IMDb rating:')]"));


  
        System.out.println("Rating of highest rated movie is: " + highestRatedMovie.getText());



        List <WebElement> numberOfMovies = driver.findElements(By.xpath("//ul[contains(@class,'compact-list-view')]/child::li"));


  
        System.out.println("Number of movies on table is: " + numberOfMovies.size());



        WebElement sortOrderDropdown = driver.findElement(By.id("sort-by-selector"));
        sortOrderDropdown.click();


  
        Select dropdown = new Select(sortOrderDropdown);
        dropdown.selectByValue("RELEASE_DATE");        



        WebElement swapOrderButton = driver.findElement(By.id("swap-sort-order-button"));
        swapOrderButton.click();



        WebElement oldestMovie = driver.findElement(By.xpath("//ul[contains(@class,'ipc-metadata-list')]/child::li[1]/descendant::a[2]"));


  
        System.out.println("Oldest movie name is: " + oldestMovie.getText());        

       
        swapOrderButton.click();



        WebElement latestMovie = driver.findElement(By.xpath("//ul[contains(@class,'ipc-metadata-list')]/child::li[1]/descendant::a[2]"));



        System.out.println("Latest movie name is: " + latestMovie.getText());        



        sortOrderDropdown.click();

          
        dropdown.selectByValue("USER_RATING_COUNT");

         
        WebElement highestPublicRating = driver.findElement(By.xpath("//ul[contains(@class,'ipc-metadata-list')]/child::li[1]/descendant::span[7]"));

        
        System.out.println("Total number of highest rating by user is: " + highestPublicRating.getText());
    }
}
