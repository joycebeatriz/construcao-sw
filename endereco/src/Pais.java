public class Pais {
    private String nome;

    // Construtor para inicializar o nome do país
    public Pais(String nome) {
        this.nome = nome;
    }

    // Getter para o nome do país
    public String getNome() {
        return nome;
    }

    // Setter para o nome do país
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método toString para representar o objeto Pais como uma String
    @Override
    public String toString() {
        return "Pais{" +
               "nome='" + nome + '\'' +
               '}';
    }
}
