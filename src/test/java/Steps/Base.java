package Steps;

import Helpers.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome","http://www.way2automation.com/angularjs-protractor/banking/#/login");



}
