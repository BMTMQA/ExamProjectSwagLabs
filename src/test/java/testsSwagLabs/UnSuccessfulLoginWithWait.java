package testsSwagLabs;

import baseSwagLabs.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesSwaglabs.LoginPageForTestWithWait;

import java.time.Duration;

public class UnSuccessfulLoginWithWait extends TestUtil {
    @Test
    public void unSuccessfulLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        LoginPageForTestWithWait loginPage = new LoginPageForTestWithWait(driver);

        WebElement userNameInput = driver.findElement(By.id("user-name"));
        wait.until(ExpectedConditions.visibilityOf(userNameInput));

        WebElement passwordInput = driver.findElement(By.id("password"));
        wait.until(ExpectedConditions.visibilityOf(passwordInput));

        WebElement loginButton = driver.findElement(By.id("login-button"));
        wait.until(ExpectedConditions.visibilityOf(loginButton));

        loginPage.login("wrongUsername", "wrongPassword");

        WebElement invalidLoginErrorMassage = driver.findElement(By.className("error-message-container"));
        wait.until(ExpectedConditions.visibilityOf(invalidLoginErrorMassage));

        Assert.assertTrue(invalidLoginErrorMassage.isDisplayed());
        Assert.assertTrue(invalidLoginErrorMassage.isEnabled());
    }
}
