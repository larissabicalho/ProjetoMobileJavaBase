Feature: Login

  @app
  Scenario: Login Adm
    When clicar no menu lateral
    And clicar no menu Login
    And efetuar o login
    Then verificar Login Admin

  @app
  Scenario: Login Errado
    When clicar no menu lateral
    And clicar no menu Login
    And efetuar o login errado
    Then verificar Login Errado


  @app
  Scenario: Logout
    When clicar no menu lateral
    And clicar no menu Login
    And efetuar o login
    And clicar Logout
    Then verificar tela principal

  @app
  Scenario: TryButton
    When clicar no menu lateral
    And clicar no menu Login
    And efetuar o login errado
    And clicar TryButton
    Then verificar tela principal
