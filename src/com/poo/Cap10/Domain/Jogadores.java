package com.poo.Cap10.Domain;

import com.poo.Cap10.Test.JogadoresTest;

public class Jogadores {
//    treinando associação
    private Time time;
    private String nome;

    public void imprime(){
//        BUG: imprimindo somente um jogador.
//        Testar solução: criar um array de nomes nos atributos.
        System.out.println(this.nome);
        if (time!= null){
            System.out.println(time.getNome());
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Jogadores(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
