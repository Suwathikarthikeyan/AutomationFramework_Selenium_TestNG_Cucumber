package Base.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

    protected static WebDriver driver;

    public void launchBrowser(String browser) {

        if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
    }

    public void launchUrl(String url) {
        driver.get(url);
    }

    public void quitBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
