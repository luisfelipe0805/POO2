package br.edu.ifg.poo2.trabalhofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ifg.poo2.trabalhofinal.dao.ClienteDao;
import br.edu.ifg.poo2.trabalhofinal.entidades.Cliente;
import br.edu.ifg.poo2.trabalhofinal.repository.ClienteRepository;

@Controller

public class ClienteController {
	
	@Autowired
	ClienteRepository clientedao;
//	ClienteDao clientedao;
	
	@RequestMapping(value="/cadastrocliente", method = RequestMethod.POST)
	public String cliente(Cliente cliente){
		clientedao.save(cliente);
//		clientedao.inserirCliente(cliente);
		return "redirect:/clienteCadastrado";
	}
	
	
	@RequestMapping(value="/cliente")
	public String cliente(){
		return "cliente/cliente";
	}
	
	@RequestMapping(value="/cadastrocliente", method = RequestMethod.GET)
	public String cadastroCliente(){
		return "cliente/cadastroCliente";
	}
	

	
	@RequestMapping(value="/clienteCadastrado", method = RequestMethod.GET)
	public String clienteCadastrado(){
		return "cliente/clienteCadastrado";
	}

	
}
