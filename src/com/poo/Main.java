package com.poo;

public class Main {

    public static void main(String[] args) {
        Conta minhaConta;
        //        testando o constructor
        minhaConta = new Conta("olá teste");
        Conta c2;
        //        testando o constructor
        c2 = new Conta("olá teste");
        Data data = new Data();
        data = new Data();
        int totalContasss = Conta.getTotalDeContas();
//        testando o constructor
        System.out.println(minhaConta.nomeTitular);
        System.out.println(c2.nomeTitular);
        minhaConta.dataAbertura = data;
        minhaConta.dataAbertura.dia=44;
        minhaConta.dataAbertura.mes=6;
        minhaConta.dataAbertura.ano=2001;

        minhaConta.nomeTitular = "matheus";
        minhaConta.conta = "matando cachorro a grito";
        minhaConta.agaencia = "funeraria sorria! sua morte é nossa alegria";
        minhaConta.numero= 9999;
        minhaConta.setSaldo(1800);

        minhaConta.deposita(1600);
        minhaConta.saca(400);

//        transferindo para outra conta
        minhaConta.transfere(c2,999);
        System.out.println(c2.getSaldo());
        System.out.println(minhaConta==c2);
        System.out.println(minhaConta.calculaRendimento());
        System.out.println("----------------------------");

        System.out.println( minhaConta.recuperaDadosParaImpressao());;





    }
}
