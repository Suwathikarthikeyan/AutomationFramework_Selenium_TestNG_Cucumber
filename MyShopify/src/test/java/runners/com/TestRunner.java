package runners.com;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions.com",
        plugin = {"pretty", "html:reports/cucumber.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
