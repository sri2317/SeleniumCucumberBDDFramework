Feature: Test login functionality
@smoke
  Scenario Outline: check login is scussessfull with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user click on login
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | sri      | 12345 |         
      | kanth    | 12345 |         
              
