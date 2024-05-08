import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingSeleniumWebsiteKRNLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://krninformatix.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		int si = alllinks.size();
		System.out.println(si);
		
		for(int i=0; i<si; i++) {
			WebElement link = alllinks.get(i);
			String textLink = link.getText();
			System.out.println(textLink);
		}
		
	}
}
