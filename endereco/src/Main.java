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
      // Criando uma instância da classe Estado
     
      Estado estado = new Estado("SP", "São Paulo");
      // Imprimindo a sigla e o nome do estado
      System.out.println("Estado: " + estado.getNome() + " (" + estado.getSigla() + ")");

       // Criando uma instância da classe Pais
       Pais pais = new Pais("Brasil");
       // Imprimindo o nome do país
       System.out.println("País: " + pais.getNome());
  }
}