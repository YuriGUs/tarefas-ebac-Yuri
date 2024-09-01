package br.com.yuri.dao;

public class ClienteDao implements IClienteDao {
    @Override
    public String salvar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco.");
    }
}
