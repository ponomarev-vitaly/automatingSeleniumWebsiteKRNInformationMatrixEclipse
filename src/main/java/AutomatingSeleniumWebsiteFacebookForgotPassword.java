import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingSeleniumWebsiteFacebookForgotPassword {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		driver1.manage().window().maximize();
		
		try {
			driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).click();
			Thread.sleep(5000);
			
			driver1.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("v6676130@gmail.com");
			Thread.sleep(5000);
			
			driver1.findElement(By.xpath("//button[@id='did_submit']")).click();
			
			
		}catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        driver.quit();
	        driver1.quit();
	    }
		

	}

	

}
