public class Estado {
    private String sigla;
    private String nome;

    // Construtor para inicializar a sigla e o nome do estado
    public Estado(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    // Getter para a sigla do estado
    public String getSigla() {
        return sigla;
    }

    // Setter para a sigla do estado
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    // Getter para o nome do estado
    public String getNome() {
        return nome;
    }

    // Setter para o nome do estado
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método toString para representar o objeto Estado como uma String
    @Override
    public String toString() {
        return "Estado{" +
               "sigla='" + sigla + '\'' +
               ", nome='" + nome + '\'' +
               '}';
    }
}
