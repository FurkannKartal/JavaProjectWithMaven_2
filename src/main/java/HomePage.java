import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {
    SearchBox searchBox;
    By cartCountLocator = By.id("nav-cart-count");
    By cartLinkLocator = By.id("nav-cart");
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }
    public SearchBox searchbox() {
        return this.searchBox;

    }

    public boolean isProductCountup() {
        return getCartCount() > 0;
    }

    public void goToCart() {
        click(cartLinkLocator);
    }
    private int getCartCount() {
        String count = findElement(cartCountLocator).getText();
        return Integer.parseInt(count);
    }
}
