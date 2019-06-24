package br.edu.ifg.poo2.trabalhofinal.factory;

import br.edu.ifg.poo2.trabalhofinal.entidades.Produto;

public class ProdutoFactory {

	/**
	 * Criao um produto padrão
	 * @return retorna um produto com nome teste
	 */
	public Produto getProduto() {
		Produto produto = new Produto();
		produto.setNome("Produto Teste");
		produto.setCodigo("111111");
		produto.setDescricao("Produto Teste");
		produto.setQuantidade(1.0f);
		produto.setUnidadeMedida("KG");
		return produto;
	}
}
