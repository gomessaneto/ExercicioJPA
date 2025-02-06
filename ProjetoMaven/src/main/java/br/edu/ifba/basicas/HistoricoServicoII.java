package br.edu.ifba.basicas;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Embeddable
public class HistoricoServicoII implements Serializable {
    private static final long serialVersionUID = 1L;

    private long servico_id;
    private long veiculo_id;
    
    public HistoricoServicoII() {
    }

    public HistoricoServicoII(long servico_id, long veiculo_id) {
        this.servico_id = servico_id;
        this.veiculo_id = veiculo_id;
    }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoricoServicoII that = (HistoricoServicoII) o;
        return servico_id == that.servico_id && veiculo_id == that.veiculo_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(servico_id, veiculo_id);
    }
}