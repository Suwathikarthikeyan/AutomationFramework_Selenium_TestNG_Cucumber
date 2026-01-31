package pages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By loginButtonHome = By.id("customer_login_link");

    By username = By.id("customer_email");
    By password = By.id("customer_password");
    By loginBtn = By.xpath("//input[@value='Sign In']");


    public void clickLoginFromHome() {
        driver.findElement(loginButtonHome).click();
    }
    
    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }
}
