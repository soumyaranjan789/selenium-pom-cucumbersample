Feature: Google Search

  Scenario: Search for a term on Google
    Given I open Google homepage
    When I enter "Selenium WebDriver"
    And I click the search button
    Then I should see the search results