@sanity
Feature: Create new Customer Account

  Background: 
    Given user open the login page of application
    And user Enter Valid user name as "mngr654835"
    And User Enter valid password as "gagedut"
    When user click on login button
    Then user navigate to Homepage

  Scenario Outline: Create new customer Acccount with using new customerID
    And User Click on new account link
    And user Enter Customer ID as "<CustomerID>"
    And User Select account type from dropdown
    And user enter initial deposite amount as "<amount>"
    When User Click on submit button
    Then Validate User can see the new account is displayed.

    Examples: 
      | CustomerID | amount   |
      |    36274 | 62772792 |
