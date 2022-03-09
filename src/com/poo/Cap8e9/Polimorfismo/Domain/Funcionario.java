package com.poo.Cap8e9.Polimorfismo.Domain;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao() {
        return this.salario * 0.10;

    }

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String mostrarDados() {
        String s = "\nNome: " + this.nome;
               s += "\nCpf: " + this.cpf;
        return s;
    }
}
