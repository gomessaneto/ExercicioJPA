package br.edu.ifba.basicas;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
@IdClass(ItensID.class)
public class ItensProduto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name="venda_id")
	private Venda venda;
	
	@Id
	@ManyToOne
	@JoinColumn(name="produto_id")
	private Produto produto;
	
	
	private int quantidade;

	public ItensProduto(Venda venda, Produto produto, int quantidade) {
		super();
		this.venda = venda;
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public ItensProduto() {
		super();
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ItensProduto [venda=" + venda + ", produto=" + produto + ", quantidade=" + quantidade + "]";
	}
	

	
}
