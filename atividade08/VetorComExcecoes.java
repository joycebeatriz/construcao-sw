import java.util.InputMismatchException;
import java.util.Scanner;

public class VetorComExcecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int contador = 0;

        System.out.println("Digite valores inteiros para preencher o vetor (0 para parar):");

        try {
            while (true) {
                int input = scanner.nextInt();
                
                if (contador >= vetor.length) {
                    throw new ArrayIndexOutOfBoundsException("Você tentou inserir mais de 10 elementos.");
                }
                
                vetor[contador] = input;
                contador++;
                
                if (input == 0) {
                    break;
                }
            }

            System.out.println("Valores inseridos no vetor:");
            for (int i = 0; i < contador; i++) {
                System.out.print(vetor[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }
}
