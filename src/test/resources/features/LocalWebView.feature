Feature: Acessar app

  @app
  Scenario: Verificar Se Acessou o Google
    When clicar no menu lateral
    And clicar no menu LocalWebView
    Then verificar texto Principal

  @app
  Scenario Outline: Verificar Se Acessou o Google
    When clicar no menu lateral
    And clicar no menu LocalWebView
    And preencher nome <nome>
    And preencher lastName <lastName>
    Then verificar texto con nome <nome> e lastName <lastName>

    Examples:
    |nome| lastName|
    |Larissa| Bicalho|
    |João   | Keller |
    |Marcela| Louback|
    |Marcos | Mourão |