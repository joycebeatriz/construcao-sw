public class Bairro {
    private String nome;

    // Construtor que inicializa o nome do bairro
    public Bairro(String nome) {
        this.nome = nome;
    }

    // Getter para o nome do bairro
    public String getNome() {
        return nome;
    }

    // Setter para o nome do bairro
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método toString para representar o objeto Bairro como uma String
    @Override
    public String toString() {
        return "Bairro{" +
               "nome='" + nome + '\'' +
               '}';
    }
}
