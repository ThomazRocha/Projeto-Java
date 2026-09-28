package br.com.fiap.entities;

public class Cliente {
    // visibilidade, tipo de dado e atributo
    private String nome;
    private String rg;
    private int idade;
    private double altura;

    // metodos setters e getters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cliente" +
                "\nnome='" + nome + '\'' +
                "\n rg='" + rg + '\'' +
                "\n idade=" + idade +
                "\n altura=" + altura;
    }
}
