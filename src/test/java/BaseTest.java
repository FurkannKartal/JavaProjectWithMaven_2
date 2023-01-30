import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)     //"TestInstance.Lifecycle.PER_CLASS" is used to run the @BeforeAll method only once
public class BaseTest {  // BaseTest class

    WebDriver driver;       // WebDriver object

    @BeforeAll              // BeforeAll annotation
    public void setup() {
        System.out.println("Setup");        // Print "Setup" in the console
        WebDriverManager.chromedriver().setup();        // Setup the ChromeDriver
        driver = new ChromeDriver();        // Create a new ChromeDriver object
        driver.get("https://www.amazon.com.tr");       // Open the Google page
    }

    @AfterAll               // AfterAll annotation
    public void teardown() {
        System.out.println("Teardown");     // Print "Teardown" in the console
        driver.quit();      // Close the browser
    }
}
