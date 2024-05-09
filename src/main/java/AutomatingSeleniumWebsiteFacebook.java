import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingSeleniumWebsiteFacebook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		try {
			driver.findElement(By.id("email")).sendKeys("v6676130@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("12345678");
			Thread.sleep(5000);
			driver.findElement(By.name("login")).click();
			Thread.sleep(5000);
			
		}catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        driver.quit();
	    }
		

	}

}
