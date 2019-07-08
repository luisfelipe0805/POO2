package br.edu.ifg.poo2.trabalhofinal.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping(value="/venda")
	public String venda(){
		return "venda/venda";
	}
	
	
	@RequestMapping(value="/registrarVenda", method = RequestMethod.GET )
	public ModelAndView resgistrarVenda(){
		ModelAndView modelView = new ModelAndView("venda/registrarVenda");
		Iterable<Cliente> listaClientes = clientedao.findAll();
		modelView.addObject("clientes", listaClientes);
		return modelView;
	}
	
	

	@RequestMapping(value="/registrarVenda", method = RequestMethod.POST)
	public ModelAndView adicionarClienteVenda(String cpf, HttpSession session){
		ModelAndView modelView = new ModelAndView("venda/adicionarProdutoVenda");
		Iterable<Produto> listaprodutos = produtoDao.findAll();
		modelView.addObject("produtos", listaprodutos);
		session.setAttribute("cpf", cpf);
		return modelView;
		
	}

	
	@RequestMapping(value="/finalizarVenda", method = RequestMethod.GET)
	public String resgistrarVendaFinal(String produto_codigo,HttpSession session){
		return "venda/finalizarVenda";
	}
	
	@RequestMapping(value="/finalizarVenda", method = RequestMethod.POST)
	public String resgistrarVendaFinal(Venda venda,HttpSession session){
 	

 		Produto produto = produtoDao.findBycodigo("123");
 		String cpf = (String) session.getAttribute("cpf");
 		Venda vendaFinal = new Venda(clientedao.findBycpf(cpf),produto);
 		vendaFinal.setCodigoVenda(venda.getCodigoVenda());
 		vendaFinal.setPreco(venda.getPreco());
 		vendadao.save(vendaFinal);
 		
		return "redirect:/vendaFinalizada";
	}
	
	@RequestMapping(value="/vendaFinalizada")
	public String resgistrarVendaFinal(){
 			return "venda/vendaFinalizada";
	}
	
}
