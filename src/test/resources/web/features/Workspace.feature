Feature: As a client I want to create a new workspace

  Background:
    Given The client is on page tracker
    When The client on log in button menu workspace

  @WorkspaceCreacion @Successfull @Smoke
  Scenario: The client is in page tracker
    When The client on log in button Administrar workspace
    When The client on log in button Crear workspace
    When The client on log in div
    When The client set the name of workspace "WorkspaceMel"
    When The client on log in button Crear

  @WorkspaceModificacion @Successfull @Smoke
  Scenario: The client is in page tracker
    When The client on log in button Settings workspace
    When The client set the workspace name "Mel1234" in the modification.
    When The client on log in button upgrade
    Then The client modify the workspace