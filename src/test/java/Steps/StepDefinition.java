package Steps;


import Pages.HomePage;
import io.cucumber.java.en.*;

public class StepDefinition extends Base {


    @Given("I am logged in as a customer")
    public void  I_am_logged_in_as_a_customer() {

    }

    @When("I click the customer login button")
    public void i_click_the_customer_login_button() {
        homePage.clickCustomerLoginButton();

    }
//
//    @Then("I should see home screen")
//    public void i_should_see_home_screen() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("I select first customer name")
//    public void i_select_first_customer_name() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("I click login button")
//    public void i_click_login_button() {
//
//    }
//
//    @Then("I should see welcome")
//    public void i_should_see_welcome() {
//
//    }
//
//    @Then("I select the first account")
//    public void i_select_the_first_account() {
//
//    }
//
//    @Then("I deposit the one thousand five hundred")
//    public void i_deposit_the_one_thousand_five_hundred() {
//
//    }



}
