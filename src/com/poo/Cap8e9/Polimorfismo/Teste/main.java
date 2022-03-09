package com.poo.Cap8e9.Polimorfismo.Teste;

import com.poo.Cap8e9.Polimorfismo.Domain.Funcionario;
import com.poo.Cap8e9.Polimorfismo.Domain.Gerente;

public class main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("gerente","190");

        gerente.setSalario(4500);
        System.out.println(gerente.getBonificacao());
        System.out.println("-----------------------------");




        Funcionario funcionario = new Funcionario("peao","0800");
        funcionario.setSalario(900);
        System.out.println(funcionario.getBonificacao());
        System.out.println(funcionario.mostrarDados());
        System.out.println("-----------------------------");
        System.out.println(gerente.mostrarDados());
    }
}
