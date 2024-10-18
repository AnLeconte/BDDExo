Feature: Product Search

  Scenario: Search for products
    Given the user is on the homepage
    When the user enters a keyword in the search bar
    And the user submits the search
    Then the user should see a list of relevant search results