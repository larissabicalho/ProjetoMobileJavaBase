Feature: Home App

  @app
  Scenario: Acessar Home Texto Inválido
    When clicar no menu lateral
    And clicar no menu Nested Views
    And clicar no Up Navigation
    And clicar no Next Level
    Then verificar Final Level

  @app
  Scenario Outline: Verificar ContentScrolling

    When clicar no menu lateral
    And clicar no menu Nested Views
    And clicar no Back Navigation
    And clicar no Next Level Back <valor>
    Then verificar quantidade de level <valor>

    Examples:
      |valor|
      |1 |
      |2 |
      |3 |
      |4 |

  @app
  Scenario: Verificar ContentScrolling

    When clicar no menu lateral
    And clicar no menu Nested Views
    And clicar no Back Navigation
    And clicar no Back Navigation Menu Principal
    Then verificar se voltou para inicial

  @app
  Scenario: Verificar ContentScrolling

    When clicar no menu lateral
    And clicar no menu Nested Views
    And clicar no Up Navigation
    And clicar no Back Navigation Menu Principal
    Then verificar se voltou para inicial

