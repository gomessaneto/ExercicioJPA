package br.edu.ifba.basicas;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Veiculo implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long veiculoId;
	private String modelo;
	private String montadora;

	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;

	public Veiculo() {
	}

	public Veiculo(int veiculoId, String modelo, String montadora, Cliente cliente) {
		this.veiculoId = veiculoId;
		this.modelo = modelo;
		this.montadora = montadora;
		this.cliente = cliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public long getVeiculoId() {
		return veiculoId;
	}

	public void setVeiculoId(long veiculoId) {
		this.veiculoId = veiculoId;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Veiculo [id=" + veiculoId + ", modelo=" + modelo + ", montadora=" + montadora + ", cliente=" + cliente + "]";
	}


}
