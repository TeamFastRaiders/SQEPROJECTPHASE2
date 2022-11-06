Feature: Checking change password functionality

  Scenario Outline: The user is able to change their password
    # Scenario Outline: The user is able to change their password
    Given user is logged in with <current password>
    And I have a valid <current password> and <new password>
    When I open the Edit Details page
    And I enter <current password> and <new password>
    And I confirm <new password>
    And I click on Apply
    Then my password is changed successfully

    Examples: 
      | current password | new password    |
      | correctpassword  | anotherpassword |
      | alsoapassword    | mypass12        |
