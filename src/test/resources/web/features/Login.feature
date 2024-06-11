Feature: As a potential client I want to login in clockify

  Background:
    Given The client is on home page
    When The client on log in button on landing page
    When the client on log in manually button

  @LoginSuccessfull @Smoke
  Scenario Outline: The client login in clockify
    When the client set the mail <email>
    When The client set the password <password>
    When The client verify is on dashboard
    Then The client is on main page

    Examples:
      | email                          | password     |
      | "melisadelaunay97@gmail.com" | "Pass1234" |


  @LoginFallido @Smoke
  Scenario Outline: The client login in clockify fail mail bad
    When the client set the mail <email>
    When The client set the password <password>
    Then The client sees a bad format error message.

    Examples:
      | email                          | password     |
      | "usuariooo@@example.com" | "Pass1234" |
      | "usuarionoexisteexample.com"  | "Pass1234"     |


  Scenario: The client login in clockify fail password bad
    When the client set the mail "melisadelaunay97@gmail.com"
    When The client set the password "melisadelaunay97@gmail.com"
    When The client verify is on dashboard
    Then  The client sees an error message


  Scenario: The client login in clockify with a non-existent user
    When the client set the mail "melisadelaunay@gmail.com"
    When The client set the password "Pass1234"
    Then  The client sees an error message


  Scenario: The client login in clockify with a non-existent user
    When the client set the mail "melisadelaunay@gmail.com"
    Then  The client does not see the active button

