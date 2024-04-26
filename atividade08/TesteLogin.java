import java.util.Scanner;

public class TesteLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Login login = new Login("admin", "12345");

        try {
            if (login.fazerLogin(usuario, senha)) {
                System.out.println("Login bem-sucedido!");
            }
        } catch (LoginInvalidoException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
