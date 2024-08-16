package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class GoogleHomePage {
    WebDriver driver;
    @FindBy(name = "q")
    WebElement searchBox;

    @FindBy(name = "btnK")
    WebElement searchButton;

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterSearchTerm(String searchTerm) {
        searchBox.sendKeys(searchTerm);
    }

    public void clickSearchButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
    }
}
