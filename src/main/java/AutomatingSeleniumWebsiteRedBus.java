import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomatingSeleniumWebsiteRedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='dateText']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/header[1]/div[1]/ul[2]/li[2]/div[1]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/header[1]/div[1]/ul[2]/li[2]/div[2]/ul[1]/li[4]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("mobileno")).sendKeys("12345678");
		driver.quit();

	}

}
