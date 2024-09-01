package br.com.yuri.service;

import br.com.yuri.dao.IContratoDao;

public class ContratoService implements IContratoService{

    private IContratoDao dao;

    public ContratoService(IContratoDao dao) { this.dao = dao; }

    @Override
    public String salvar() {
        dao.salvar();
        return "Contrato salvo com sucesso!";
    }

    @Override
    public String buscar(int id) {
        return dao.buscar(id);
    }

    @Override
    public void excluir(int id) {
        dao.excluir(id);
    }

    @Override
    public String atualizar(int id, String novoContrato) {
        dao.atualizar(id, novoContrato);
        return "Contrato atualizado com sucesso!";
    }

    public void mostrar() {
        dao.mostrar();
    }
}
