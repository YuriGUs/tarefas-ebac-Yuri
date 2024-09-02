package br.com.yuri.dao;

import br.com.yuri.dao.generic.IGenericDAO;
import br.com.yuri.domain.Venda;
import br.com.yuri.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
