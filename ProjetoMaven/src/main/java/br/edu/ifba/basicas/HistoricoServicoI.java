package br.edu.ifba.basicas;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class HistoricoServicoI implements Serializable {

    @EmbeddedId
    private HistoricoServicoII Id;

    @ManyToOne
    @MapsId("servico_id")
    @JoinColumn(name = "servico_id", nullable = false)
    private Servico servico;

    @ManyToOne
    @MapsId("veiculo_id")
    @JoinColumn(name = "veiculo_id", nullable = false)
    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name = "funcionario_id", nullable = false)
    private Funcionario funcionario;

    public HistoricoServicoI() {
    }

    public HistoricoServicoI(HistoricoServicoII id, Servico servico, Veiculo veiculo, Funcionario funcionario) {
        Id = id;
        this.servico = servico;
        this.veiculo = veiculo;
        this.funcionario = funcionario;
    }

    public HistoricoServicoII getId() {
        return Id;
    }

    public void setId(HistoricoServicoII id) {
        Id = id;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
