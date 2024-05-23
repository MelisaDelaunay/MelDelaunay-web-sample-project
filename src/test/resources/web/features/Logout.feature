Feature: As a potential client I want to Log out of clockify

#  Bien resuelto! mejoraria un poco el THEN, verificando via URL o mediante algun texto visible de la main page
  @Logout @Successfull @Smoke
  Scenario: The client is in page tracker
    Given The client is on page tracker
    When el cliente presiona el boton del menu de arriba a la derecha
    When el cliente presiona el boton de cerrar sesión
    Then The client is on main page
