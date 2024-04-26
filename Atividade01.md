# Rest API

## Definição

Uma API REST (Representational State Transfer) é um conjunto de princípios de arquitetura de software para sistemas distribuídos. Ela define um conjunto de regras para criar serviços web que permitem a comunicação entre sistemas de maneira uniforme e eficiente.

## Conceitos Envolvidos

### 1. Recursos
  - Em uma API REST, **tudo** é considerado um recurso, como usuários, produtos ou pedidos em um sistema.
  
### 2. URI (Uniform Resource Identifier)
  - Cada recurso é identificado por uma URI única, que permite acessar, manipular e interagir com ele.

### 3. Métodos HTTP
  - A interação com os recursos é feita através dos métodos HTTP, como GET, POST, PUT e DELETE, que indicam a ação a ser realizada no recurso.

### 4. Representações
  - Os recursos podem ter diferentes representações, como JSON ou XML, que são utilizadas para transmitir e manipular os dados.

### 5. Estado da Aplicação
  - A comunicação entre cliente e servidor é stateless, ou seja, o servidor não mantém o estado da comunicação entre as requisições.

## Principais Características

### 1. Arquitetura Cliente-Servidor
  - A API REST segue o modelo cliente-servidor, onde o cliente realiza requisições e o servidor responde a elas.

### 2. Stateless
  - A comunicação é stateless, o que significa que cada requisição do cliente contém todas as informações necessárias para ser processada pelo servidor, sem depender de requisições anteriores.

### 3. Interface Uniforme
  - A interface da API é uniforme, o que facilita sua compreensão e utilização por parte dos desenvolvedores. Isso é alcançado através do uso consistente de URIs, métodos HTTP e tipos de mídia.

### 4. Recursos Identificáveis
  - Cada recurso na API é identificável por uma URI única, o que permite acessá-lo e manipulá-lo de forma independente dos outros recursos.

### 5. Manipulação de Recursos através de Representações
  - Os recursos são manipulados através de representações, como JSON ou XML, que são transmitidas entre cliente e servidor para realizar operações de criação, leitura, atualização e exclusão.

## Conclusão

🚀 Uma API REST é uma poderosa ferramenta para facilitar a comunicação entre sistemas distribuídos de forma eficiente e padronizada. Ao seguir os princípios da arquitetura REST, é possível criar interfaces de programação simples e flexíveis, que permitem aos desenvolvedores criar aplicações robustas e escaláveis. 
