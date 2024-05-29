package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class AccountPage {

    public WebDriver driver;
    List<WebElement> accountsList;

    @FindBy(xpath = "//select[@id='accountSelect']")
    WebElement select_Account;

    @FindBy(xpath = "//button[contains(.,'Deposit')]")
    WebElement deposit_Button;

    @FindBy(xpath = "//input[@type='number']")
    WebElement amount_xpath;

    @FindBy(xpath = "//button[contains(@type,'submit')]")
    WebElement deposit_Submit_Button;

    @FindBy(xpath = "//span[contains(.,'Deposit Successful')]")
    WebElement depositSuccess_xpath;

//    @FindBy(xpath = "(//div[contains(@class,'center')])[1]")
//    WebElement balance_xpath;

    @FindBy(xpath = "(//strong[contains(@class,'ng-binding')])[2]")
    WebElement balance_xpath;

    @FindBy(xpath = "//button[contains(.,'Transactions')]")
    WebElement transactions_xpath;

    @FindBy(xpath = "//div[contains(@class,'fixedTopBox')]")
    WebElement transactionsList_xpath;

    @FindBy(xpath = "//button[contains(.,'Withdrawl')]")
    WebElement withdrawal_xpath;

    @FindBy(xpath = "//input[@type='number']")
    WebElement withdrawAmount_xpath;

    @FindBy(xpath = "//button[contains(@type,'submit')]")
    WebElement withdrawalButton_xpath;

    @FindBy(xpath = "//button[contains(.,'Logout')]")
    WebElement logout_Button;

    private String originalBalance;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectAccount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until (ExpectedConditions.visibilityOf(select_Account));
        select_Account.click();
        Select select = new Select(select_Account);
        select.selectByVisibleText("1001");
    }

    public void clickDepositButton() {
        deposit_Button.click();
    }

    public void enterAmount(String amount){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(amount_xpath));
        amount_xpath.clear();
        amount_xpath.sendKeys(amount);
    }

    public void clickDepositSubmitButton() {
        deposit_Submit_Button.click();
    }

    public void verifyDepositSuccess(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(depositSuccess_xpath));
        String depositSuccessText = depositSuccess_xpath.getText();
        Assert.assertEquals(depositSuccessText, "Deposit Successful");
    }

    public void depositOnEachAccount(int amount) {
        deposit_Button.click();
        for (int i=0; i<3; i++)
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(select_Account));
            select_Account.click();
            Select select = new Select(select_Account);
            select.selectByIndex(i);
            enterAmount(Integer.toString(amount));
            clickDepositSubmitButton();
            verifyDepositSuccess();
        }
    }

    public void openTransactions(){
        transactions_xpath.click();
    }

    public void validateTransactions(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(transactionsList_xpath));
        String transactionsListText = transactionsList_xpath.getText();
        Assert.assertEquals(transactionsListText, "Back\n" + "Reset");
    }

    public void clickWithdrawalButton(){
        withdrawal_xpath.click();
    }

    public void withdrawAmount(String amount){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(withdrawAmount_xpath));
        withdrawAmount_xpath.clear();
        withdrawAmount_xpath.sendKeys(amount);
    }

    public void clickWithdrawSubmitButton() {
        withdrawalButton_xpath.click();
    }

//    public void validateOriginalBalance(){
//    }

    public boolean isBalanceRestored() {
        int currentBalance = Integer.parseInt(balance_xpath.getText());
        return currentBalance == 0;
    }

    public void ClickLogoutButton() {
        logout_Button.click();
    }

    public void quitDriver() {
        if (driver != null) {
            quitDriver();
        }
    }
}
