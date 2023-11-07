package pagesSwaglabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    WebElement userNameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(className = "error-message-container")
    WebElement invalidLoginErrorMassage;
    public WebElement getInvalidLoginErrorMassage() {
        return invalidLoginErrorMassage;
    }

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public boolean IsAt() {
        return loginButton.isDisplayed();
    }

    public ProductsPage login(String username, String password) {
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
