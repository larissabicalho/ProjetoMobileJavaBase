Feature: Alerts

  @app
  Scenario: Alert Button
    When clicar no menu lateral
    And clicar no menu Alerts
    And clicar no botao Alert
    Then verificar a mensagem do alerta

  @app
  Scenario: Toast Button
    When clicar no menu lateral
    And clicar no menu Alerts
    And clicar no botao Toast
    Then clicar no Toast e validar Mensagem
