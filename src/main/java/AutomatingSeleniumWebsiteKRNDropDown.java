import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomatingSeleniumWebsiteKRNDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://a2itsoft.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement multiSelect = driver.findElement(By.xpath("//body/div[@class='main-header-area header-sticky box-shadow']/div[@class='container']/div[@class='classy-nav-container breakpoint-off light left']/nav[@id='EduStudyNav']/div[@class='classy-menu']/div[@class='classynav']/ul/li[3]/a[1]"));
		Select dd = new Select(multiSelect);
		
		dd.selectByIndex(2);
		Thread.sleep(3000);
		
		dd.selectByValue("SERVICES");
		Thread.sleep(3000);
		
		dd.selectByVisibleText("BUSINESS TRAINING");
		Thread.sleep(3000);
		
		List<WebElement> allOptions = dd.getAllSelectedOptions();
		int si = allOptions.size();
		for(int i=0; i<si; i++) {
			WebElement option1 = allOptions.get(i);
			String textOption = option1.getText();
			System.out.println(textOption);
		}
		
		driver.quit();		

	}

}
