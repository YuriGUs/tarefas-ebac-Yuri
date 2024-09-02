package br.com.yuri.services;

import br.com.yuri.dao.IProdutoDAO;
import br.com.yuri.domain.Produto;
import br.com.yuri.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
