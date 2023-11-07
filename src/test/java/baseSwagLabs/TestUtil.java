package baseSwagLabs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestUtil extends DataProviders {
    public WebDriver driver;
    private String testURL, browser;
    private int implicitWait;

    @BeforeMethod
    public void setupDriverAndOpenTestAddress() {
        readConfig("src/test/resources/config.properties");
        setupDriver();
        driver.get(testURL);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    private void readConfig(String fullPathToConfigFile) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fullPathToConfigFile);
            Properties properties = new Properties();
            properties.load(fileInputStream);

            testURL = properties.getProperty("testURL");
            browser = properties.getProperty("browser");
            implicitWait = Integer.parseInt(properties.getProperty("implicitWait"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void setupDriver() {
        switch (browser) {
            case "chrome":
                driver = setupChromeDriver();
                break;
            case "firefox":
                driver = setupFireFoxDriver();
                break;
            default:
                driver = setupEdgeDriver();
        }
    }

    private WebDriver setupChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private WebDriver setupFireFoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private WebDriver setupEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}
