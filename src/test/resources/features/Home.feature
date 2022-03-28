Feature: Home App

  @app
  Scenario: Acessa Home
    When clicar no menu lateral
    And clicar no menu Home
    Then valido frase Home

    @app
  Scenario: Acessar Home Texto Inválido
    When clicar no menu lateral
    And clicar no menu Home
    Then valido frase Home