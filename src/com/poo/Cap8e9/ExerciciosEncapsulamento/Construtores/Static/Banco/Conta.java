package com.poo.Cap8e9.ExerciciosEncapsulamento.Construtores.Static.Banco;

import java.text.ParseException;

/**
 * Classe	responsavel	por	moldar	as	Contas	do	Banco
 *
 * @author Matheus Cavalcante
 */

public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private String nome;
    private static int id;


    //      incremento de cada conta por id
    public Conta() {
        Conta.id = Conta.id + 1;
    }

    public Conta(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo	que	saca e diminui	o	saldo.
     *
     * @param    valor
     */

    public boolean saca(double valor) {
        if (valor < this.saldo) {
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo	que	incrementa	o	saldo.
     *
     * @param    valor
     */

    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public double calculaRendimento() {
        double novoSaldo = saldo * 0.1;
        return novoSaldo;
    }

    public boolean transfere(Conta destino, double valor) {
        boolean verificacaoSaque = this.saca(valor);
        if (verificacaoSaque == false) {
            return false;
        } else {
            return true;
        }
    }

    public String imprime() throws ParseException {
        String s = "numero conta:" + getNumero();
        s += "\nsaldo: " + getSaldo();
        s += "\ntitular: " + getNome();
        s += "\nidConta: " + getId();
        s += "\nRendimento: " + this.calculaRendimento();
        System.out.println(s);
        return s;
    }


    public static int getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
