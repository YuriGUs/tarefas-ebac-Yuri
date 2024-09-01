package br.com.yuri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Rodrigo");
        cli.adicionarNome1("Rodrigo");

        Assertions.assertEquals("Rodrigo", cli.getNome());
    }
}
