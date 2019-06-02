package br.edu.ifg.poo2.trabalhofinal.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ifg.poo2.trabalhofinal.entidades.Fornecedor;

public class FornecedorDao {
	
	@Autowired
	private EntityManager entityManager;
	
	
	public void inserirCliente(Fornecedor	 forn) {		
		entityManager.getTransaction().begin();
		entityManager.persist(forn);
		entityManager.getTransaction().commit();
	}
	
	public void atualiza( Fornecedor forn){
		
		entityManager.getTransaction().begin();
		entityManager.merge(forn);
		entityManager.getTransaction().commit();
		
	}
	
	public void excluir(Long id ) {
		Fornecedor forn = new Fornecedor();
		forn=this.obter(id);
		
		entityManager.getTransaction().begin();
		entityManager.remove(forn);
		entityManager.getTransaction().commit();
		
	}
	
	public Fornecedor obter(Long id ) {
		Fornecedor forn = new Fornecedor();
		
		entityManager.getTransaction().begin();
		forn = entityManager.find(Fornecedor.class, id);
		entityManager.getTransaction().commit();
		
		return forn;
	}
	
	public List<Fornecedor> listarfornecedor() {
		List<Fornecedor> listarfornecedor= new ArrayList<>();
		entityManager.getTransaction().begin();
		listarfornecedor=entityManager.createQuery("FROM " + Fornecedor.class.getName()).getResultList();
		entityManager.getTransaction().commit();		
//		return entityManager.createQuery("FROM " + Cliente.class.getName()).getResultList();
		return listarfornecedor;
	}

}
