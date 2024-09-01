package br.com.yuri;

import br.com.yuri.dao.ClienteDao;
import br.com.yuri.dao.ClienteDaoMock;
import br.com.yuri.dao.IClienteDao;
import br.com.yuri.service.ClienteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ClienteServiceTest {
    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assertions.assertEquals("Sucesso", retorno);
    }

    @Test
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);

        // metodo testado
        /*
        * method reference ( :: ) -> são expressões labdas
        * */
        Assertions.assertThrows(UnsupportedOperationException.class, service::salvar);
    }
}
