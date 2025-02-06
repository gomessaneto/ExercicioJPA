package br.edu.ifba.basicas;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Funcionario implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long funcionario_id;

    private String funcionario_funcao;
    private String funcionario_nome;
    private String funcionario_cpf;

    public Funcionario() {
    }

    public Funcionario(long funcionario_id, String funcionario_funcao, String funcionario_nome,
            String funcionario_cpf) {
        this.funcionario_id = funcionario_id;
        this.funcionario_funcao = funcionario_funcao;
        this.funcionario_nome = funcionario_nome;
        this.funcionario_cpf = funcionario_cpf;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getFuncionario_id() {
        return funcionario_id;
    }

    public void setFuncionario_id(long funcionario_id) {
        this.funcionario_id = funcionario_id;
    }

    public String getFuncionario_funcao() {
        return funcionario_funcao;
    }

    public void setFuncionario_funcao(String funcionario_funcao) {
        this.funcionario_funcao = funcionario_funcao;
    }

    public String getFuncionario_nome() {
        return funcionario_nome;
    }

    public void setFuncionario_nome(String funcionario_nome) {
        this.funcionario_nome = funcionario_nome;
    }

    public String getFuncionario_cpf() {
        return funcionario_cpf;
    }

    public void setFuncionario_cpf(String funcionario_cpf) {
        this.funcionario_cpf = funcionario_cpf;
    }

    @Override
    public String toString() {
        return "Funcionario [funcionario_id=" + funcionario_id + ", funcionario_funcao=" + funcionario_funcao
                + ", funcionario_nome=" + funcionario_nome + ", funcionario_cpf=" + funcionario_cpf + "]";
    }


}
