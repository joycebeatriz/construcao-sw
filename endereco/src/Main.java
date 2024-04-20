public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe Bairro
        Bairro bairro = new Bairro("Bela Vista");
        // Imprimindo o nome do bairro
        System.out.println("Nome do Bairro: " + bairro.getNome());

        // Criando uma instância da classe Cidade
        Cidade cidade = new Cidade("São Paulo");
        // Imprimindo o nome da cidade
        System.out.println("Nome da Cidade: " + cidade.getNome());
    }
}
