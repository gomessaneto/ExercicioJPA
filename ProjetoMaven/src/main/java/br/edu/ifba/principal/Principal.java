package br.edu.ifba.principal;


import java.util.List;


import br.edu.ifba.basicas.Categoria;
import br.edu.ifba.basicas.Cliente;
import br.edu.ifba.basicas.Endereco;
import br.edu.ifba.basicas.ItensProduto;
import br.edu.ifba.basicas.Produto;
import br.edu.ifba.basicas.Venda;
import br.edu.ifba.dao.ClienteDao;
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
		
		Cliente c = new Cliente();
//		
//		c.setNome("Fulano");
//		c.setCpf("021545");
//		c.setRg("00235458");
//		c.setCategoria(em.find(Categoria.class, 2));

//		
		Endereco e = new Endereco();
//		
//		e.setBairro("TTTT");
//		e.setCep("485623-000");
//		e.setCidade("FUIIII");
//		e.setEstado("Bahia");
//		e.setNumero("333");
//		e.setRua("TESTE");
//		
//		c.setEndereco(e);
		
//		c = em.find(Cliente.class, 2);
//		
//		c.setEndereco(e);
//		
//		
//		em.getTransaction().begin();
//		
//		em.merge(c);
//		
//		em.getTransaction().commit();

//		System.out.println(c);
//		
//		Produto p = new Produto("Notebook",5,1500);
//		
//		em.getTransaction().begin();
//		
//		em.persist(p);
//		
//		em.getTransaction().commit();
//		
//		Venda v = new Venda();
//		
//		v.setCliente(c);
//		v.setDescrica("Venda notebook");
//		
//		
//		em.getTransaction().begin();
//		
//		em.persist(v);
//		
//		em.getTransaction().commit();
//		
//		ItensProduto ip = new ItensProduto();
//		
//		
//		ip.setVenda(em.find(Venda.class, 1));
//		ip.setProduto(em.find(Produto.class, 1));
//		ip.setQuantidade(2);
		
		
//		em.getTransaction().begin();
//		
//		em.persist(ip);
//		
//		em.getTransaction().commit();
		
		ClienteDao cd = new ClienteDao();
		
//		cd.adicionarCliente(c);
		
		cd.listarClientes().forEach(System.out::println);
		
		System.out.println("======= Clientes da categoria 1 ========");
		cd.clienteCategoria(2).forEach(System.out::println);;
		
		
		
//		List<Cliente> list = em.createQuery("select c from Cliente c",Cliente.class).getResultList();
//		
//		list.forEach(System.out::println);

	}

}
