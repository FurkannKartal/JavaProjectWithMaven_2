import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {
    WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement findElement(By locator) {     // Find the element by using the locator
        return driver.findElement(locator);
    }
    public List<WebElement> findAll(By locator) {      // Find all elements by using the locator
        return driver.findElements(locator);
    }
    public void click(By locator) {     // Click the element by using the locator
        findElement(locator).click();
    }
    public void sendKeys(By locator, String text) {       // Send the text to the element by using the locator
        findElement(locator).sendKeys(text);
    }
    public Boolean isDisplayed(By locator) {      // Check if the element is displayed by using the locator
        return findElement(locator).isDisplayed();
    }
}
