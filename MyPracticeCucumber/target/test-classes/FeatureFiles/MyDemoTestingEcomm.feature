
Feature: Validate Ecommerce functionality

  Background: 
    Given user opens the browser url
    And User enters the username as "abcd"
    And User enters the password as "efgh"
    When user click on login button
    Then user will be navigated to homepage of application

  Scenario: Validate Search product functionality
    And user will search electronic product
    And User will add it to card

  Scenario: Validate Search lifestyle product functionality
    And user will search lifestyle product
    And User will add it to card

  Scenario: Validate Search clothing product functionality
    And user will search clothing product
    And User will add it to card
