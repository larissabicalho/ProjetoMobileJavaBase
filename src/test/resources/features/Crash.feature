Feature: Home App

  @app
  Scenario: Acessa Home
    When clicar no menu lateral
    And clicar no menu Crash
    Then verificar se existe o botao crash

