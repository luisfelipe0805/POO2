package br.edu.ifg.poo2.trabalhofinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import br.edu.ifg.poo2.trabalhofinal.entidades.Cliente;
import br.edu.ifg.poo2.trabalhofinal.factory.ClienteFactory;
import br.edu.ifg.poo2.trabalhofinal.repository.ClienteRepository;
import br.edu.ifg.poo2.trabalhofinal.repository.FornecedorRepository;
import br.edu.ifg.poo2.trabalhofinal.repository.ProdutoRepository;

@SpringBootApplication
public class TrabalhofinalApplication {
	
	public static void main(String[] args) {		
		SpringApplication.run(TrabalhofinalApplication.class, args);
	}
	
	
	
	
	
	
	
}
