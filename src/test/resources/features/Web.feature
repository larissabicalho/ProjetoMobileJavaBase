Feature: Acessar app
Background:

  Given acesso o app

  @app
  Scenario: Acessar app
    When clicar no menu lateral
    And clicar no menu Web
    Then valido frase Home