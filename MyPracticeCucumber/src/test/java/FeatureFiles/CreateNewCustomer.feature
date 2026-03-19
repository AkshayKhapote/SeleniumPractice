@sanity
Feature: Creation of New Customder for Guru99 Demo App

  Background: 
    Given user opens the login of the application
    And user enters the username as "mngr654835"
    And user enters password as "gagedut"
    When user click on login button
    Then Validate user will navigated to homepage

  Scenario Outline: New Customer Creation with all Credentails
    And user click on the new customer link
    And user enters the customername as "<customerName>"
    And user selects the gender
    And user enters the DOB as "<doB>"
    And User enters the  address as "<address>"
    And User enters the city  as "<city>"
    And user enters the State as  "<state>"
    And user enters the pin as "<pin>"
    And user enters the mobileNumber as "<mobileNumber>"
    And user enter the email 
    And user enter the password as "<Password>"
    When User Click on submit button
    Then new customer is created
    And user captures the customer id

    Examples: 
      | customerName | doB        | address  | city  | state | pin    | mobileNumber | email           | Password  |
      | John         | 06-08-1998 | km nagar | delhi | ncr   | 713304 |   9832178797 | pgtfr@gmail.com | Test1234  |
