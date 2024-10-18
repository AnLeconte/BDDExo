Feature: Product Navigation

  Scenario: Navigate by category
    Given the user is on the categories page
    When the user clicks on a category
    Then the user should see products corresponding to that category