
@Home
Feature: Enter Homepage Information
//@smoke: scenario2
  Scenario Outline: check user enters homepage details
    Given home page is open
    When  Enter HomePage details <address> and  <email> 
    And user click on Save
    Then user details should be saved
        
    Examples: 
      | address|email|
      | address1 |abc@gmail.com|       
      
	       
      