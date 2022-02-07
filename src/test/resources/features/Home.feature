Feature: Acessar app AWS

  @app
  Scenario: Acessar app
    Given acesso o app AWS
    When Clicar no menu lateral
    And clicar no menu Login
    Then serei feliz

  @app
  Scenario: Acessar app denovo
    Given acesso o app AWS
    When Clicar no menu lateral
    And clicar no menu Login
    Then serei feliz
