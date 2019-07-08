package br.edu.ifg.poo2.trabalhofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ifg.poo2.trabalhofinal.entidades.Cliente;
import br.edu.ifg.poo2.trabalhofinal.entidades.Compra;
import br.edu.ifg.poo2.trabalhofinal.entidades.Fornecedor;
import br.edu.ifg.poo2.trabalhofinal.entidades.Produto;
import br.edu.ifg.poo2.trabalhofinal.factory.ClienteFactory;
import br.edu.ifg.poo2.trabalhofinal.factory.CompraFactory;
import br.edu.ifg.poo2.trabalhofinal.factory.FornecedorFactory;
import br.edu.ifg.poo2.trabalhofinal.factory.ProdutoFactory;
import br.edu.ifg.poo2.trabalhofinal.repository.ClienteRepository;
import br.edu.ifg.poo2.trabalhofinal.repository.CompraRepository;
import br.edu.ifg.poo2.trabalhofinal.repository.FornecedorRepository;
import br.edu.ifg.poo2.trabalhofinal.repository.ProdutoRepository;

@Controller
public class CompraController {
	
	@Autowired
	FornecedorRepository fornecerodDao;
	
	@Autowired
	ProdutoRepository produtoDao;
	
	@Autowired
	CompraRepository compraDao;
	
	@RequestMapping(value="/compra", method = RequestMethod.GET)
	public String restrarCompra() {				
		return "compra/compra";	
	}
	
	
	@RequestMapping(value="/registrarcompra", method = RequestMethod.GET)
	public String resgistrarCompra() {				
		return "compra/registrarCompra";	
	}
	
	

	
	
//	@RequestMapping(value="/registrarcompra", method = RequestMethod.GET)
//	public String restrarCompra() {
//		CompraFactory compraFactory=new CompraFactory();
//		FornecedorFactory fornecedorFactory = new FornecedorFactory();
//		ProdutoFactory produtoFactory = new ProdutoFactory();
//		
//		Fornecedor fornecedor = fornecedorFactory.getFornecedor();
//		Produto produto = produtoFactory.getProduto();
//		produtoDao.save(produto);
//		fornecerodDao.save(fornecedor);
//		Compra compra = compraFactory.getCompra(fornecedor, produto);
//		compraDao.save(compra);
//		
//		return "index";
//		
//	}
}
