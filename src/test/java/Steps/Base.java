package Steps;

import Helpers.BrowserFactory;

import Pages.AccountPage;
import Pages.CustomerPage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome","https://www.way2automation.com/angularjs-protractor/banking/#/login");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    AccountPage accountPage = PageFactory.initElements(driver, AccountPage.class);
    CustomerPage customerPage = PageFactory.initElements(driver,CustomerPage.class);


}
