Feature: Acessar app
Background:

  Given acesso o app

  @app
  Scenario: Acessar app
    When clicar no menu lateral
    And clicar no menu Home
    Then valido frase Home