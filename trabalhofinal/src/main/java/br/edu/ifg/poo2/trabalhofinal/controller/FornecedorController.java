package br.edu.ifg.poo2.trabalhofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifg.poo2.trabalhofinal.entidades.Fornecedor;
import br.edu.ifg.poo2.trabalhofinal.repository.FornecedorRepository;

@Controller

public class FornecedorController {
	
	@Autowired
	FornecedorRepository fornecedordao;
	
	@RequestMapping(value="/cadastroFornecedor", method = RequestMethod.POST)
	public String cadastroCliente(Fornecedor fornecedor){
		if(!fornecedordao.existsBycnpj(fornecedor.getCnpj())){
			fornecedordao.save(fornecedor);

			return "redirect:/fornCadastrado";
		}
		return "redirect:/fornecedor";
	}
	
	@RequestMapping(value="/cadastroFornecedor", method = RequestMethod.GET)
	public String cadastroFornecedor(){
		return "forn/cadastroFornecedor";
	}
	
	
	@RequestMapping(value="/fornecedor")
	public String fornecedor(){
		return "forn/fornecedor";
	}
	
		
	@RequestMapping(value="/fornecedorCadastrado", method = RequestMethod.GET)
	public String fornecedorCadastrado(){
		return "forn/fornecedorCadastrado";
	}
	
	@RequestMapping(value="/listaFornecedor")
	public ModelAndView listarFornecedor(){
		ModelAndView modelView = new ModelAndView("forn/listaFornecedor");
		Iterable<Fornecedor> listafornecedor = fornecedordao.findAll();
		modelView.addObject("fornecedores", listafornecedor);
		return modelView;
	}
	
	@RequestMapping(value="/buscarFornecedor", method = RequestMethod.GET)
	public String buscarFornecedor(){
		return "forn/buscarFornecedor";
	}
	
	@RequestMapping(value="/buscarFornecedor", method = RequestMethod.POST)
	public ModelAndView buscarFornecedor(String cnpj){
		Fornecedor fornecedor=fornecedordao.findBycnpj(cnpj);
		ModelAndView modelView = new ModelAndView("forn/detalhesForn");
		modelView.addObject("fornecedor", fornecedor);
//		System.out.println(cliente.toString());
		return modelView;
	}
	


	public ModelAndView deletarFornecedor(String cnpj){

		ModelAndView modelView = new ModelAndView("forn/detalhesForn");
		return modelView;
	}
	
	

}
