package br.edu.ifg.poo2.trabalhofinal.factory;

import br.edu.ifg.poo2.trabalhofinal.entidades.Cliente;
import br.edu.ifg.poo2.trabalhofinal.entidades.Produto;
import br.edu.ifg.poo2.trabalhofinal.entidades.Venda;


public class VendaFactory {
	public Venda getVenda(Cliente cliente, Produto produto) {
	Venda venda = new Venda(cliente,produto );	
	venda.setCodigoVenda(111111L);
	venda.setPreco(1.0f);
	return venda;
	}
	
}
