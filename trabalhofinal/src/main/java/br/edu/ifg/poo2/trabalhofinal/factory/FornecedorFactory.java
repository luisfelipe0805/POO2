package br.edu.ifg.poo2.trabalhofinal.factory;

import br.edu.ifg.poo2.trabalhofinal.entidades.Fornecedor;

public class FornecedorFactory {
	/**
	 * Cria um fornecedor padrão
	 * @return retorna um fonrecedor com nome teste
	 */
	public Fornecedor getFornecedor() {
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setCnpj("84504701000158");
		fornecedor.setCodigo("000000");
		fornecedor.setNome("Fonecedor Teste");
		return fornecedor;
	}
}
