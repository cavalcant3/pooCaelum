package com.poo;

public class Main {

    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        Conta c2;
        c2 = new Conta();
        Data data = new Data();
        data = new Data();
        minhaConta.dataAbertura = data;
        minhaConta.dataAbertura.dia=44;
        minhaConta.dataAbertura.mes=6;
        minhaConta.dataAbertura.ano=2001;

        minhaConta.nomeTitular = "matheus";
        minhaConta.conta = "matando cachorro a grito";
        minhaConta.agaencia = "funeraria sorria! sua morte é nossa alegria";
        minhaConta.numero= 9999;
        minhaConta.saldo= 1800;

        minhaConta.deposita(1600);
        minhaConta.saca(400);
//        transferindo para outra conta
        minhaConta.transfere(c2,999);
        System.out.println(c2.saldo);
        System.out.println(minhaConta==c2);
        System.out.println(minhaConta.calculaRendimento());
        System.out.println("----------------------------");

        System.out.println( minhaConta.recuperaDadosParaImpressao());;


    }
}
