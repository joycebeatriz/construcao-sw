# Atividade de Tratamento de Exceções em Java

Esta atividade consiste em várias classes Java que demonstram o tratamento de exceções em diferentes cenários de programação. Cada classe é projetada para lidar com situações específicas onde exceções podem ocorrer, utilizando mecanismos de tratamento para garantir a robustez e confiabilidade do código.

## Classes e Descrições

### 1. Classe Divisao
- **Arquivo**: [DivisaoSegura.java](https://github.com/joycebeatriz/construcao-sw/blob/main/atividade08/DivisaoSegura.java)
- **Descrição**: Esta classe aceita a entrada de dois números do usuário e realiza a divisão do primeiro pelo segundo, tratando exceções específicas.
- **Exceções Tratadas**:
  - ArithmeticException: Captura tentativas de divisão por zero.
  - InputMismatchException: Captura entradas que não são números inteiros.

  ### 2. Classe VetorDeInteiros
- **Arquivo**: [VetorDeInteiros.java](https://github.com/joycebeatriz/construcao-sw/blob/main/atividade08/VetorComExcecoes.java)
- **Descrição**: Permite ao usuário preencher um vetor de 10 posições com números inteiros. O preenchimento para quando o usuário digita o número 0, que também é adicionado ao vetor.
- **Exceções Tratadas**:
  - `ArrayIndexOutOfBoundsException`: Captura quando mais de 10 números são inseridos.
  - `InputMismatchException`: Captura quando a entrada não é um número inteiro.

  ### 3. Classe Login
- **Arquivos**: 

  [Login.java](https://github.com/joycebeatriz/construcao-sw/blob/main/atividade08/Login.java)

  [LoginInvalidoException.java](https://github.com/joycebeatriz/construcao-sw/blob/main/atividade08/LoginInvalidoException.java)

  [TesteLogin.java](https://github.com/joycebeatriz/construcao-sw/blob/main/atividade08/TesteLogin.java)


- **Descrição**: Permite a criação de uma instância com usuário e senha e contém um método para validar o login.
- **Métodos**:
  - `fazer_login(usuario, senha)`: Verifica se o usuário e senha fornecidos são válidos.
- **Exceções Tratadas**:
  - `LoginInvalidoException`: Personalizada, lançada quando o usuário ou senha estão incorretos.


  ### 4. Classe ContaBancaria
- **Arquivos**: 

  [ContaBancaria.java](https://github.com/joycebeatriz/construcao-sw/blob/main/atividade08/ContaBancaria.java)

  [SaldoInsuficienteException.java](https://github.com/joycebeatriz/construcao-sw/blob/main/atividade08/SaldoInsuficienteException.java)

  [TesteContaBancaria.java](https://github.com/joycebeatriz/construcao-sw/blob/main/atividade08/TesteContaBancaria.java)


- **Descrição**: Gerencia um saldo e permite operações de depósito e saque, com tratamento de exceções para garantir que as operações sejam válidas.
- **Métodos**:
  - `depositar(valor)`: Adiciona um valor ao saldo.
  - `sacar(valor)`: Deduz um valor do saldo.
- **Exceções Tratadas**:
  - `SaldoInsuficienteException`: Personalizada, lançada quando há tentativa de sacar um valor superior ao saldo disponível.