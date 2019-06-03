package br.edu.ifg.poo2.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifg.poo2.trabalhofinal.entidades.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
}
