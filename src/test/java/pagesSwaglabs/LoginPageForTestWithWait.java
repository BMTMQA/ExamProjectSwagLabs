package pagesSwaglabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageForTestWithWait {
    protected WebDriver driver;

    public LoginPageForTestWithWait(WebDriver driver) {
        this.driver = driver;
    }

    public ProductsPage login(String username, String password) {
        WebElement userNameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        userNameInput.click();
        userNameInput.clear();
        userNameInput.sendKeys(username);

        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);

        loginButton.click();

        return new ProductsPage(driver);
    }
}
