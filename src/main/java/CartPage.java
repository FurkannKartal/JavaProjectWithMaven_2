import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {
    By productNameLocator = By.cssSelector("span[class='a-size-medium sc-product-title a-text-bold']");
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkProductAdded() {
        return isDisplayed(productNameLocator);
    }
    private List<WebElement> getProducts() {
        return findAll(productNameLocator);
    }
}
