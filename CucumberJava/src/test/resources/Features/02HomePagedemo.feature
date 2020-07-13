
@Home
Feature: Enter Homepage Information
//@smoke: scenario2
  Scenario Outline: check user enters homepage details
    Given home page is open
    When  Enter HomePage details <country> and <address> and  <email> and <phone>
    And user click on Save
    Then user details should be saved
        
    Examples: 
      |country| address|email|phone|
      |India| address1 |abc!gmail.com|12345678|       
      
	       
      