package br.edu.ifba.principal;


import java.util.List;

import com.mysql.cj.xdevapi.Client;

import br.edu.ifba.basicas.Categoria;
import br.edu.ifba.basicas.Cliente;
import br.edu.ifba.dao.GetEntityManager;
import jakarta.persistence.EntityManager;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = GetEntityManager.getConnectionJpa();
		
//		Categoria cat = new Categoria();
//		cat.setDescricao("Professores");
//		
//		em.getTransaction().begin();
//		
//		em.persist(cat);
//		
//		em.getTransaction().commit();
		
	/*	Cliente c = new Cliente();
		
		c.setNome("Coisinha");
		c.setCpf("0023547");
		c.setRg("98765412");
		c.setCategoria(em.find(Categoria.class, 1));
		
		em.getTransaction().begin();
		
		em.persist(c);
		
		em.getTransaction().commit();*/

		
		
		List<Cliente> list = em.createQuery("select c from Cliente c",Cliente.class).getResultList();
		
		list.forEach(System.out::println);

	}

}
