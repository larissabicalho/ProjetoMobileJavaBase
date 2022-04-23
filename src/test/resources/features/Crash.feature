Feature: Crash

  @app
  Scenario: Crash Button
    When clicar no menu lateral
    And clicar no menu Crash
    Then verificar se existe o botao crash

