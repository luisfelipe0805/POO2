package br.edu.ifg.poo2.trabalhofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifg.poo2.trabalhofinal.dao.ClienteDao;
import br.edu.ifg.poo2.trabalhofinal.entidades.Cliente;
import br.edu.ifg.poo2.trabalhofinal.repository.ClienteRepository;

@Controller

public class ClienteController {
	
	@Autowired
	ClienteRepository clientedao;
//	ClienteDao clientedao;
	
	@RequestMapping(value="/cadastrocliente", method = RequestMethod.POST)
	public String cadastroCliente(Cliente cliente){
		clientedao.save(cliente);
//		clientedao.inserirCliente(cliente);
		return "redirect:/clienteCadastrado";
	}
	
	@RequestMapping(value="/cadastrocliente", method = RequestMethod.GET)
	public String cadastroCliente(){
		return "cliente/cadastroCliente";
	}
	
	
	@RequestMapping(value="/cliente")
	public String cliente(){
		return "cliente/cliente";
	}
	
		
	@RequestMapping(value="/clienteCadastrado", method = RequestMethod.GET)
	public String clienteCadastrado(){
		return "cliente/clienteCadastrado";
	}
	
	@RequestMapping(value="/listaclientes")
	public ModelAndView listarClientes(){
		ModelAndView modelView = new ModelAndView("cliente/listaClientes");
		Iterable<Cliente> listaClientes = clientedao.findAll();
		modelView.addObject("clientes", listaClientes);
		return modelView;
	}
	
	
	
	
}
