Feature: Home App

  @app
  Scenario: Acessa Home
    When clicar no menu lateral
    And clicar no menu Alerts
    And clicar no botao Alert
    Then verificar a mensagem do alerta

  @app
  Scenario: Acessa Home
    When clicar no menu lateral
    And clicar no menu Alerts
    And clicar no botao Toast
    Then clicar no Toast e validar Mensagem
