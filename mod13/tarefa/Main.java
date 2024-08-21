
public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João da Silva", "Rua A, 12345", "123.456.789-00", "01/01/1990");
        PessoaJuridica pj = new PessoaJuridica("Empresa tal", "Avenida B, 456324", "12.345.678/0001-99", "Empresa tal LTDA");

        System.out.println("Detalhes da Pessoa Física:");
        pf.exibirDetalhes();

        System.out.println("\nDetalhes da Pessoa Jurídica:");
        pj.exibirDetalhes();
    }
}
