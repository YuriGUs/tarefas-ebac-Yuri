package CadastroClienteSwing;

public interface IClienteDAO {
    boolean cadastrar(Cliente cliente);
    Cliente consultar(String cpf);
    void excluir(String cpf);
}
