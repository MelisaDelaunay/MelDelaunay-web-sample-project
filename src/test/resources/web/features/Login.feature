# En esta linea se podria agregar un tag @Login para ejecutar TODOS los casos de Login
@Login
Feature: As a potential client I want to login in clockify

  # Algunos puntos que podrian mejorarse
    # 1-Cuando se repiten When, el primero se suele indicar como When, y el resto, And, hasta pasar a un Then. Mejora la legibilidad
      # Given <bla bla bla>
      # And <este es otro Given>
      # When <bla bla bla>
      # And <este es otro When>
      # And <este es otro When>
      # Then <bla bla bla>
      # And <este es otro Then>

    # 2-El nombre de step The client verify is on dashboard tiene aspecto de Then (por la palabra verify) pero hace un click, resulta un poco confuso

    # 3-The client is on main page esta bien orientado, pero utiliza un metodo que se llama getStats(), que busca que determinado componente este vacio...
    # quizas convenga un metodo verifyURL() como para asegurarse que el usuario llego a donde debia llegar, o utilizar algun texto visible de la home y asi
    # tener una verificacion mas robusta

    # 4-Recordar reutilizacion de steps tanto para:
      # Background:
        #Given The client is on home page
        #When The client on log in button on landing page
        #When the client on log in manually button


  @LoginSuccessfull @Smoke
  Scenario Outline: The client login in clockify
    Given The client is on home page
    When The client on log in button on landing page
    When the client on log in manually button
    When the client set the mail <email>
    When The client set the password <password>
    When The client verify is on dashboard
    Then The client is on main page

    Examples:
      | email                          | password     |
      | "melisadelaunay97@gmail.com" | "Pass1234" |


  @LoginFallido @Smoke
  Scenario Outline: The client login in clockify fail mail incorrect
    Given The client is on home page
    When The client on log in button on landing page
    When the client on log in manually button
    When the client set the mail <email>
    When The client set the password <password>
    Then The client sees a bad format error message.

    Examples:
      | email                          | password     |
      | "example@@example.com" | "Pass1234" |
      | "exampleexample.com"  | "Pass1234"     |

  Scenario: The client login in clockify fail password incorrect
    Given The client is on home page
    When The client on log in button on landing page
    When the client on log in manually button
    When the client set the mail "melisadelaunay97@gmail.com"
    When The client set the password "melisadelaunay97@gmail.com"
    When The client verify is on dashboard
    Then  The client sees an error message


  Scenario: The client login in clockify with a non-existent user
    Given The client is on home page
    When The client on log in button on landing page
    When the client on log in manually button
    When the client set the mail "melisadelaunay@gmail.com"
    When The client set the password "Pass1234"
    Then  The client sees an error message

  Scenario: The client login in clockify with a non-existent user
    Given The client is on home page
    When The client on log in button on landing page
    When the client on log in manually button
    When the client set the mail "melisadelaunay@gmail.com"
    Then  The client does not see the active button

