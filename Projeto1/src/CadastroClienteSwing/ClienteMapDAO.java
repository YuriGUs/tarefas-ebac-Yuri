package CadastroClienteSwing;

import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO implements IClienteDAO {
    private Map<String, Cliente> mapaClientes = new HashMap<>();

    @Override
    public boolean cadastrar(Cliente cliente) {
        if (mapaClientes.containsKey(cliente.getCpf())) {
            return false;
        }
        mapaClientes.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public Cliente consultar(String cpf) {
        return mapaClientes.get(cpf);
    }

    @Override
    public void excluir(String cpf) {
        mapaClientes.remove(cpf);
    }
}
