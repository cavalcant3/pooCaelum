package com.poo;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Conta {


    public Data dataAbertura;

    String conta;
    String nomeTitular;
    String agaencia;
    int numero;
    double saldo;


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