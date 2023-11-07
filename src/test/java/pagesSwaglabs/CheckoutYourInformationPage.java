package pagesSwaglabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutYourInformationPage extends BasePage {
    @FindBy(xpath = "//*[text()[contains(.,'Your Information')]]")
    WebElement pageTitle;

    @FindBy(id = "first-name")
    WebElement firstNameInput;

    @FindBy(id = "last-name")
    WebElement lastNameInput;

    @FindBy(id = "postal-code")
    WebElement postalCodeInput;

    @FindBy(id = "continue")
    WebElement continueButton;
    public WebElement getContinueButton() {
        return continueButton;
    }

    public CheckoutYourInformationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public boolean IsAt() {
        return pageTitle.isDisplayed();
    }

    public CheckoutOverviewPage fillClientData(String firstName, String lastName, String postalCode) {
        firstNameInput.click();
        firstNameInput.clear();
        firstNameInput.sendKeys(firstName);

        lastNameInput.click();
        lastNameInput.clear();
        lastNameInput.sendKeys(lastName);

        postalCodeInput.click();
        postalCodeInput.clear();
        postalCodeInput.sendKeys(postalCode);

        continueButton.click();

        return new CheckoutOverviewPage(driver);
    }
}
