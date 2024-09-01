package br.com.yuri.service;

public interface IContratoService {
    String salvar();

    String buscar(int id);

    void excluir(int id);

    String atualizar(int id, String novoContrato);
}
