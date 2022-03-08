package com.poo.Heranca.Reescrita.Polimorfismo.Domain;

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
