package com.poo;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Conta {


    public Data dataAbertura;

    String conta;
    String nomeTitular;
    String agaencia;
    int numero;
    private double saldo;
    static private int totalDeContas;

    Conta(){
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }
    public double getSaldo() {
        return saldo;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    boolean novoSaldo(double valor) {
        if (valor > 0) {
            this.saldo = valor;
            return true;
        } else {
            return false;

        }
    }

    boolean saca(double valor) {
        if (valor < saldo) {
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }


    }

    void deposita(double valor) {
        this.saldo += valor;

    }

    double calculaRendimento() {
        double novoSaldo = saldo * 0.1;
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        decimalFormat.format(novoSaldo);
        return novoSaldo;

    }

    boolean transfere(Conta destino, double valor) {
        boolean verificacaoSaque = this.saca(valor);
        if (verificacaoSaque == false) {
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }
    }

    String recuperaDadosParaImpressao() {
        String dados = "Saldo: " + this.saldo;
        dados += "\nAgencia: " + this.agaencia;
        dados += "\nConta: " + this.conta;
        dados += "\nNome Titular: " + this.nomeTitular;
        dados += "\nNumero: " + this.numero;
        dados += "\nRendimento: " + this.calculaRendimento();
        dados += "\nData do ano de abertura: " + this.dataAbertura.formatada(dataAbertura.dia,
                dataAbertura.mes,
                dataAbertura.ano);

        return dados;
    }


}