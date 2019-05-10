Feature:  ATM Locator

  Scenario: Validate Branches only tab
    Given User have Application url to launch
    When User click on Branches only tab
    Then All the branches are displayed on the page

   
   Scenario: Validate Branches and ATM tab
    Given User have Application url to launch
    When User click on Branches & ATMS tab
    Then All the branches and ATM's are displayed on the page