Feature: Checking login functionality

  Scenario Outline: The user is able to login using valid credentials
    Given that user has <email> and <password>
    When the user opens the login page
    And the user enters valid <email> and <password>
    Then the user successfully logs in
    And the home catalog page is displayed

    Examples: 
      | email                 | password        |
      | correctemail@test.com | correctpassword |
      | alsoanemail@test.com  | alsoapassword   |