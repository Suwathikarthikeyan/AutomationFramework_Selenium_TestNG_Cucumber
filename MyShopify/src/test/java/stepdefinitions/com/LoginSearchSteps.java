package stepdefinitions.com;

import org.testng.Assert;

import Base.com.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.com.LoginPage;
import pages.com.SearchPage;

public class LoginSearchSteps extends Base {

    LoginPage login;
    SearchPage search;

    @When("user logs in")
    public void user_logs_in() {
        launchBrowser("firefox");
        launchUrl("https://sauce-demo.myshopify.com/");

        login = new LoginPage(driver);
        login.clickLoginFromHome();   
        login.login("suwathikarthikeyan10@gmail.com", "password123");
        
    }

    @When("user clicks on search")
    public void user_clicks_on_search() {
        search = new SearchPage(driver);
        search.clickSearch();
    }

    @Then("search results page should be displayed")
    public void search_results_page_should_be_displayed() {
        Assert.assertTrue(
                search.isSearchPageDisplayed(),
                "Search Results page is not displayed"
        );
        driver.quit();
    }
}
