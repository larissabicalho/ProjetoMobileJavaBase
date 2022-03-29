Feature: Home App

  @app
  Scenario: Acessa Home
    When clicar no menu lateral
    And clicar no menu Login
    And efetuar o login
    Then verificar Login Admin

  @app
  Scenario: Acessa Home
    When clicar no menu lateral
    And clicar no menu Login
    And efetuar o login errado
    Then verificar Login Errado


  @app
  Scenario: Acessa Home
    When clicar no menu lateral
    And clicar no menu Login
    And efetuar o login
    And clicar Logout
    Then verificar tela principal

  @app
  Scenario: Acessa Home
    When clicar no menu lateral
    And clicar no menu Login
    And efetuar o login errado
    And clicar TryButton
    Then verificar tela principal
