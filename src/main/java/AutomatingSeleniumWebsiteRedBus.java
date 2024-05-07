import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AutomatingSeleniumWebsiteRedBus {

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
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        // Wait and click on the Account in the right-top area        
		driver.findElement(By.xpath("//span[normalize-space()='Account']")).click();
		Thread.sleep(3000);
		
		// Wait and click on the Email/SMS in the list in the right-top area
		driver.findElement(By.xpath("//span[normalize-space()='Email/SMS']")).click();
		Thread.sleep(3000);
		
		// Wait and write a telephone number in the Mobile Number area
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.redbus.in/Home/SmsAndEmailTicket");
		driver1.findElement(By.xpath("//input[@id='searchTicketMobileno']")).sendKeys("12345678");
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
