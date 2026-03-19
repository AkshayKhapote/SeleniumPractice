@sanity

Feature: Verify that LogOut functionality


  Background: 
    Given user open the login page of application
    And user Enter Valid user name as "mngr654835"
    And User Enter valid password as "gagedut"
    When user click on login button
    Then user navigate to Homepage

  Scenario: To verify that user can logout the application after login
    When User click on logout button
    And User read logout msg and  click on ok button
    Then user is navigate to loginpage
