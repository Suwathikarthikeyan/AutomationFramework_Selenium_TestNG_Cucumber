package pages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchButton = By.xpath("//a[contains(@href,'/search') and normalize-space()='Search']");
    By searchResultHeader = By.xpath("//h1[contains(text(),'Search')]");

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }

    public boolean isSearchPageDisplayed() {
        return driver.findElement(searchResultHeader).isDisplayed();
    }
}
