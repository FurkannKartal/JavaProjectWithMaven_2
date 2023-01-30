import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {
    By shippingLocator = By.id("s-refinements");
    By productLocator = By.cssSelector("div[class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductsPage() {
       return isDisplayed(shippingLocator);
    }

    public void selectProduct(int i) {
        getProducts().get(i).click();

    }
    private List<WebElement> getProducts() {
        return findAll(productLocator);
    }
}
