package pagesSwaglabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage extends BasePage {
    @FindBy(xpath = "//*[text()[contains(.,'Overview')]]")
    WebElement pageTitle;

    @FindBy(xpath = "//*[text()[contains(.,'Backpack')]]")
    WebElement itemBackpack;
    public WebElement getItemBackpack() {
        return itemBackpack;
    }

    @FindBy(xpath = "//*[text()[contains(.,'Fleece Jacket')]]")
    WebElement itemFleeceJacket;
    public WebElement getBackpack() {
        return itemFleeceJacket;
    }

    @FindBy(xpath = "//*[text()[contains(.,'Bike Light')]]")
    WebElement itemBikeLight;
    public WebElement getItemBikeLight() {
        return itemBikeLight;
    }

    @FindBy(xpath = "//*[text()[contains(.,'Bolt T-Shirt')]]")
    WebElement itemBoltTShirt;
    public WebElement getItemBoltTShirt() {
        return itemBoltTShirt;
    }

    @FindBy(xpath = "//*[text()[contains(.,'Onesie')]]")
    WebElement itemOnesie;
    public WebElement getItemOnesie() {
        return itemOnesie;
    }

    @FindBy(xpath = "//*[text()[contains(.,'T-Shirt (Red)')]]")
    WebElement itemTShirtRed;
    public WebElement getItemTShirtRed() {
        return itemTShirtRed;
    }

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    WebElement totalPrice;
    public WebElement getTotalPrice() {
        return totalPrice;
    }

    @FindBy(id = "finish")
    WebElement finish;

    public CheckoutOverviewPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public boolean IsAt() {
        return pageTitle.isDisplayed();
    }

    public CheckoutCompletePage finishOrder(){
        finish.click();

        return new CheckoutCompletePage(driver);
    }
}
