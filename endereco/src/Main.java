import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Logradouro logradouro = new Logradouro("Paulista", TipoLogradouro.AVENIDA);
        Bairro bairro = new Bairro("Bela Vista");
        Cidade cidade = new Cidade("São Paulo");
        Estado estado = new Estado("SP", "São Paulo");
        Pais pais = new Pais("Brasil");

        Endereco endereco = new Endereco(1234, "Apto 101", 365056, TipoEndereco.RESIDENCIAL, logradouro, bairro, cidade, estado, pais);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = null;
        try {
            dataNascimento = sdf.parse("01/01/1980");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        PessoaFisica pessoa = new PessoaFisica("Olíva Mendes", "Feminino", dataNascimento, endereco);

        System.out.println("Pessoa Física: " + pessoa.getNome());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Data de Nascimento: " + sdf.format(pessoa.getDataNascimento()));
        System.out.println("Endereço: " + endereco.getLogradouro().getTipo() + " " + endereco.getLogradouro().getNome() +
                ", Número " + endereco.getNumero() + ", " + endereco.getComplemento() + ". " + bairro.getNome() +
                ", " + cidade.getNome() + ", " + estado.getSigla() + ", " + pais.getNome() + " - CEP: " + endereco.getCEP() +
                "\nTipo: " + endereco.getTipo());
    }
}
