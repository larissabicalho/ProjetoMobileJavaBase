Feature: Input
  @app
  Scenario Outline: Text Field
    When clicar no menu lateral
    And clicar no menu Input
    And escrever Texto <texto>
    Then verificar se o texto esta escrito <texto>

    Examples:
      |texto|
      |Texto 2|
      |Texto 3|
      |Texto 4|
      |Texto 5|
      |Texto 6|
      |Texto 7|

  @app
  Scenario: Checkbox
    When clicar no menu lateral
    And clicar no menu Input
    And clicar no menu Checkbox
    And clicar no checkbox
    Then verificar se o checkbox foi clicado


  @app
  Scenario Outline: Radio
    When clicar no menu lateral
    And clicar no menu Input
    And clicar no menu RadioButton
    And clicar no radio <site>
    Then verificar se o radio foi clicado <site>

    Examples:
      |site|
      |Amazon|
      |Web|
      |Services|

  @app
  Scenario: Toggle
    When clicar no menu lateral
    And clicar no menu Input
    And clicar no menu ToggleButton
    And clicar no toggle
    Then verificar se toggle foi clicado


  @app
  Scenario Outline: Spinner
    When clicar no menu lateral
    And clicar no menu Input
    And clicar no menu Spinner
    And clicar no spinner <spinner>
    Then verificar se spinner foi selecionado <spinner>
    Examples:
      |spinner|
      |option 1|
      |option 2|
      |option 3|
      |option 4|
      |option 5|
      |option 6|

  @app
  Scenario: Pull to Refresh
    When clicar no menu lateral
    And clicar no menu Input
    And clicar no menu PullToRefresh
    And faz o pull refresh na tela
    Then verificar hora atual aparecendo


  @app
  Scenario Outline: Time Picker
    When clicar no menu lateral
    And clicar no menu Input
    And clicar no menu TimePickerScreen
    And adicionar hora <hora> e minuto <minutos>
    And colocar o turno <turno>
    Then verificar se hora <hora> e minutos <minutos> e qual turno <turno>

    Examples:
      |hora|minutos|turno|
      |6   |45     |AM   |
      |6   |30     |PM   |
      |12  |45     |AM   |
      |12  |30     |PM   |
      |7   |45     |PM   |


  @app
  Scenario Outline: Date Picker
    When clicar no menu lateral
    And clicar no menu Input
    And clicar no menu DatePickerScreen
    And mudar o ano
    And clicar mudar o mes para anterior
    And mudar o dia <dia>
    Then verificar o ano
    Examples:
      |dia|
      |22 |

  @app
  Scenario: Submit
    When clicar no menu lateral
    And clicar no menu Input
    And clicar no menu Submit
    Then clicar no submit Toast e validar Mensagem

  @app
  Scenario Outline: Gestures Long Press
    When clicar no menu lateral
    And clicar no menu Input
    And clicar no menu Gestures
    And escolher um m??todo de Gestures LongPress
    Then verifica a ultima acao <acao>
    Examples:
    | acao|
    |Long Press|

  @app
  Scenario Outline: Gestures Single Tap
    When clicar no menu lateral
    And clicar no menu Input
    And clicar no menu Gestures
    And escolher um m??todo de Gestures Tap
    Then verifica a ultima acao <acao>
    Examples:
      |acao|
      |Single tap confirmed|

    #n??o rodar browserstack
  @naoRodarBrowserStack
  Scenario Outline: Gestures Double Tap
    When clicar no menu lateral
    And clicar no menu Input
    And clicar no menu Gestures
    And escolher um m??todo de Gestures Double Tap
    Then verifica a ultima acao <acao>
    Examples:
      |acao|
      |Event within double tap|

  @app
  Scenario Outline: Gestures Scroll
    When clicar no menu lateral
    And clicar no menu Input
    And clicar no menu Gestures
    And escolher um m??todo de Gestures Scroll
    Then verifica a ultima acao <acao>
    Examples:
      |acao|
      |Scroll|

  @app
  Scenario Outline: Gestures Fling
    When clicar no menu lateral
    And clicar no menu Input
    And clicar no menu Gestures
    And escolher um m??todo de Gestures Fling
    Then verifica a ultima acao <acao>
    Examples:
       |acao|
       |Fling |
