Feature: User Login

  Scenario: Successful login
    Given the user is on the login page
    When the user enters a valid username and password
    And the user submits the login form
    Then the user should be redirected to the homepage

  Scenario: Failed login
    Given the user is on the login page
    When the user enters an invalid username or password
    And the user submits the login form
    Then the user should see an error message