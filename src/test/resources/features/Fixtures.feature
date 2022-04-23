Feature: Fixtures

  @app
  Scenario: Long Text
    When clicar no menu lateral
    And clicar no menu Fixtures
    Then verificar Long

  @app
  Scenario: Lat Text
    When clicar no menu lateral
    And clicar no menu Fixtures
    Then verificar Lat

  @app
  Scenario: Wifi Text
    When clicar no menu lateral
    And clicar no menu Fixtures
    Then verificar Wifi

    #não rodar browserstack e no emulador
  @app
  Scenario: Blu true
    When clicar no menu lateral
    And clicar no menu Fixtures Blu
    Then verificar Blu True


  @app
  Scenario: Blu off
    When clicar no menu lateral
    And clicar no menu Fixtures
    Then verificar Blu False

  @app
  Scenario: GPS Text
    When clicar no menu lateral
    And clicar no menu Fixtures
    Then verificar GPS


  @app
  Scenario: NFC Text
    When clicar no menu lateral
    And clicar no menu Fixtures
    Then verificar NFC