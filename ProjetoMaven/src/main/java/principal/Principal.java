package principal ;

import br.edu.ifba.basicas.Cliente;
import br.edu.ifba.basicas.Endereco;
import br.edu.ifba.basicas.Funcionario;
import br.edu.ifba.basicas.HistoricoServicoI;
import br.edu.ifba.basicas.Servico;
import br.edu.ifba.basicas.Veiculo;
import br.edu.ifba.dao.GetEntityManager;
import jakarta.persistence.EntityManager;

public class Principal {
    public static void main(String[] args) {
        EntityManager em = GetEntityManager.getConnectionJpa();
        Endereco e = new Endereco();
        e.setBairro("AABB");
        e.setCep("696969-000");
        e.setCidade("Serra Talhada");
        e.setNumero("0");
        e.setRua("Rua dos Bobos");
		em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();

        Cliente cli = new Cliente();
        cli.setNome("Josy");
        cli.setCpf("12555658459");
        cli.setEmail("202010070015@ifba.edu.br");
        cli.setEndereco(em.find(Endereco.class, 1));
		em.getTransaction().begin();
		em.persist(cli);
		em.getTransaction().commit();

        Veiculo v = new Veiculo();
        v.setModelo("Gol 2016");
        v.setMontadora("Wolkswagen");
        v.setCliente(em.find(Cliente.class, 1));
		em.getTransaction().begin();
        em.persist(v);
        em.getTransaction().commit();

        Funcionario f = new Funcionario();
        f.setFuncionario_nome("Milton Marques");
        f.setFuncionario_cpf("12555658459");
        f.setFuncionario_funcao("Comerciante");
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();

        Servico s = new Servico();
        s.setServicoDescricao("Venda do Gol 2016 - Milton Marques");
        s.setServicoValor(90000.00);
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();


       HistoricoServicoI h =new HistoricoServicoI();
       h.setServico(em.find(Servico.class, 1));
       h.setVeiculo(em.find(Veiculo.class, 1));
       h.setFuncionario(em.find(Funcionario.class, 1));
       em.getTransaction().begin();
       em.persist(h);
       em.getTransaction().commit();
    }
}