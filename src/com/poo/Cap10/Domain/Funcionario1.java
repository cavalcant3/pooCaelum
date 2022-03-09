package com.poo.Cap10.Domain;

public abstract class Funcionario1 {
    protected String nome;
    protected String cpf;
    protected double salario;

    public double getBonificacao() {
        return this.salario * 1.2;
    }

}
