package br.edu.ifg.poo2.trabalhofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ifg.poo2.trabalhofinal.entidades.Cliente;
import br.edu.ifg.poo2.trabalhofinal.entidades.Produto;
import br.edu.ifg.poo2.trabalhofinal.entidades.Venda;
import br.edu.ifg.poo2.trabalhofinal.factory.ClienteFactory;
import br.edu.ifg.poo2.trabalhofinal.factory.ProdutoFactory;
import br.edu.ifg.poo2.trabalhofinal.factory.VendaFactory;
import br.edu.ifg.poo2.trabalhofinal.repository.ClienteRepository;
import br.edu.ifg.poo2.trabalhofinal.repository.ProdutoRepository;
import br.edu.ifg.poo2.trabalhofinal.repository.VendaRepository;


@Controller
public class VendaController {
	@Autowired
	VendaRepository vendadao;
	
	@Autowired
	ClienteRepository clientedao;
	
	@Autowired
	ProdutoRepository produtoDao;
	
	
	@RequestMapping(value="/registrarvenda", method = RequestMethod.GET)
	public String resgistrarvenda(){
		VendaFactory vendaFactory = new VendaFactory();
		ClienteFactory clienteFactory = new ClienteFactory();
		ProdutoFactory produtoFactory = new ProdutoFactory();
		
		Cliente cliente = clienteFactory.getCliente();
		Produto produto = produtoFactory.getProduto();
		
		clientedao.save(cliente);
		produtoDao.save(produto);
		Venda venda =vendaFactory.getVenda(cliente, produto);
		vendadao.save(venda);
		return "index";
	}
	
	
}
