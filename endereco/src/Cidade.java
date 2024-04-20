public class Cidade {
    private String nome;

    // Construtor para inicializar o nome da cidade
    public Cidade(String nome) {
        this.nome = nome;
    }

    // Getter para o nome da cidade
    public String getNome() {
        return nome;
    }

    // Setter para o nome da cidade
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método toString para representar o objeto Cidade como uma String
    @Override
    public String toString() {
        return "Cidade{" +
               "nome='" + nome + '\'' +
               '}';
    }
}

