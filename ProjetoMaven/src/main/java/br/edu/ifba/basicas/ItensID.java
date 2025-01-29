package br.edu.ifba.basicas;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class ItensID implements Serializable {
	
	private int venda;
	private int produto;
	
	public ItensID() {
		super();
	}

	public ItensID(int venda, int produto) {
		super();
		this.venda = venda;
		this.produto = produto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(produto, venda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItensID other = (ItensID) obj;
		return produto == other.produto && venda == other.venda;
	}

	
	
	
	
	
	
	 

}
