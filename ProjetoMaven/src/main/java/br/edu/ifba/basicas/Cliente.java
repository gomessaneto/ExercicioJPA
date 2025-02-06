package br.edu.ifba.basicas;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Cliente implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ClienteId;

	private String nome;
	private String cpf;
	private String email;

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.PERSIST)
	private List<Veiculo> veiculos;

	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;

	public Cliente(int ClienteId, String nome, String cpf, String rg) {
		super();
		this.ClienteId = ClienteId;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public Cliente() {
	}

	public Cliente(int ClienteId, String nome, String cpf, String email, List<Veiculo> veiculos, Endereco endereco) {
		this.ClienteId = ClienteId;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.veiculos = veiculos;
		this.endereco = endereco;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public long getClienteId() {
		return ClienteId;
	}

	public void setId(long ClienteId) {
		this.ClienteId = ClienteId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [Id do Cliente=" + ClienteId + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", veiculos=" + veiculos
				+ ", endereco=" + endereco + "]";
	}

}
