@Before
@Login
Feature: Test login functionality
//@smoke: scenario1
  Scenario Outline: check login is scussessfull with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user click on login
    #Then user is navigated to the home page
    #And user enters <Country> <Address><Email><Phone>
    #Then user details should be saved
    
    Examples: 
      | username | password |
      | sri      | 12345 |         
            

       
      