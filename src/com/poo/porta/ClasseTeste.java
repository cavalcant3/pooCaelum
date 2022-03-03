package com.poo.porta;

public class ClasseTeste {
    public static void main(String[] args) {
        Porta porta = new Porta();

        porta.cor="azul";
        porta.dimensaoX = 111;
        porta.dimensaoY = 222;
        porta.dimensaoZ = 333;
        porta.pintar("vermelho");
        porta.fecha();
        porta.estaAberta();
        System.out.println(porta.especificacoes());
    }
}
