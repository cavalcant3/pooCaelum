package com.poo.ExerciciosEncapsulamento.Construtores.Static.Banco;

import com.poo.Data;

import java.text.ParseException;

public class BancoTeste {
    public static void main(String[] args) throws ParseException {

        Conta minhaConta = new Conta();
       // Conta c2 = new Conta();
        minhaConta.setSaldo(1500);
        minhaConta.setNome("Matheus");
        minhaConta.setNumero(1233);
//        testando metodos
       minhaConta.saca(500);
        minhaConta.deposita(2000);
       // minhaConta.transfere(c2,300);
        minhaConta.calculaRendimento();

        minhaConta.imprime();



    }
}
