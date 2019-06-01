package br.edu.ifg.poo2.trabalhofinal.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.edu.ifg.poo2.trabalhofinal.entidades.Cliente;

@Repository
public class ClienteDao {
	
	@Autowired
	private EntityManager entityManager;
	
	
	public void inserirCliente(Cliente	 cliente) {		
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();
	}
	
	public void atualiza( Cliente cliente){
		
		entityManager.getTransaction().begin();
		entityManager.merge(cliente);
		entityManager.getTransaction().commit();
		
	}
	
	public void excluir(Long id ) {
		Cliente cliente = new Cliente();
		cliente=this.obter(id);
		
		entityManager.getTransaction().begin();
		entityManager.remove(cliente);
		entityManager.getTransaction().commit();
		
	}
	
	public Cliente obter(Long id ) {
		Cliente cliente = new Cliente();
		
		entityManager.getTransaction().begin();
		cliente = entityManager.find(Cliente.class, id);
		entityManager.getTransaction().commit();
		
		return cliente;
	}
	
	public List<Cliente> listarCliente() {
		List<Cliente> listaClientes= new ArrayList<>();
		entityManager.getTransaction().begin();
		listaClientes=entityManager.createQuery("FROM " + Cliente.class.getName()).getResultList();
		entityManager.getTransaction().commit();		
//		return entityManager.createQuery("FROM " + Cliente.class.getName()).getResultList();
		return listaClientes;
	}
}
