package br.edu.ifba.basicas;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Venda implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String descrica;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;
	
	public Venda(int id, String descrica) {
		super();
		this.id = id;
		this.descrica = descrica;
	}
	
	public Venda() {
		super();
	}
	
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescrica() {
		return descrica;
	}
	public void setDescrica(String descrica) {
		this.descrica = descrica;
	}
	@Override
	public String toString() {
		return "Venda [id=" + id + ", descrica=" + descrica + "]";
	}
	
	

}
