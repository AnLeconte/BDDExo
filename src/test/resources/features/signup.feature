Feature: User Signup

  Scenario: Successful account creation
    Given the user is on the signup page
    When the user enters a valid email, username, and password
    And the user submits the signup form
    Then the user should see a confirmation message

  Scenario: Account creation with existing username
    Given the user is on the signup page
    When the user enters an existing username
    And the user submits the signup form
    Then the user should see an error message