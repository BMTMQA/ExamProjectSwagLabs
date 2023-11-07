package testsSwagLabs;

import baseSwagLabs.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesSwaglabs.LoginPage;
import pagesSwaglabs.ProductsPage;
import pagesSwaglabs.YourCartPage;

public class AddProductsInToTheCartTest extends TestUtil {
    @Test
    public void addProductsInToTheCart() {
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");
        YourCartPage yourCartPage = productsPage.selectProducts(productsPage.getBackpackAddButton(),
                                                                productsPage.getFleeceJacketAddButton());

        Assert.assertTrue(yourCartPage.IsAt());
        Assert.assertTrue(yourCartPage.getBackpackRemoveButton().isDisplayed());
        Assert.assertTrue(yourCartPage.getFleeceJacketRemoveButton().isDisplayed());
    }
}
