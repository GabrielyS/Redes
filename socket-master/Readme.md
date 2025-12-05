# Chat WebSocket 

## Descrição
Este é um projeto de demonstração de uma aplicação Java utilizando Spring Boot e WebSockets. O objetivo é criar uma comunicação em tempo real entre cliente e servidor, permitindo a troca instantânea de mensagens entre usuários conectados.

## Pré-requisitos
*   Java JDK 17 ou superior
*   Maven 3.6 ou superior
* Intellij IDEA (opcional)

## Instalação e Execução

1.  Clone o repositório:
    ```bash
    git clone <https://github.com/GabrielyS/Redes>
    ```
2.  Navegue até a pasta do projeto:
    ```bash
    cd socket-master
    ```
3.  Compile e execute o projeto via Maven:
    ```bash
    ./mvnw spring-boot:run
    ```
4. Abra o chat no navegador, acesse:
    ```bash
   http://localhost:8080/index.html
   ```

## Como o Chat funciona

1. Conexão com o servidor:
   * O usuário digita um nickname.
   * Ao clicar em Connect, o navegador cria uma conexão WebSocket com o servidor:
   * Essa conexão fica aberta enquanto o usuário permanecer conectado.

2. Envio e recebimento de mensagens
   * O usuário escreve uma mensagem e clica em Send.
   * O navegador envia a mensagem através da conexão WebSocket.
   * O servidor recebe a mensagem, adiciona o horário e envia de volta para todos os usuários conectados.
   * Todas as mensagens aparecem automaticamente na página, sem precisar atualizar.
   
3. Desconexão
   * Ao clicar em Disconnect, o navegador fecha a conexão com o servidor.
   * O usuário deixa de enviar e receber mensagens, mas a página continua aberta.
   
### Gabriely Silva
