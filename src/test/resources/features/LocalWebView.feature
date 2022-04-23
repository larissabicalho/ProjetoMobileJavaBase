Feature: Local Web View

  @app
  Scenario: Verificar Se LocalWebView Aparece Texto
    When clicar no menu lateral
    And clicar no menu LocalWebView
    Then verificar texto Principal

  @app
  Scenario Outline: Preencher Nome e LastName
    When clicar no menu lateral
    And clicar no menu LocalWebView
    And preencher nome <nome>
    And preencher lastName <lastName>
    Then verificar texto con nome <nome>

    Examples:
    |nome| lastName|
    |Larissa| Bicalho|
    |João   | Keller |
    |Marcela| Louback|
    |Marcos | Mourão |