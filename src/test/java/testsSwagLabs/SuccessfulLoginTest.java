package testsSwagLabs;

import baseSwagLabs.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesSwaglabs.LoginPage;
import pagesSwaglabs.ProductsPage;

public class SuccessfulLoginTest extends TestUtil {
    @Test(dataProvider = "readUsersLoginDataFromCsv")
    public void successfulLoginWithDataProvider(String userName, String password) {
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = loginPage.login(userName, password);

        Assert.assertTrue(productsPage.IsAt());
    }
}
