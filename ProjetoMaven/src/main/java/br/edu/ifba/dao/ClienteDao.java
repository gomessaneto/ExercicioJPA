package br.edu.ifba.dao;

import java.util.List;

import br.edu.ifba.basicas.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class ClienteDao {
	
	EntityManager em = GetEntityManager.getConnectionJpa();
	
	public void adicionarCliente(Cliente c) {
		
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
	}
	
	public Cliente buscarCliente(int id) {
		
		return em.find(Cliente.class, id);
		
	}
	
	public void atualizarCliente(Cliente c) {
		
		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();
		
	}
	
	public void removerCliente(Cliente c) {
		
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction();
	}
	
	public List<Cliente> listarClientes(){
		return em.createQuery("select c from Cliente c",Cliente.class).getResultList();
	}
	
	public List<Cliente> buscarCliente(String nome) {
		
		TypedQuery<Cliente> query = em.createQuery("select c from Cliente c where c.nome = :name",Cliente.class);
		query.setParameter("name", nome);
		
		return query.getResultList();				
	}
	
	public List<Cliente> buscarPrimeirosCliente(int qtd) {
		
		TypedQuery<Cliente> query = em.createQuery("select c from Cliente c",Cliente.class);
		query.setMaxResults(qtd);
		
		return query.getResultList();
	}


}
