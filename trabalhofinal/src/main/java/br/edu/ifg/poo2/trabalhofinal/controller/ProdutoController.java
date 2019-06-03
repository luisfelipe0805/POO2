package br.edu.ifg.poo2.trabalhofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import br.edu.ifg.poo2.trabalhofinal.entidades.Produto;
import br.edu.ifg.poo2.trabalhofinal.repository.ProdutoRepository;

@Controller

public class ProdutoController {
	@Autowired
	ProdutoRepository produtoDao;
	
	@RequestMapping(value="/cadastroproduto", method = RequestMethod.POST)
	public String cadastroProduto(Produto produto){
		produtoDao.save(produto);
		return "redirect:/produtoCadastrado";
	}
	
	@RequestMapping(value="/cadastroproduto", method = RequestMethod.GET)
	public String cadastroProduto(){
		return "produto/cadastroProduto";
	}
	
	@RequestMapping(value="/produtoCadastrado", method = RequestMethod.GET)
	public String produtoCadastrado(){
		return "produto/produtoCadastrado";
	}
	
	@RequestMapping(value="/produto")
	public String produto(){
		return "produto/produto";
	}
	
	@RequestMapping(value="/listaproduto")
	public ModelAndView listarProdutos(){
		ModelAndView modelView = new ModelAndView("produto/listaProduto");
		Iterable<Produto> listaprodutos = produtoDao.findAll();
		modelView.addObject("produtos", listaprodutos);
		return modelView;
	}
	
	
	
}
