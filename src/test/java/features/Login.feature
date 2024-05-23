@Regression,@Login
Feature: Login


  Scenario: Customer deposits 1500 into their first account
    Given I am logged in as a customer
    When I deposit 1500 into my first account
    Then the deposit should be successful
    And my account balance should increase by $1500