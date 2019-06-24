package br.edu.ifg.poo2.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifg.poo2.trabalhofinal.entidades.Fornecedor;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
	
	public Fornecedor findBycnpj(String cnpj);
	
	public void deleteBycnpj(String cnpj);
	
	public Boolean existsBycnpj(String cnpj);
}
