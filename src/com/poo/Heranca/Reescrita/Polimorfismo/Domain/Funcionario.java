package com.poo.Heranca.Reescrita.Polimorfismo.Domain;

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
}
