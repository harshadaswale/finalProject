Feature: Google1 Application
@refrigerator
  Scenario: search Functionality
    Given user is on google Home Page
    When user enter "Refrigerator"
    And click on SearchButton
    Then result should display for "Refrigerator" is "Refrigerator - Google Search"