Feature: Acessar app
Background:

  Given acesso o app

  @app
  Scenario: Acessar app
    When Clicar no menu lateral
    And clicar no menu Login
    Then serei feliz

  @app
  Scenario: Acessar app email errado
    Given acesso o app
    When Clicar no menu lateral
    And clicar no menu Login
    Then serei feliz

  @app
  Scenario: Acessar app senha errada
    Given acesso o app
    When Clicar no menu lateral
    And clicar no menu Login
    Then serei feliz

  @app
  Scenario: Acessar app email e senha errado
    Given acesso o app
    When Clicar no menu lateral
    And clicar no menu Login
    Then serei feliz

  @app
  Scenario: Acessar app email em branco
    Given acesso o app
    When Clicar no menu lateral
    And clicar no menu Login
    Then serei feliz

  @app
  Scenario: Acessar app senha em branco
    Given acesso o app
    When Clicar no menu lateral
    And clicar no menu Login
    Then serei feliz

  @app
  Scenario: Logout
    Given acesso o app
    When Clicar no menu lateral
    And clicar no menu Login
    Then serei feliz
