Feature: As a potential client I want to create a new proyect

  @Workspace @Successfull @Smoke
  Scenario: The client is in page tracker
    Given The client is on page tracker
    When The client on log in button menu proyecto
    When The client on log in button Crear proyecto
    When The client set the name of proyecto "Proyecto"
    When The client on log in button Create
    Then The client sees a successful message
