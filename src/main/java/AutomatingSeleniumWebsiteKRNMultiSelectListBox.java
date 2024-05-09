import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomatingSeleniumWebsiteKRNMultiSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement multiSelect = driver.findElement(By.id("cities"));
		Select dd = new Select(multiSelect);
		dd.selectByIndex(2);
		Thread.sleep(3000);
		dd.selectByValue("4");
		Thread.sleep(3000);
		dd.selectByVisibleText("Bangalore");
		List<WebElement> allOptions = dd.getAllSelectedOptions();
		int si = allOptions.size();
		for(int i=0; i<si; i++) {
			WebElement option1 = allOptions.get(i);
			String tel1 = option1.getText();
			System.out.println(tel1);
			
		}
		
		driver.quit();
	}

}
