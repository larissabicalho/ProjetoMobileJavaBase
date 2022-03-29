Feature: Acessar app

  @app
  Scenario: Verificar Se Galeria Existe
    When clicar no menu lateral
    And clicar no menu Native
    And verificar se existe galeria

  @app
  Scenario: Verificar Imagens Restantes
    When clicar no menu lateral
    And clicar no menu Native
    And verificar o resto das imagens

  @app
  Scenario Outline: Verificar ContentScrolling
    When clicar no menu lateral
    And clicar no menu Native
    And clicar no menu ContentScrolling <value>
    Then texto final aparece

    Examples:
      | value |
      | 9|

  @app
  Scenario: Verificar Imagens Restantes
    When clicar no menu lateral
    And clicar no menu Native
    And clicar no menu VideoPlayer
    Then verificar se o video apareceu

  @app
  Scenario: Verificar Imagens Restantes
    When clicar no menu lateral
    And clicar no menu Native
    And clicar no menu Camera
    Then verificar se o camera apareceu

  @app
  Scenario: Verificar Imagens Restantes
    When clicar no menu lateral
    And clicar no menu Native
    And clicar no menu ContentOutOfView
    Then verificar se o texto escondido aparece