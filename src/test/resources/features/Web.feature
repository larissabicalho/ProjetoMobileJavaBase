Feature: Acessar app
  @app
  Scenario Outline: Verificar Se Acessou o Google
    When clicar no menu lateral
    And clicar no menu Web
    And entrar no site
    And selecionar o site <web>
    Then valido o site

    Examples:
    |web|
    |https://www.google.com.br|