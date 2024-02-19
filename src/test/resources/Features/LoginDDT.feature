Feature: user is able to login DDT
  @Regression
  Scenario Outline: user login by clicking "login" button DDT

    Given student is on login page
    When student types the <username> and <password>
    And clicks on the Login button DDT
    Then the student is sent  to the congratulations page
    Examples:
      | username | password |
      | student  | pass123  |
      | student  | Password123 |
      | Student  | Password123 |