Feature: Login Scenario with multiple credentials

  Scenario Outline: Validate  Login Scenario with multiple credentials
    Given user Open the browser URl
    And User enters the Username as "<Username>"
    And User enters the Password as "<Password>"
    When User clicks on login button
    Then user will be navigated to homepage

    Examples: 
      | Username | Password   |
      | abcd     | test@1234  |
      | efgh     | test@12343 |
      | fhjk     | test@12122 |

  Scenario Outline: Validate  Login Scenario with multiple credentials
    Given user Open the browser URl
    And User enters the Username as "<Username>"
    And User enters the Password as "<Password>"
    When User clicks on login button
    Then user will be navigated to homepage
    But an error message is thrown that user credentials are wrong

    Examples: 
      | Username | Password   |
      | abcd     | test@1234  |
      | efgh     | test@12343 |
      | fhjk     | test@12122 |
