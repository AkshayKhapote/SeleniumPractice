@sanity
Feature: Login Feature

  Scenario Outline: Validate login functionality with correct credentials
    Given User opens the login of the application
    And User enter the Username as "<username>"
    And User enter the Password as "<password>"
    When User clicks on login button
    Then Validate user will be navigated to homepage
    And User closed browser

    Examples: 
      | username   | password |
      | mngr654835 | gagedut  |
      | mngr656158 | pAjArYq  |
