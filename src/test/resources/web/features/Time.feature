@AllTestTime
Feature: As a client I want modified times
  Background:
    Given The client is on page tracker

  @CreacionTime @Successfull @Smoke
  Scenario Outline: The client is in page tracker
    When The client set the name of time "Time"
    When The client on log in button Manual
    When The client sets the start time <startTime>
    When The client sets the end time <endTime>
    When The client sets the date <fecha>
    When The client on log in button add
    Then The client sees a successful message created

    Examples:
      | startTime | endTime |  fecha |
      | "12:00" | "12:30" | "07/06/2023"  |

  @CancelacionTime @Successfull @Smoke
  Scenario: The client is in page tracker
    When The client set the name of time "Time"
    When The client on log in button Timer
    When The client on log in button Start
    When The client on log in button Menu
    When The client on log in button Discard
    When The client on log in button Confirmacion Discard
    Then The client sees a successful message created

  @ModificacionNombreTime @Successfull @Smoke
  Scenario Outline: The client is in page tracker
    When The client modify the name of time <nombreTime>
    When The client log in div to save changes
    Then The client sees a successful message created

    Examples:
      | nombreTime      |
      | "Modificacion1" |
      | "Modificacion2" |


