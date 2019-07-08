package br.edu.ifg.poo2.trabalhofinal.factory;

import br.edu.ifg.poo2.trabalhofinal.entidades.Cliente;


public class ClienteFactory {
	/**
	 * Cria um cliente padrão
	 * @return cliente com nome teste e sexo indefinido
	 */
	public Cliente getCliente() {
		Cliente cliente = new Cliente();
		cliente.setCpf("35283065057");
		cliente.setNome("Nome Teste");
		cliente.setRg("0000");
		cliente.setSexo("i");
		return cliente;
	}
}
