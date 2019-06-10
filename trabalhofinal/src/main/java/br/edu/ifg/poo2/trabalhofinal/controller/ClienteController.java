package br.edu.ifg.poo2.trabalhofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifg.poo2.trabalhofinal.entidades.Cliente;
import br.edu.ifg.poo2.trabalhofinal.repository.ClienteRepository;

@Controller
public class ClienteController {
	
	@Autowired
	ClienteRepository clientedao;
//	ClienteDao clientedao;
	
	@RequestMapping(value="/cadastrocliente", method = RequestMethod.POST)
	public String cadastroCliente(Cliente cliente){
		if(!clientedao.existsBycpf(cliente.getCpf())){
			clientedao.save(cliente);
//			clientedao.inserirCliente(cliente);
			return "redirect:/clienteCadastrado";
		}
		return "redirect:/cliente";
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
	
	
	@RequestMapping(value="/buscarcliente", method = RequestMethod.GET)
	public String buscarClientes(){
		return "cliente/buscarCliente";
	}
	

	
	@RequestMapping(value="/buscarcliente", method = RequestMethod.POST)
	public ModelAndView buscarClientes(String cpf){
		Cliente cliente=clientedao.findBycpf(cpf);
		ModelAndView modelView = new ModelAndView("cliente/detalhesCliente");
		modelView.addObject("cliente", cliente);
//		System.out.println(cliente.toString());
		return modelView;
	}
	
	public ModelAndView deletarClientes(String cpf){
//		clientedao.
		ModelAndView modelView = new ModelAndView("cliente/detalhesCliente");
		return modelView;
	}
	
	
	
	
}
