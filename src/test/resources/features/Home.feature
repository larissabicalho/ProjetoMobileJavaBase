Feature: Acessar app
Background:

  @app
  Scenario: Acessar app
    When clicar no menu lateral
    And clicar no menu Home
    Then valido frase Home

  Scenario: Acessar app
    When clicar no menu lateral
    And clicar no menu Home
    Then valido frase Home