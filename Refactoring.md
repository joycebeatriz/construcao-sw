# Método de Refatoração: "Extract Method"

## O que é:
O método "Extract Method" envolve pegar uma parte do código dentro de um método grande e transformá-lo em um método novo e menor. Isso ajuda a tornar o código mais fácil de entender e de manter.

## Como fazer:

1. **Identifique o Código**: Encontre um bloco de código dentro de um método que faz uma tarefa específica.
2. **Crie um Novo Método**: Crie um novo método que faça essa tarefa específica. Dê um nome claro ao método.
3. **Substitua pelo Novo Método**: Substitua o bloco de código original no método grande por uma chamada ao novo método.

## Exemplo:
Por exemplo, temos o método `validar()` na classe `CartaoUtil`:

```java
public class CartaoUtil {
    public void validar(String bandeira, String numero, String dataValidade) {
        if (bandeira.equals("Visa")) {
            // Validação para Visa
            System.out.println("Validando Visa");
        } else if (bandeira.equals("MasterCard")) {
            // Validação para MasterCard
            System.out.println("Validando MasterCard");
        } else if (bandeira.equals("American Express")) {
            // Validação para American Express
            System.out.println("Validando American Express");
        } else if (bandeira.equals("Diners")) {
            // Validação para Diners
            System.out.println("Validando Diners");
        } else {
            System.out.println("Bandeira não suportada");
        }
        // Abaixo contém mais código...
    }
}
````

Podemos usar o "Extract Method" para separar a validação de cada bandeira de cartão:

```java
public class CartaoUtil {
    public void validar(String bandeira, String numero, String dataValidade) {
        validarBandeira(bandeira);
           // Abaixo contém mais código...
    }

    private void validarBandeira(String bandeira) {
        if (bandeira.equals("Visa")) {
            System.out.println("Validando Visa");
        } else if (bandeira.equals("MasterCard")) {
            System.out.println("Validando MasterCard");
        } else if (bandeira.equals("American Express")) {
            System.out.println("Validando American Express");
        } else if (bandeira.equals("Diners")) {
            System.out.println("Validando Diners");
        } else {
            System.out.println("Bandeira não suportada");
        }
    }
}

```
## Benefícios:

- **Código mais limpo**: O método `validar()` agora está mais simples e fácil de entender.
- **Reutilização**: O novo método `validarBandeira()` pode ser usado em outros lugares do código.
- **Facilidade de mudança**: Se precisar mudar a validação de uma bandeira, só precisa alterar o método `validarBandeira()`.

## Conclusão:
O método "Extract Method" é uma forma fácil e eficiente de melhorar a organização do código, tornando-o mais legível e fácil de manter.