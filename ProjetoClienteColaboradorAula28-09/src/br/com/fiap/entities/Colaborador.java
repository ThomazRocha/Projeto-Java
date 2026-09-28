package br.com.fiap.entities;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Colaborador {
    // visibilidade, tipo de dados e atributos
    private int numeroRegistro;
    private String nome;
    private String setor;
    private double salario;
    private Endereco endereco;

    // metodos setters geters


    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\n\nColaborador" +
                "numeroRegistro=" + numeroRegistro +
                "\nnome='" + nome + '\'' +
                "\nsetor='" + setor + '\'' +
                "\nsalario=" + salario + endereco;
    }
}
