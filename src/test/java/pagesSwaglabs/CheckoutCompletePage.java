package pagesSwaglabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage extends BasePage{
    @FindBy(xpath = "//*[text()[contains(.,'Complete')]]")
    WebElement pageTitle;

    @FindBy(xpath = "//*[text()[contains(.,'Thank you for your order!')]]")
    WebElement completeMessage;
    public WebElement getCompleteMessage() {
        return completeMessage;
    }

    public CheckoutCompletePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public boolean IsAt() {
        return pageTitle.isDisplayed();
    }
}
