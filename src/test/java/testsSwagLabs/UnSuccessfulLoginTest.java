package testsSwagLabs;

import baseSwagLabs.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesSwaglabs.LoginPage;

public class UnSuccessfulLoginTest extends TestUtil {
    @Test(dataProvider = "getWrongUsersLoginData")
    public void unSuccessfulLoginWithDataProvider(String userName, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(userName, password);

        Assert.assertTrue(loginPage.IsAt());
    }
}
