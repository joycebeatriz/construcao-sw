import java.util.Scanner;

public class TesteContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(1000.0);

        System.out.println("Saldo atual: " + conta.getSaldo());
        System.out.print("Digite o valor para depósito: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        System.out.print("Digite o valor para saque: ");
        double valorSaque = scanner.nextDouble();

        try {
            conta.sacar(valorSaque);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
