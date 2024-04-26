import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoSegura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt(); // Lê o primeiro número

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt(); // Lê o segundo número

            int resultado = dividir(num1, num2);
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }

    private static int dividir(int num1, int num2) {
        return num1 / num2; // Realiza a divisão
    }
}