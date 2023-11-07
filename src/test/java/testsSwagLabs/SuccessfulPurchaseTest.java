package testsSwagLabs;

import baseSwagLabs.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesSwaglabs.*;

public class SuccessfulPurchaseTest extends TestUtil {
    @Test(dataProvider = "readClientsDataFromCsv")
    public void successfulPurchase(String firstName, String lastName, String postalCode) {
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");

        Assert.assertTrue(productsPage.IsAt());

        YourCartPage yourCartPage = productsPage.selectProducts(productsPage.getBikeLightAddButton(),
                                                                productsPage.getOnesieAddButton());

        Assert.assertTrue(yourCartPage.IsAt());
        Assert.assertTrue(yourCartPage.getBikeLightRemoveButton().isDisplayed());
        Assert.assertTrue(yourCartPage.getOnesieRemoveButton().isDisplayed());

        CheckoutYourInformationPage checkoutYourInformationPage = yourCartPage.checkout();

        Assert.assertTrue(checkoutYourInformationPage.IsAt());
        Assert.assertTrue(checkoutYourInformationPage.getContinueButton().isDisplayed());
        Assert.assertTrue(checkoutYourInformationPage.getContinueButton().isEnabled());

        CheckoutOverviewPage checkoutOverviewPage = checkoutYourInformationPage.fillClientData(firstName, lastName, postalCode);

        Assert.assertTrue(checkoutOverviewPage.IsAt());
        Assert.assertTrue(checkoutOverviewPage.getItemBikeLight().isDisplayed());
        Assert.assertTrue(checkoutOverviewPage.getItemOnesie().isDisplayed());
        Assert.assertTrue(checkoutOverviewPage.getTotalPrice().isDisplayed());

        CheckoutCompletePage checkoutCompletePage = checkoutOverviewPage.finishOrder();

        Assert.assertTrue(checkoutCompletePage.IsAt());
        Assert.assertTrue(checkoutCompletePage.getCompleteMessage().isDisplayed());
    }
}
