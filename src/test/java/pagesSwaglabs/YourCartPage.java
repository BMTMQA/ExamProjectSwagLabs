package pagesSwaglabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage extends BasePage {
    @FindBy(xpath = "//*[text()[contains(.,'Your Cart')]]")
    WebElement pageTitle;

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement backpackRemoveButton;
    public WebElement getBackpackRemoveButton() {
        return backpackRemoveButton;
    }

    @FindBy(id = "remove-sauce-labs-bike-light")
    WebElement bikeLightRemoveButton;
    public WebElement getBikeLightRemoveButton() {
        return bikeLightRemoveButton;
    }

    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    WebElement boltTShirtRemoveButton;
    public WebElement getBoltTShirtRemoveButton() {
        return boltTShirtRemoveButton;
    }

    @FindBy(id = "remove-sauce-labs-fleece-jacket")
    WebElement fleeceJacketRemoveButton;
    public WebElement getFleeceJacketRemoveButton() {
        return fleeceJacketRemoveButton;
    }

    @FindBy(id = "remove-sauce-labs-onesie")
    WebElement onesieRemoveButton;
    public WebElement getOnesieRemoveButton() {
        return onesieRemoveButton;
    }

    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    WebElement allTheThingsTShirtRemoveButton;
    public WebElement getAllTheThingsTShirtRemoveButton() {
        return allTheThingsTShirtRemoveButton;
    }

    @FindBy(id = "checkout")
    WebElement checkoutButton;

    public YourCartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public boolean IsAt() {
        return pageTitle.isDisplayed();
    }

    public CheckoutYourInformationPage checkout() {
        checkoutButton.click();

        return new CheckoutYourInformationPage(driver);
    }
}

