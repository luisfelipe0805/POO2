package br.edu.ifg.poo2.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifg.poo2.trabalhofinal.entidades.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Boolean existsByLogin(String login);
	public Boolean existsByPassword(String password);
	
	public Boolean existsByLoginAndPassword(String login, String password);

}
