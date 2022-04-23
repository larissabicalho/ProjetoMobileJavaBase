Feature: Nested View

  @app
  Scenario: Final Level
    When clicar no menu lateral
    And clicar no menu Nested Views
    And clicar no Up Navigation
    And clicar no Next Level
    Then verificar Final Level

  @app
  Scenario Outline: Quantidade de Levels

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
  Scenario: Verificar Menu Inicial Back Navigation

    When clicar no menu lateral
    And clicar no menu Nested Views
    And clicar no Back Navigation
    And clicar no Back Navigation Menu Principal
    Then verificar se voltou para inicial

  @app
  Scenario: Verificar Menu Inicial Up Navigation

    When clicar no menu lateral
    And clicar no menu Nested Views
    And clicar no Up Navigation
    And clicar no Back Navigation Menu Principal
    Then verificar se voltou para inicial

