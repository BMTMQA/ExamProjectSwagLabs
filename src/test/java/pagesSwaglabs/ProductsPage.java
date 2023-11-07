package pagesSwaglabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BasePage {
    @FindBy(xpath = "//*[text()[contains(.,'Products')]]")
    WebElement pageTitle;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement backpackAddButton;
    public WebElement getBackpackAddButton() {
        return backpackAddButton;
    }

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement backpackRemoveButton;
    public WebElement getBackpackRemoveButton() {
        return backpackRemoveButton;
    }

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement bikeLightAddButton;
    public WebElement getBikeLightAddButton() {
        return bikeLightAddButton;
    }

    @FindBy(id = "remove-sauce-labs-bike-light")
    WebElement bikeLightRemoveButton;
    public WebElement getBikeLightRemoveButton() {
        return bikeLightRemoveButton;
    }

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement boltTShirtAddButton;
    public WebElement getBoltTShirtAddButton() {
        return boltTShirtAddButton;
    }

    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    WebElement boltTShirtRemoveButton;
    public WebElement getBoltTShirtRemoveButton() {
        return boltTShirtRemoveButton;
    }

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement fleeceJacketAddButton;
    public WebElement getFleeceJacketAddButton() {
        return fleeceJacketAddButton;
    }

    @FindBy(id = "remove-sauce-labs-fleece-jacket")
    WebElement fleeceJacketRemoveButton;
    public WebElement getFleeceJacketRemoveButton() {
        return fleeceJacketRemoveButton;
    }

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement onesieAddButton;
    public WebElement getOnesieAddButton() {
        return onesieAddButton;
    }

    @FindBy(id = "remove-sauce-labs-onesie")
    WebElement onesieRemoveButton;
    public WebElement getOnesieRemoveButton() {
        return onesieRemoveButton;
    }

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElement allTheThingsTShirtAddButton;
    public WebElement getAllTheThingsTShirtAddButton() {
        return allTheThingsTShirtAddButton;
    }

    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    WebElement allTheThingsTShirtRemoveButton;
    public WebElement getAllTheThingsTShirtRemoveButton() {
        return allTheThingsTShirtRemoveButton;
    }

    @FindBy(className = "shopping_cart_link")
    WebElement shoppingCartLink;

    public ProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public boolean IsAt() {
        return pageTitle.isDisplayed();
    }

    public YourCartPage selectProducts(WebElement product1, WebElement product2) {
        product1.click();
        product2.click();

        shoppingCartLink.click();

        return new YourCartPage(driver);
    }
}
