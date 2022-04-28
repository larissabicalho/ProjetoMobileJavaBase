
![bannerprojeto](https://user-images.githubusercontent.com/22267601/165681863-3f86f68f-1505-41cb-8125-276e11b40fd0.png)

Este projeto foi criado com o intuito de fornecer aplicativo para automação de testes.

O sistema alvo é o AWS DEVICE FARM.

👉 Desenvolvimento de Features utilizando a linguagem Gherkin atráves do Cucumber </br>
👉 Desenvolvimento de testes unitários para validação de funcionalides básicas

|Component |
|----------|
|Alerts: [Toasts](http://developer.android.com/guide/topics/ui/notifiers/toasts.html) and [Dialogs](http://developer.android.com/guide/topics/ui/dialogs.html)|
|Crash|
|Fixtures|
|Inputs|
|Local Web View|
|Login Page|
|Native|
|Nested View|
|Web View|

## Examples for Native Features
|Feature |
|--------|
|[Camera](http://developer.android.com/guide/topics/media/camera.html)  |
|[Image Collection Grid](http://developer.android.com/guide/topics/ui/layout/gridview.html)|
|[Scroll View](http://developer.android.com/reference/android/widget/ScrollView.html)|
|[Video](http://developer.android.com/reference/android/media/MediaPlayer.html)|

## Examples for Inputs
|Component |
|----------|
|[Checkbox](http://developer.android.com/reference/android/widget/CheckBox.html)|
|[DatePicker](http://developer.android.com/reference/android/widget/DatePicker.html)|
|[EditText](http://developer.android.com/reference/android/widget/EditText.html)|
|[Gestures Input](http://developer.android.com/training/gestures/index.html)|
|[Pull to Refresh](https://developer.android.com/reference/android/support/v4/widget/SwipeRefreshLayout.html)|
|[Radio Buttons](http://developer.android.com/guide/topics/ui/controls/radiobutton.html)|
|[TimePicker](http://developer.android.com/reference/android/widget/TimePicker.html)|
|[Toggle Button](http://developer.android.com/guide/topics/ui/controls/togglebutton.html)|
|[Spinner Input](http://developer.android.com/guide/topics/ui/controls/spinner.html)|
|[Buttons](http://developer.android.com/reference/android/widget/Button.html)|

## Examples for Navigation
|Component|
|----------|
|[Navigation Drawer](https://developer.android.com/training/implementing-navigation/nav-drawer.html)|
|[ViewPager](http://developer.android.com/reference/android/support/v4/view/ViewPager.html)| </br>


👉 Criação de Testes Data Driven Utilizando BDD
<ul>
  <li><b>Feature Input</b> (Text Field,  Radio, Spinner, Time Picker) </a></li>
  <li><b>Feature Local Web View</b> (Preencher Nome e LastName) </a></li>
  <li><b>Nested View</b> (Quantidade de Levels) </a></li>
</ul>

👉 Execução Parelela de Testes no BrowserStack </br>


![escritas](https://user-images.githubusercontent.com/22267601/165765039-3ff0dcb6-57da-40e5-809d-f2a399d96dd2.png)

<ul>
  <li><b> Linguagem - Java 8 </b></a></li>
  <li><b> Orquestrador de testes - TestNG 7.3.0 </b></a></li>
  <li><b> Relatório de testes automatizados - ExtentReports 3.1.5 </b></a></li>
  <li><b> Framework interação com elementos mobile - Appium 1.22.0 </b></a></li>
  <li><b> BDD - Cucumber 4.8.1 </b></a></li>
</ul>

![setupescritas](https://user-images.githubusercontent.com/22267601/165795825-cb43061e-1086-49d3-9d8c-9a5fbf2b211f.png)

 ## Configurações Appium


Instalar⦁	 ⦁	Java⦁	 ⦁	8⦁	 ⦁	(Java⦁	 ⦁	JDK⦁	 ⦁	-⦁	 ⦁	build⦁	 ⦁	1.8.0_241-b07)
Instalar⦁	 ⦁	Appium⦁	 ⦁	Desktop
Instalar⦁	 ⦁	Node
⦁	Instalar Appium NPM
⦁	Abra um terminal
⦁	Execute o comando: npm install -g appium
Instalar⦁	 ⦁	SDK⦁	 ⦁	Android
Baixar⦁	 ⦁	SDK⦁	 ⦁	Tools
⦁	Ir até Android Studio package
⦁	Baixar o Android SDK via zip
⦁	Extrair arquivos
⦁	Colar arquivos na pasta Tools: (C:\Users\NOMEUSUARIO\AppData\Local\Android\Sdk\tools)
⦁	Instalar ⦁	Appium⦁	 ⦁	Doctor
⦁	Abra um terminal
⦁	Execute o comando: npm install -g appium-doctor


Configurações de variáveis de ambiente


Após a instalação dos itens anteriores, é necessário configurar as variáveis de ambiente, para isso:

⦁	Acesse o menu INICIAR do Windows
⦁	Pesquise por “editar as variáveis de ambiente do sistema”
⦁	Clique em Variáveis de Ambiente…
⦁	Na tabela Variáveis do sistema clique em Novo
⦁	Inclua as seguintes variáveis:
⦁	JAVA_HOME - C:\Program Files (x86)\Java\SEU_JDK
⦁	ANDROID_HOME - C:\Users\NOMEUSUARIO\AppData\Local\Android\Sdk
⦁	ANDROID_SDK_ROOT - C:\Users\NOMEUSUARIO\AppData\Local\Android\Sdk

 


⦁	Na variável já existente PATH, inclua os demais valores:
```
 ⦁ %ANDROID_HOME%\platforms
⦁	%JAVA_HOME%\bin
⦁	%ANDROID_HOME%\tools
⦁	%ANDROID_HOME%\platform-tools
⦁	%ANDROID_HOME%\tools\bin
⦁	%ANDROID_HOME%\emulator
  ```



Como saber se está tudo funcionando?

Para realizar um diagnóstico se está tudo configurado corretamente vamos usar o appium-doctor. Appium-doctor tem os parâmetros android e ios para que você se as configurações estão corretas para o uso de cada tipo de sistema operacional, para isso:

⦁	Abra um terminal
⦁	Execute o comando: appium-doctor --android


 E caso a análise de dependência retorne algum erro, o item ficará com o símbolo em vermelho e uma sugestão para resolver o problema será apresentada. Abaixo um caso onde todo o diagnóstico foi feito com sucesso
 
 ## Configurações Device ##
 
## Appium Inspector ##


**Mapeamento de Elementos**


**BrowserStack**

**Upload apk**
**Definições do Projeto**
**Executar Projeto**
- Achar os packages
- Device Real 
- Emulador
- Browserstack
