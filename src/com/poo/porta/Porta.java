package com.poo.porta;

public class Porta {
    boolean aberta;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;

    void abre() {
        this.aberta = true;
    }

    void fecha() {
        this.aberta = false;
    }

    void pintar(String s) {
        this.cor = s;
    }

    boolean estaAberta() {
        boolean verdadeiro = true;
        boolean falso = false;
        boolean resposta = (aberta == true) ? verdadeiro : falso;
        return resposta;
    }

    String especificacoes() {
        String r = "Dimensão X: " + this.dimensaoX;
        r += "\nDimensão Y: " + this.dimensaoY;
        r += "\nDimensão Z: " + this.dimensaoZ;
        r+= "\n Está aberta? "+this.estaAberta();
        r+= "\n Qual a cor? "+this.cor;
        return r;
    }
}
