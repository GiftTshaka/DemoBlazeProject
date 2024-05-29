package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Helpers.BrowserFactory.driver;

public class AccountPage {
    public WebDriver driver;
    @FindBy(xpath = "//select[@id='accountSelect']")
    WebElement select_Account;
    @FindBy(xpath = "//button[contains(.,'Deposit')]")
    WebElement Deposit_Button;
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement Amount_xpath;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Deposit')]")
    WebElement Deposit_Button2;

    @FindBy(xpath = "//span[@class='error ng-binding'][contains(.,'Deposit Successful')]")
    WebElement Deposit_Successful;

    @FindBy(xpath = "//button[@ng-show='logout'][contains(.,'Logout')]")
    WebElement Click_Logout_Button;


    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectAccount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(select_Account));
        select_Account.click();
        Select select = new Select(select_Account);
        select.selectByVisibleText("1001");
    }

    public void clickDepositButton() {
        Deposit_Button.click();
    }

    public void enterAmount(String amount) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(Amount_xpath));
        Amount_xpath.clear();
        Amount_xpath.sendKeys(amount);


    }

    public void clickDepositButton2() {
        Deposit_Button2.click();
    }

    public void verifyDepositSuccess() {

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(Deposit_Successful));


    }

    public void DepositInAllAccounts(Integer amount){
        Deposit_Button.click();

        for (int i = 1001;i<=1003;i++){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(select_Account));
            select_Account.click();
            Select select = new Select(select_Account);
            select.selectByVisibleText(Integer.toString(i));
            enterAmount(Integer.toString(amount));
            clickDepositButton2();
            verifyDepositSuccess();
        }
    }


    public void logOutButton() {
        Click_Logout_Button.click();
    }
}
