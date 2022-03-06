package com.poo.Heranca.Reescrita.Polimorfismo.Domain;

public class Gerente extends Funcionario {
    int senha;
    int numeroDeFuncionarioGerenciaos;
//      @override
    public double getBonificacao() {
        return this.salario * 0.15;
    }

}
