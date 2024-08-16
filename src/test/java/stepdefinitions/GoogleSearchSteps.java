package stepdefinitions;

import org.openqa.selenium.WebDriver;
import pages.GoogleHomePage;
import utils.WebDriverManager;
import io.cucumber.java.en.*;

public class GoogleSearchSteps {
    WebDriver driver;
    GoogleHomePage googleHomePage;
    WebDriverManager webDriverManager;

    @Given("I open Google homepage")
    public void i_open_google_homepage() {
        WebDriverManager webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
        driver.get("https://www.google.com");
        googleHomePage = new GoogleHomePage(driver);
    }

    @When("I enter {string}")
    public void i_enter(String searchTerm) {
        googleHomePage.enterSearchTerm(searchTerm);
    }

    @When("I click the search button")
    public void i_click_the_search_button() {
        googleHomePage.clickSearchButton();
    }

    @Then("I should see the search results")
    public void i_should_see_the_search_results() {
        // Add assertions to verify search results
       webDriverManager.closeDriver();
    }
}
