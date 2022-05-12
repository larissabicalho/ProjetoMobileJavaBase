
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
    <i>Execute o comando: <i> <br>
  
   ```
      npm install -g appium  
   ```
  <li><b><a href="https://developer.android.com/studio?gclid=CjwKCAjw9qiTBhBbEiwApGE0VYny4bpmDm4qTUgZlJBSEzAoo9dWUIGS72_47baqLRJRIwqOfrU2RoC2m8QAvD_BwE&gclsrc=aw.ds"> Android Studio </a> </b></a></li>
 
 <li><b> Instalar SDK </b></a></li>
</ul>

 ## SDK Via Android Studio
 
<ul>
  <li> Ao abrir o Android Studio pela primeira vez, será aberta a janela para um novo projeto do Android Studio. Clique no botão SDK Manager (Gerenciador do SDK) </li>
</ul>
 
 <p align="center">
   <img src="https://user-images.githubusercontent.com/22267601/165809447-cf3b6089-7b30-4a28-b024-553f3a6b01fe.jpg" width=100% height=40% >
</p>
 
 
 <ul>
    <li> Aparecerá a janela do SDK Manager, onde você pode selecionar os pacotes de plataformas que você quer baixar. </li>
  <ul> <br>
 
  <p align="center">
     <img src="https://user-images.githubusercontent.com/22267601/165810278-abbd20c7-5295-4927-85c6-f122bea45a80.jpg" width=100% height=40% >
  </p>  
  <br>
<ul>
  <li> Aperte “OK” e o Android SDK estará instalado e configurado. </li>
</ul>
 
 ##	Instalar  Appium	Doctor ##
 <ul>
    <li><b> Abra um terminal  </b></li> 
  </ul>
    <i>Execute o comando: <i> 
     <br>
      
  
   ```
       npm install -g appium-doctor  
   ```

## Configurações de variáveis de ambiente ##

Após a instalação dos itens anteriores, é necessário configurar as variáveis de ambiente, para isso: <br>
  <ul>
    <li>Acesse o menu INICIAR do Windows</li>
    <li>Pesquise por "editar as variáveis de ambiente do sistema" </li>
    <li> Clique em Variáveis de Ambiente </li>
    <li> Na tabela Variáveis do sistema clique em Novo </li>
    <li> Inclua as seguintes variáveis:</li>
    <li>  Abra um terminal </li> <br>
    <i>Execute o comando: <i> 
    
  ```
     JAVA_HOME - C:\Program Files (x86)\Java\SEU_JDK
     ANDROID_HOME - C:\Users\NOMEUSUARIO\AppData\Local\Android\Sdk
     ANDROID_SDK_ROOT - C:\Users\NOMEUSUARIO\AppData\Local\Android\Sdk
  ```
   <p align="center">
    <img src="https://user-images.githubusercontent.com/22267601/165965711-0f79080b-fa72-4be4-9af2-68616a7d4333.png" width=50% height=40% >
   </p>
  
  <li>Na variável já existente PATH, inclua os demais valores:</li> <br>
      


```
     %ANDROID_HOME%\platforms
     %JAVA_HOME%\bin
     %ANDROID_HOME%\tools
     %ANDROID_HOME%\platform-tools
  	 %ANDROID_HOME%\tools\bin
     %ANDROID_HOME%\emulator

```
  
  <p align="center">
        <img src="https://user-images.githubusercontent.com/22267601/165815116-7f84b57a-f0cd-403f-a704-11ef861bd249.png" width=50% height=40% >
   </p>
</ul>

<b> Como saber se está tudo funcionando? </b>

Para realizar um diagnóstico se está tudo configurado corretamente vamos usar o appium-doctor. Appium-doctor tem os parâmetros android e ios para que você se as configurações estão corretas para o uso de cada tipo de sistema operacional, para isso: <br>
 <ul>
   <li> <b> Abra um terminal  </b> <br> </li>
 </ul> <br>
    <i>Execute o comando: <i> 
    
  ```
    appium-doctor --android
  ```

<b> E caso a análise de dependência retorne algum erro, o item ficará com o símbolo em vermelho e uma sugestão para resolver o problema será apresentada. </b>
       
  <p align="center">
        <img src="https://user-images.githubusercontent.com/22267601/165968299-bc10fb27-8b80-4cfb-b51d-092ffaca01d5.png" width=100% height=40% >
   </p>

![deviceReal](https://user-images.githubusercontent.com/22267601/165816174-f0e6c7fa-b4c0-43a4-a00a-57c159be360b.png)
      </br>
      <b> Para executar o teste em um device real é necessário alguns passos </b> </br>
 
 #### Habilitar o Modo Desenvolvedor  ####
      
   1. Abra o menu de "Configurações" do seu celular, role a aba até o final e clique em "Sobre o telefone". <br>
   
       <p align="center">
        <img src="https://user-images.githubusercontent.com/22267601/165866592-42d597ae-141d-48ca-9868-55d5b65ce6fe.png" width=50% height=40% >
      </p>
  
   2. Role a aba seguinte até o final e clique várias vezes sobre o item "Número da versão" até que a mensagem "Você agora é um desenvolvedor" seja exibida.
  
        <p align="center">
        <img src="https://user-images.githubusercontent.com/22267601/165867039-b0aa71c2-b06c-4f31-894b-ac263aab7fdd.png" width=50% height=40% >
      </p>

   3. Acessando a aba "Sistema", é possível encontrar o item "Opções do desenvolvedor".
      
        <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165867124-f68590c6-5513-45d7-955d-3d019681af15.jpeg" width=50% height=40% >
        </p>
      
  #### Habilitar Depuração USB  ####
  
   1. Já com o modo desenvolvedor ativado, acesse as configurações do sistema e toque em "Programador"
      <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165867540-6918ae9e-8922-4cd1-8418-9b0bc598e575.png" width=50% height=40% >
        </p>
   2. Role a tela até a seção "Depuração" e habilite a opção "Depuração USB". Em seguida, toque em "OK" para confirmar
        <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165867654-b45ef533-d13c-44a2-9161-e7b38255b18a.png" width=50% height=40% >
      </p>
 
 
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165867747-0b8c9aff-7af0-4246-87ca-4b08273ac3b9.png" width=50% height=40% >
      </p>
  
![emulador](https://user-images.githubusercontent.com/22267601/165867968-6489c6da-6003-4241-a8da-3ba63d717e68.png)
      
#### Executar os testes com Emulador ####

1. Utilizando o prompt do Windows vá até a pasta onde se encontra o sdk é encontre o emulador é digite o seguinte comando conforme a imagem: </br>
    
    <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165868287-7f42153d-da27-4b89-bab5-bb75962d8e09.png" width=100% height=40% >
      </p>

2. Execute o Emulador escolhido da seguinte forma:
    
     <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165868551-48689334-f6a0-458c-9caf-05c253041ac0.png" width=100% height=40% >
      </p>

![appiuminspector](https://user-images.githubusercontent.com/22267601/165868740-0609872f-8377-4f91-b51c-1857b9c471ea.png)
    
#### Passos para utilizar o Appium Inspector ####
    
1. Abrir Appium Inspector que agora é um componente isolado: </br>
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165869125-41a6db09-b3d8-4ecf-b19e-966844c96643.png" width=100% height=40% >
      </p>
      
2. Montar o JSON
 ```
  {
  "platformName": "Android",
  "platformVersion": "9.0",
  "app": "pasta apk",
  "deviceName": "nome do device",
  "automationName": "uiautomator2"
  }

  ```
      
      
 ps: Será explicado mais a frente como pegar o nome do device

3. Salvar o Json 
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165870225-ad6bc887-62be-4ad9-a5d6-ab03d0f5d816.png" width=100% height=40% >
      </p>
     
4. Dar o Start na Seção 
         <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165870335-f1c6166d-30b1-46f7-9a5e-556ba22a31c1.png" width=100% height=40% >
      </p>

![appiuminspectormapeamento](https://user-images.githubusercontent.com/22267601/165870502-845e1730-8095-4725-a611-61801fe860b0.png)

<b> Após ser feita a etapa anterior uma nova aba será aberta com a tela do celular e uma árvore como está os elementos da tela, como abaixo:</b>
         <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165968998-a9c6848a-7114-4926-818b-7c2508b3e6cb.png" width=100% height=40% >
      </p>

 #### Verificar Locator ####
1. Abrir a Lupa 
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165970320-5abe38bc-3852-452f-a7af-9887b57d85f9.png" width=100% height=40% >
      </p>
2. Colocar o Locator 
        <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165970849-6dffff25-594b-445a-bdcb-3098d10e51fe.png" width=100% height=40% >
      </p>
3. Ver se vai encontrar através desse Locator
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/165971113-81927538-1bb0-4c21-9571-965347478d64.png" width=100% height=40% >
      </p>

![definicaoprojeto](https://user-images.githubusercontent.com/22267601/165971747-16467fc5-54b8-4188-9d47-1d743f8d511a.png)

   #### Algumas definições de Implementação do Projeto ####

 -  Mais de 25 casos de teste <br>
   Features <br>
      <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167215306-ff13ac6c-3460-400e-a945-b6aa0f2fb9d8.jpg" width=50% height=40% >
      </p>
      
  Bluetooth - Ligar para que possar ser mostrado como true na Feature Fixtures
      <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167215572-81801191-6e73-4999-bfd5-0879bc474c63.jpg" width=50% height=40%>
      </p>
  
  Data Driven - Exemplo de Data Driven utilizando BDD     
      <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167215976-efcef390-2ab8-48fb-a9d9-8c323f5a19d1.jpg" width=50% height=40% >
      </p>
  Screen Toast 
      <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167216200-80400e6d-8f08-4456-8327-40dedf908699.jpg" width=100% height=40% >
      </p>
   Verificar o Toast
      <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167216473-bfd00896-e701-42fc-be0d-644ed6bedf94.png" width=40% height=20% >
      </p>
  ps : Foi necessário clicar 2 vezes no Submitted <br>
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167216700-5928c334-fb95-48ad-8720-cff6a9861cde.jpg" width=100% height=40% >
      </p>
   Screen de uma tela
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167216986-72843378-6e63-4ca9-9a87-3b32061b3682.png" width=40% height=20% >
      </p>
      
   Configurações para rodar Device Real, Emulador e Browserstack <br>     
    - É necessário para rodar no Device Real os caso de teste Bluetooth roda apenas no deviceReal
      <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167217637-c4f46561-1067-48c4-a1d5-f1799feda041.jpg" width=100% height=60% >
      </p>
     - É necessário para rodar no Browserstack retirar o teste de Input de Double Click
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167217906-09ece542-7b2e-4517-929e-ef1dc74443e8.jpg" width=100% height=40% >
      </p>
    - Resultado de um relatório 
        <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167218048-fda20b9c-6f73-4c87-96b5-4b119bf34ba3.jpg" width=100% height=40% >
      </p>
![executarescritas](https://user-images.githubusercontent.com/22267601/167218496-73bc6ee8-f546-448e-bb95-dd7c80179d13.png)
## Device Real ##
- Achar deviceName 
      <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167219525-6da88cb4-d21a-4155-a3a3-ed4c04f6d784.jpg" width=100% height=40% >
      </p>
## Achar os packages ## 
- Exemplo o PlayStore
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167219634-04d625ee-4648-485f-b76c-559a3f6c6704.jpg" width=100% height=40% >
      </p>
- Abrir o Shell do Device
        <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167219885-83187b24-fd82-4b46-a100-8ae819ec22ed.jpg" width=100% height=40% >
      </p>
- Abrir o Aplicativo no device no qual quer o appActivity e o Package e após digitar o seguinte comando:
        <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167220296-4bed3f31-b420-4850-97d2-c45b9bb06d7e.png" width=100% height=40% >
      </p>
## Configuração no Intellij para rodar o Device ##
- No global parameters e necessário ajustar as seguintes variáveis:
        <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167220624-320a68c2-b7be-4b1c-825c-4221adb239b8.png" width=50% height=40% >
      </p>
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167220789-8f128dd9-89d8-4621-947f-7b05feba2796.png" width=100% height=40% >
      </p>
ps: a configuração para um Emulador é a mesma de um deviceReal 
      
![executarescritas2](https://user-images.githubusercontent.com/22267601/167221029-cdf03edc-3a68-4ae2-9ef0-7e12bc4df1ae.png) 
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167221514-eb76df9d-3c41-4b7b-a5ee-c21ba10d0ada.jpg" width=100% height=40% >
      </p>
- Upload APK
       <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167221926-977a6c74-6c5b-493d-889c-1a36cbb29022.png" width=100% height=40% >
      </p>
- Abrirá essa nova janela (Para achar o AppAndroidUploadBrowserStack)
        <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167222191-6d292767-3dda-4f0c-b8f1-04861b2d258c.jpg" width=80% height=40% >
      </p>
- Para achar os dados do AcessKey e Username
         <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167222426-39eb0a30-82e0-4062-8932-552c26216e3c.png" width=100% height=40% >
      </p>
- Configuração no Intellij
         <p align="center">
         <img src="https://user-images.githubusercontent.com/22267601/167222525-eb155f15-2659-4bcb-8031-2444fc7d01e0.png" width=100% height=40% >
      </p>
