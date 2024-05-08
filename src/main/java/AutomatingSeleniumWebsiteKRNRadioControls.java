import java.util.InputMismatchException;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingSeleniumWebsiteKRNRadioControls {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://krninformatix.com/sample.html");
        Scanner scan = new Scanner(System.in);
        
        try {
            // Check initial status of the "female" radio button
            boolean radioStatus = driver.findElement(By.id("female")).isSelected();
            System.out.println("Initial status of 'female' radio button: " + radioStatus);
            Thread.sleep(3000); // Wait for visibility

            // Click the "female" radio button to select it
            driver.findElement(By.id("female")).click();
            boolean radioStatus1 = driver.findElement(By.id("female")).isSelected();
            System.out.println("Status after click: " + radioStatus1);
            Thread.sleep(3000); // Wait for response

            // Prompt user for their gender choice
            System.out.println("Please enter your gender: (male-2/female-1)");
            int userChoice = scan.nextInt();
            
            // Process user choice
            if (userChoice == 1) {
                boolean radioStatus2 = driver.findElement(By.id("female")).isSelected();
                System.out.println("You selected the gender: female. Status: " + radioStatus2);
            } else if (userChoice == 2) {
                System.out.println("You selected the gender: male.");
                // Additional code to handle "male" selection could go here
            } else {
                System.out.println("Invalid selection.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } finally {
            driver.quit();
            scan.close();
        }
    }
}
