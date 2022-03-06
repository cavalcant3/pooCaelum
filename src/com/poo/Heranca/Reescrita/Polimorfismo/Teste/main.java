package com.poo.Heranca.Reescrita.Polimorfismo.Teste;

import com.poo.Heranca.Reescrita.Polimorfismo.Domain.Funcionario;
import com.poo.Heranca.Reescrita.Polimorfismo.Domain.Gerente;

public class main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(4500);
        System.out.println(gerente.getBonificacao());
        System.out.println("-----------------------------");
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(900);
        System.out.println(funcionario.getBonificacao());
    }
}
