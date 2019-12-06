# teste-backend-gleiton
Teste backend de edição de notícias.

## Pré-requisitos
* Maven; <br>
* Java pelo menos JRE 8. <br>

## Instruções de como instalar:
1 - Fazer o clone do projeto; <br>
2 - No terminal e dentro da pasta raiz do projeto executar os comandos abaixo:<br>
$ mvn install <br>
$ java -jar ./target/teste-backend-0.0.1-SNAPSHOT.jar <br>
3 - No navegador, acessar o link: http://localhost:8080/artigos/lista

### Observações sobre importar o projeto no Eclipse:<br>
1 - Antes de importar, executar o seguinte comando no terminal à pasta raiz do projeto:<br>
$ mvn clean eclipse:clean eclipse:eclipse -DdownloadSources=true<br>
2 - Se for a primeira vez, esperar um pouco =/;<br>
3 - Importar o projeto no Eclipse (File -> Import...)<br>
4 - e subir o servidor clicando sobre o projeto com o botão direito do mouse escolhendo a opção: Run As -> Spring Boot App;<br>

## Tecnologias utilizadas
1 - Java JDK 8;<br>
2 - Back-end: Spring Boot;<br>
3 - Front-end: Thymeleaf, Bootstrap.<br>
