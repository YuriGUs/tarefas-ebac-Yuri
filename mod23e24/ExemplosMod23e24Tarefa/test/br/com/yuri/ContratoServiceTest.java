package br.com.yuri;

import br.com.yuri.dao.ContratoDao;
import br.com.yuri.dao.IContratoDao;
import br.com.yuri.service.ContratoService;
import br.com.yuri.service.IContratoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assertions.assertEquals(retorno, "Contrato salvo com sucesso!");
    }

    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);

        dao.salvar();
        String retorno = service.buscar(1);
        Assertions.assertNull(retorno, "Esperava-se que o retorno fosse nulo, pois não foi inserido um contrato com ID 1.");
    }

    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);

        dao.salvar();
        service.excluir(1);
        String retorno = service.buscar(1);
        Assertions.assertNull(retorno, "Esperava-se que o contrato fosse excluído.");
    }

    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);

        dao.salvar();
        service.atualizar(1, "Novo contrato");
        String retorno = service.buscar(1);
        Assertions.assertEquals("Novo contrato", retorno);
    }

    @Test
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);

        UnsupportedOperationException thrown = Assertions.assertThrows(
                UnsupportedOperationException.class,
                service::salvar,
                "Esperava-se uma UnsupportedOperationException"
        );
    }



}
