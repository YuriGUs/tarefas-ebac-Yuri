public class PessoaFisica extends Pessoa {
    private String cpf;
    private String dataDeNascimento;

    public PessoaFisica(String nome, String endereco, String cpf, String dataDeNascimento) {
        super(nome, endereco);
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }


    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataDeNascimento);
    }
}
