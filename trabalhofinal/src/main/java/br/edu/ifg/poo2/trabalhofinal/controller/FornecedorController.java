package br.edu.ifg.poo2.trabalhofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ifg.poo2.trabalhofinal.entidades.Fornecedor;
import br.edu.ifg.poo2.trabalhofinal.repository.FornecedorRepository;

public class FornecedorController {
	
	@Autowired
	FornecedorRepository fornecedordao;
//	ClienteDao clientedao;
	
	@RequestMapping(value="/fornecedor", method = RequestMethod.GET)
	public String fornecedor(){
		return "forn/fornecedor";
	}
	
	@RequestMapping(value="/cadastrocliente", method = RequestMethod.POST)
	public String fornecedor(Fornecedor fornecedor){
		fornecedordao.save(fornecedor);
//		clientedao.inserirCliente(cliente);
		return "redirect:/fornecedor";
	}

}
