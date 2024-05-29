@BankOps
Feature: Customer Deposit and Transactions

  Background: Given I am logged in as a customer

Scenario: Deposit 1500 into each account and validate
Given I am logged in as a customer
When I click the 'Customer Login' button
Then I should see home screen
Then I select first customer name
Then I click 'Login' button
Then I should see welcome
And I select the first account
And I click 'Deposit' tab
Then I deposit 1500 into each account
And I click 'Deposit' button
#    Then I validate the deposit was successful
And I logout

Scenario: Deposit and withdraw specific amount and validate transactions
Given I am logged in as a customer
When I click the 'Customer Login' button
Then I should see home screen
Then I select first customer name
Then I click 'Login' button
Then I should see welcome
And I select the first account
And I click 'Deposit' tab
    #    Then I deposit <amount>
Then I deposit 31459 into the field
And I click 'Deposit' button
Then I validate the deposit was successful
When I open transactions
Then I validate the transaction appears
Then I logout
Then I select first customer name
Then I click 'Login' button
Then I should see welcome
And I click 'Withdrawl' tab
And I withdraw 31459
And I click 'Withdraw' button
Then I validate the current balance is the original balance
When I open transactions
Then I validate the transaction appears
And I logout
# Examples:
#  | amount |
#  | 1500   |
#  | 31459  |