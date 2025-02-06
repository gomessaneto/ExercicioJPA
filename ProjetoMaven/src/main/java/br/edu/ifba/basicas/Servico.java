package br.edu.ifba.basicas;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Servico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ServicoId;

    private double ServicoValor;
    private String ServicoDescricao;

    @OneToMany (mappedBy = "servico", cascade = CascadeType.ALL)
    private List<HistoricoServicoI> hsi;

    public Servico() {
    }

    public int getServicoId() {
        return ServicoId;
    }

    public void setServicoId(int servicoId) {
        ServicoId = servicoId;
    }

    public double getServicoValor() {
        return ServicoValor;
    }

    public void setServicoValor(double servicoValor) {
        ServicoValor = servicoValor;
    }

    public String getServicoDescricao() {
        return ServicoDescricao;
    }

    public void setServicoDescricao(String servicoDescricao) {
        ServicoDescricao = servicoDescricao;
    }

    @Override
    public String toString() {
        return "Servico [ServicoId=" + ServicoId + ", ServicoValor=" + ServicoValor + ", ServicoDescricao="
                + ServicoDescricao + "]";
    }


}
