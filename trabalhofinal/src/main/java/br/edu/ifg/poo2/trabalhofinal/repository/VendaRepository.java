package br.edu.ifg.poo2.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifg.poo2.trabalhofinal.entidades.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
	
}
