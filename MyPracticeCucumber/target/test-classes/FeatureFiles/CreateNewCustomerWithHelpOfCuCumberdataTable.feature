Feature: Create new Customer help of cucumberdate table
  
  Scenario: Create new customer with Validate details
  Given user Open the browser URl
  And User Enter username as "mngr654835"
  And user Enter Password as "gagedut"
  When user Click on login button
  Then User is navigate to homePage
  And user enter customer details to create new customer
    | customerName | doB        | address  | city  | state | pin    | mobileNumber | email           | Password  |
      | John         | 06-08-1997 | km nagar | delhi | ncr   | 713304 |   9832178797 | pgtfr@gmail.com | Test1234  |
