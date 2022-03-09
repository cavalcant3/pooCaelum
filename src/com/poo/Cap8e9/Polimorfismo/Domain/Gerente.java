package com.poo.Cap8e9.Polimorfismo.Domain;

public class Gerente extends Funcionario {
    int senha;
    int numeroDeFuncionarioGerenciaos;

    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }

    //      @override
    public double getBonificacao() {
        return super.getBonificacao()+1000;
    }


}
