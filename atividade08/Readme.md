# Atividade de Tratamento de Exceções em Java

Esta atividade consiste em várias classes Java que demonstram o tratamento de exceções em diferentes cenários de programação. Cada classe é projetada para lidar com situações específicas onde exceções podem ocorrer, utilizando mecanismos de tratamento para garantir a robustez e confiabilidade do código.

## Classes e Descrições

### 1. Classe Divisao
- **Arquivo**: [DivisaoSegura.java](atividade08/DivisaoSegura.java)
- **Descrição**: Esta classe aceita a entrada de dois números do usuário e realiza a divisão do primeiro pelo segundo, tratando exceções específicas.
- **Exceções Tratadas**:
  - `ArithmeticException`: Captura tentativas de divisão por zero.
  - `InputMismatchException`: Captura entradas que não são números inteiros.