package br.com.yuri.services;


import br.com.yuri.dao.IClienteDAO;
import br.com.yuri.domain.Cliente;
import br.com.yuri.services.generic.GenericService;


public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}



	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}


}
