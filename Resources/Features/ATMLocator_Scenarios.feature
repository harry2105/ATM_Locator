Feature:  ATM Locator

  Scenario: Validate Branches only tab
    Given User have Application url to launch
    When User click on Branches only tab
    Then All the branches are displayed on the page

   
   Scenario: Validate Branches and ATM tab
    Given User have Application url to launch
    When User click on Branches & ATMS tab
    Then All the branches and ATM's are displayed on the page
    
   Scenario: Validate Branches and ATM tab
    Given User have Application url to launch
    Then Verify all the links in the webPapge
    
    
   Scenario: Validate Branches and ATM tab
    Given User have Application url to launch
    Then Verify Map is displayed on the page
    
    
   Scenario: Validate Branches and ATM tab
    Given User have Application url to launch
    Then Verify Map is displayed on the page
    And Map Zoom In and Zoom out functionality is present in the page
    
    
   Scenario: Validate Branches and ATM tab
    Given User have Application url to launch
    Then Verify Search box is present for branchs only
    
   Scenario: Validate Branches and ATM tab
    Given User have Application url to launch
    Then Verify Search box is present for branchs & ATM's
    
    
    