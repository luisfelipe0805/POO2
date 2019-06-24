package br.edu.ifg.poo2.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifg.poo2.trabalhofinal.entidades.Cliente;
import br.edu.ifg.poo2.trabalhofinal.entidades.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public Produto findBycodigo(String codigo);
	
}
