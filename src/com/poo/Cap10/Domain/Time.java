package com.poo.Cap10.Domain;

public class Time {
    private String nome;
//    adicionando varios jogadores
    private Jogadores[] jogadores;

    public Time(String nome, Jogadores[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public Time(String nome) {
        this.nome = nome;
    }
    public void imprime(){
        System.out.println(this.nome);
        if (jogadores == null)return;
        for (Jogadores jogador : jogadores) {
            System.out.println(jogador.getNome());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogadores[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogadores[] jogadores) {
        this.jogadores = jogadores;
    }
}
