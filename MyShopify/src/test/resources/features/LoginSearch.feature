Feature: Login and Product Search

  Scenario: Login and navigate to search page
    When user logs in
    And user clicks on search
    Then search results page should be displayed
