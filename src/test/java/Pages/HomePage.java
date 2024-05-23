package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {


    public WebDriver driver;

    @FindBy(xpath = "//button[contains(@ng-click,'customer()')]")
    WebElement customer_login_xpath;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCustomerLoginButton() {
        customer_login_xpath.click();
    }


    }
