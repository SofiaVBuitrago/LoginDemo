Feature: user is able to login

  @Smoke
  Scenario: user login by clicking "login" button

    Given user is on login page
    When user types the username and password
    And clicks on the Login button
    Then the user is sent  to the congratulations page