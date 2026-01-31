package tests.com;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.com.Base;
import pages.com.LoginPage;
import pages.com.SearchPage;

public class LoginSearchTest extends Base {

    @BeforeMethod
    public void setup() {
    	 launchBrowser("firefox");
         launchUrl("https://sauce-demo.myshopify.com/");
    }

    @Test
    public void loginAndSearch() {

        LoginPage login = new LoginPage(driver);
        login.clickLoginFromHome();
        login.login("suwathikarthikeyan10@gmail.com", "password123");

        SearchPage search = new SearchPage(driver);
        search.clickSearch();

        Assert.assertTrue(
            search.isSearchPageDisplayed(),
            "Search Results page not displayed"
        );
    }
}
