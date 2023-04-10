Feature: Google Application
@mobile
  Scenario: search Functionality
    Given user is on google Home Page
    When user enter "mobile"
    And click on SearchButton
    Then result should display for "mobile" is "mobile - Google Search"