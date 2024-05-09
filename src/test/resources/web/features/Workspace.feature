Feature: As a potential client I want to create a new workspace

  @WorkspaceCreacion @Successfull @Smoke
  Scenario: The client is in page tracker
    Given The client is on page tracker
    When The client on log in button menu workspace
    When The client on log in button Administrar workspace
    When The client on log in button Crear workspace
    When The client on log in div
    When The client set the name of workspace "Workspace"
    When The client on log in button Crear

  @WorkspaceModificacion @Successfull @Smoke
  Scenario: The client is in page tracker
    Given The client is on page tracker
    When The client on log in button menu workspace
    When The client on log in button Settings workspace
    When The client set the workspace name "1234" in the modification.
    When The client on log in button upgrade
    Then The client modify the workspace