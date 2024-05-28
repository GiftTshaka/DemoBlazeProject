package Steps;


import Pages.HomePage;
import io.cucumber.java.en.*;

public class StepDefinition extends Base {


    @Given("I am logged in as a customer")
    public void I_am_logged_in_as_a_customer() {

    }

    @When("I click the customer login button")
    public void i_click_the_customer_login_button() {
        homePage.clickCustomerLoginButton();

    }

    @Then("I should see home screen")
    public void i_should_see_home_screen() {

    }

    @Then("I select first customer name")
    public void i_select_first_customer_name() {
        homePage.selectCustomerName();
    }

    @Then("I click login button")
    public void i_click_login_button() {
        homePage.clickLoginButton();
    }

    @Then("I should see welcome")
    public void i_should_see_welcome() {

    }

    @Then("I select the first account")
    public void i_select_the_first_account() {
        accountPage.selectAccount();
    }

    @Then("I click deposit button")
    public void i_click_deposit_button() {
        accountPage.clickDepositButton();

    }

    @Then("^I enter the (.*)$")
    public void i_select_the_first_account(int amount) {
        accountPage.enterAmount(String.valueOf(amount));


    }

    @Then("I click deposit button_2")
    public void i_click_deposit_button_2() {
        accountPage.clickDepositButton2();


    }

    @Then("the deposit should be successful")
    public void the_deposit_should_be_successful() {
        accountPage.verifyDepositSuccess();

    }

    @Then("Select logout button")
    public void Select_logout_button() {
        accountPage.logOutButton();

    }
}