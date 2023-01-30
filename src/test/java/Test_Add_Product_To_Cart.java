import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Test_Add_Product_To_Cart  extends BaseTest {  // Test_Add_Product_To_Cart class

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test

    public void search_product() {
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        System.out.println("Search product");
        homePage.searchBox.search("Bilgisayar");
        Assertions.assertTrue(productsPage.isProductsPage(),"Not in the products page");

    }

    @Test
    public void select_product() {
        productsPage = new ProductsPage(driver);
        productDetailPage = new ProductDetailPage(driver);
        System.out.println("Select product");
        productsPage.selectProduct(2);
        Assertions.assertTrue(productDetailPage.isProductDetailPage(),"Not in the product detail page");

    }

    @Test
    public void add_product_to_cart() {
        System.out.println("Add product to cart");
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountup(),"Product count did not increase");



    }

    @Test
    public void go_to_cart() {
        cartPage = new CartPage(driver);
        System.out.println("Go to cart");
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkProductAdded(),"Product did not added to cart");



    }
}
