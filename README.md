
![bannerprojeto](https://user-images.githubusercontent.com/22267601/165681863-3f86f68f-1505-41cb-8125-276e11b40fd0.png)

Este projeto foi criado com o intuito de fornecer aplicativo para automação de testes.

O sistema alvo é o <b>AWS DEVICE FARM</b>

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

 ## Instalações
<ul>
  <li><b> Linguagem - Java 8 </b></a></li>
  <li><a href="https://github.com/appium/appium-desktop/releases">Appium Desktop</a> </li>
  <li><a href="https://nodejs.org/en/download/"> Node.js </a> </li>
  <li><b> Abra um terminal  </b></li>
    <b>Execute o comando: </b> 
  
   ```
      npm install -g appium  
   ```
  <li><b><a href="https://developer.android.com/studio?gclid=CjwKCAjw9qiTBhBbEiwApGE0VYny4bpmDm4qTUgZlJBSEzAoo9dWUIGS72_47baqLRJRIwqOfrU2RoC2m8QAvD_BwE&gclsrc=aw.ds"> Android Studio </a> </b></a></li>
 
 <li><b> Instalar SDK </b></a></li>
</ul>

 ## Sdk Via Android Studio
 
 Ao abrir o Android Studio pela primeira vez, será aberta a janela para um novo projeto do Android Studio. Clique no botão SDK Manager (Gerenciador do SDK) 
 
 ![android-sdk-9- primeira](https://user-images.githubusercontent.com/22267601/165809447-cf3b6089-7b30-4a28-b024-553f3a6b01fe.jpg)
 
 Aparecerá a janela do SDK Manager, onde você pode selecionar os pacotes de plataformas que você quer baixar.
 
 ![segunda](https://user-images.githubusercontent.com/22267601/165810278-abbd20c7-5295-4927-85c6-f122bea45a80.jpg)
 
 Aperte “OK”, e o Android SDK estará instalado e configurado.
 
 ##	Instalar  Appium	Doctor ##
 
  <li><b> Abra um terminal  </b></li>
    <b>Execute o comando: </b> 
  
   ```
       npm install -g appium-doctor  
   ```

## Configurações de variáveis de ambiente ##

Após a instalação dos itens anteriores, é necessário configurar as variáveis de ambiente, para isso:

<ul>
  <li><b>Acesse o menu INICIAR do Windows</b></a></li>
  <li><b>Pesquise por "editar as variáveis de ambiente do sistema"</b></li>
  <li><b>Clique em Variáveis de Ambiente</b></li>
  <li><b>Na tabela Variáveis do sistema clique em Novo</b></li>
  <li><b>Inclua as seguintes variáveis:</b> </li>
  <li><b> Abra um terminal  </b></li>
    <b>Execute o comando: </b> 
    
  ```
     JAVA_HOME - C:\Program Files (x86)\Java\SEU_JDK
     ANDROID_HOME - C:\Users\NOMEUSUARIO\AppData\Local\Android\Sdk
     ANDROID_SDK_ROOT - C:\Users\NOMEUSUARIO\AppData\Local\Android\Sdk
  ```
  
  ![ambiente](https://user-images.githubusercontent.com/22267601/165814822-d168d8ef-3854-4fd2-9000-c26c1f30cf52.png)
  
  <li><b>Na variável já existente PATH, inclua os demais valores:</b></li>


```
    %ANDROID_HOME%\platforms
    %JAVA_HOME%\bin
    %ANDROID_HOME%\tools
    %ANDROID_HOME%\platform-tools
  	%ANDROID_HOME%\tools\bin
   	%ANDROID_HOME%\emulator
 
```
  
  ![ambiente2](https://user-images.githubusercontent.com/22267601/165815116-7f84b57a-f0cd-403f-a704-11ef861bd249.png)
  
</ul>

<b> Como saber se está tudo funcionando? </b>

Para realizar um diagnóstico se está tudo configurado corretamente vamos usar o appium-doctor. Appium-doctor tem os parâmetros android e ios para que você se as configurações estão corretas para o uso de cada tipo de sistema operacional, para isso:
<b> Abra um terminal  </b>
    <b>Execute o comando: </b> 
    
  ```
    appium-doctor --android
  ```

 E caso a análise de dependência retorne algum erro, o item ficará com o símbolo em vermelho e uma sugestão para resolver o problema será apresentada.
 
![ambiente3](https://user-images.githubusercontent.com/22267601/165815591-6ead15e2-594b-45ed-8395-02573babdd09.png)
 
![deviceReal](https://user-images.githubusercontent.com/22267601/165816174-f0e6c7fa-b4c0-43a4-a00a-57c159be360b.png)
 
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
