package br.com.yuri.dao;

import java.util.HashMap;
import java.util.Map;

public class ContratoDao implements IContratoDao {

    private Map<Integer, String> bancoDeDados = new HashMap<>();

    @Override
    public void salvar() { }

    @Override
    public String buscar(int id) {
        return bancoDeDados.get(id);
    }

    @Override
    public void excluir(int id) {
        bancoDeDados.remove(id);
    }

    @Override
    public void atualizar(int id, String novoContrato) {
        bancoDeDados.put(id, novoContrato);
    }

    @Override
    public void mostrar() {
        System.out.println(bancoDeDados);
    }
}
