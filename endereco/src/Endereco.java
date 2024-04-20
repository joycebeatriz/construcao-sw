public class Endereco {
    private Integer numero;
    private String complemento;
    private Integer CEP; // Usar Integer para permitir valores nulos
    private TipoEndereco tipo;
    private Logradouro logradouro;
    private Bairro bairro;
    private Cidade cidade;
    private Estado estado;
    private Pais pais;

    // Construtor completo
    public Endereco(Integer numero, String complemento, Integer CEP, TipoEndereco tipo, Logradouro logradouro,
                    Bairro bairro, Cidade cidade, Estado estado, Pais pais) {
        this.numero = numero;
        this.complemento = complemento;
        this.CEP = CEP;
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    // Getters e Setters
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getCEP() {
        return CEP;
    }

    public void setCEP(Integer CEP) {
        this.CEP = CEP;
    }

    public TipoEndereco getTipo() {
        return tipo;
    }

    public void setTipo(TipoEndereco tipo) {
        this.tipo = tipo;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    // Método toString
    @Override
    public String toString() {
        String tipoEnderecoString = (tipo == TipoEndereco.COMERCIAL) ? "Comercial" : "Residencial";
        String tipoLogradouroString = (logradouro.getTipo() == TipoLogradouro.AVENIDA) ? "Avenida" : "Rua";
        return "Endereço: " +
               tipoLogradouroString + " " + logradouro.getNome() + ", " +
               "Número " + numero + ", " +
               ((complemento.isEmpty()) ? "" : "Apt " + complemento + ". ") +
               "Bairro: " + bairro.getNome() + ", " +
               "CEP:" + CEP + " - " +
               "Cidade: " + cidade.getNome() + ", " +
               "Estado: " + estado.getNome() + " (" + estado.getSigla() + "), " +
               "País: " + pais.getNome() +
               " - Tipo:" + tipoEnderecoString;
    }
}
