package br.edu.ifg.poo2.trabalhofinal.factory;

import br.edu.ifg.poo2.trabalhofinal.entidades.Compra;
import br.edu.ifg.poo2.trabalhofinal.entidades.Fornecedor;
import br.edu.ifg.poo2.trabalhofinal.entidades.Produto;

public class CompraFactory {
		
	public Compra getCompra(Fornecedor fornecedor, Produto produto) {
		Compra compra = new Compra(fornecedor,produto);
		compra.setCodigo_compra(111111L);
		compra.setPreco(1.0f);
		return compra;
	}
}
