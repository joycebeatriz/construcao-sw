import java.util.Date;

public class PessoaFisica {
    private String nome;
    private String sexo;
    private Date dataNascimento;
    private Endereco endereco;

    // Construtor que inicializa todos os atributos
    public PessoaFisica(String nome, String sexo, Date dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Método toString para representar o objeto PessoaFisica como uma String
    @Override
    public String toString() {
        return "PessoaFisica{" +
               "nome='" + nome + '\'' +
               ", sexo='" + sexo + '\'' +
               ", dataNascimento=" + dataNascimento +
               ", endereco=" + endereco +
               '}';
    }
}
