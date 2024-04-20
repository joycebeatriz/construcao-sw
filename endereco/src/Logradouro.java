public class Logradouro {
    private String nome;
    private TipoLogradouro tipo;

    public Logradouro(String nome, TipoLogradouro tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoLogradouro getTipo() {
        return tipo;
    }

    public void setTipo(TipoLogradouro tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Logradouro{" +
               "nome='" + nome + '\'' +
               ", tipo=" + tipo +
               '}';
    }
}
