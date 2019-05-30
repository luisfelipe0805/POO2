package br.edu.ifg.poo2.trabalhofinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClienteController {
	
	@RequestMapping("/cliente")
	public String cliente(){
		return "cliente";
	}
}
