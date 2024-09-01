package br.com.yuri.dao;

public interface IContratoDao {
    void salvar();

    String buscar(int id);

    void excluir(int id);

    void atualizar(int id, String novoContrato);

    void mostrar();
}
