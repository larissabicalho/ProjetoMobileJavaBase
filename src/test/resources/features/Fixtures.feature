Feature: Home App

  @app
  Scenario: Acessa Home
    When clicar no menu lateral
    And clicar no menu Fixtures
    Then verificar Long

  @app
  Scenario: Acessa Home
    When clicar no menu lateral
    And clicar no menu Fixtures
    Then verificar Lat

  @app
  Scenario: Acessa Home
    When clicar no menu lateral
    And clicar no menu Fixtures
    Then verificar Wifi

  @app
  Scenario: Acessa Home
    When clicar no menu lateral
    And clicar no menu Fixtures Blu
    Then verificar Blu True


  @app
  Scenario: Acessa Home
    When clicar no menu lateral
    And clicar no menu Fixtures
    Then verificar Blu False

  @app
  Scenario: Acessa Home
    When clicar no menu lateral
    And clicar no menu Fixtures
    Then verificar GPS


  @app
  Scenario: Acessa Home
    When clicar no menu lateral
    And clicar no menu Fixtures
    Then verificar NFC