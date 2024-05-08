import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AutomatingSeleniumWebsiteRedBusSearchBuses {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds of explicit wait
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Open the calendar
        driver.findElement(By.xpath("//span[@class='dateText']")).click();

        // Wait and click on the specific date
        driver.findElement(By.xpath("//span[normalize-space()='21']")).click();
        Thread.sleep(3000);
        
        // Wait and click in the From area, enter the name of the city: Delhi        
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Delhi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//text[@class='placeHolderMainText'][normalize-space()='Delhi']")).click();
		
		// Wait and click in the To area, enter the name of the city: Mumbai 
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Mumbai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//text[@class='placeHolderMainText'][normalize-space()='Mumbai']")).click();
		
		// Wait and click on the Search Buses button
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		
		// driver.quit();
		

	}

}
