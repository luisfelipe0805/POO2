package br.edu.ifg.poo2.trabalhofinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifg.poo2.trabalhofinal.dao.ClienteDao;
import br.edu.ifg.poo2.trabalhofinal.entidades.Cliente;

@SpringBootApplication
public class TrabalhofinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrabalhofinalApplication.class, args);
		
		
		System.out.println("teste");
		
	}
	
	
}
