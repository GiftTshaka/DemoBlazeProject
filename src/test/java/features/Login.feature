@Regression,@Login
Feature: Login as a Customer and deposit


  Scenario Outline: Customer deposits 1500 into their first account
    Given I am logged in as a customer
    When I click the customer login button
    Then I should see home screen
    Then I select first customer name
    Then I click login button
    Then I should see welcome
    Then I select the first account
    Then I click deposit button
    Then I enter the <amount>
    Then I click deposit button_2
    Then the deposit should be successful
    Then Select logout button
    Examples:
      | amount |
      | 1500   |

