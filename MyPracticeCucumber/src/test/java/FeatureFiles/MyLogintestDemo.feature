Feature: Login Scenarios Testing
@regression
  Scenario: Validate Loginfunctionality with Correct Credentials
    Given user Open the browser URl
    And User enters the Username
    And User enters the Password
    When User clicks on login button
    Then user will be navigated to homepage
    #And Validatipon that navigation is successfully
