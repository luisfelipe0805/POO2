package br.edu.ifg.poo2.trabalhofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ifg.poo2.trabalhofinal.entidades.Usuario;
import br.edu.ifg.poo2.trabalhofinal.repository.UsuarioRepository;



@Controller
public class UsuarioController {

	
	@Autowired
	UsuarioRepository usuariodao;
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String validaLogin(Usuario usuario){
		if(usuariodao.existsByloginAndpassword(usuario.getLogin(),usuario.getPassword())){
			return "login/index";
		}
		return "redirect:/login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginUsuario(){
		return "login/login";
	}
}
