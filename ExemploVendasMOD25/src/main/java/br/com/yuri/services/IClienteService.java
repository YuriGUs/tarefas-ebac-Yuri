package br.com.yuri.services;

import br.com.yuri.domain.Cliente;
import br.com.yuri.exceptions.TipoChaveNaoEncontradaException;


public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
