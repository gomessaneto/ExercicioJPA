package br.edu.ifba.basicas;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Produto implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String descricao;
	private int estoque;
	private double valor;
	
	public Produto(int id, String descricao, int estoque, double valor) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.estoque = estoque;
		this.valor = valor;
	}
	
	
	
	public Produto(String descricao, int estoque, double valor) {
		super();
		this.descricao = descricao;
		this.estoque = estoque;
		this.valor = valor;
	}



	public Produto() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", estoque=" + estoque + ", valor=" + valor + "]";
	}
	
	

}
