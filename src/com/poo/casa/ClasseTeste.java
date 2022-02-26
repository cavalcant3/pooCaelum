package com.poo.casa;

public class ClasseTeste {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.porta3 = true;
        casa.porta2 = false;
        casa.porta1 = true;
        casa.cor = "azul";
        System.out.println(casa.quantasPortasEstaoAbertas());
        System.out.println(casa.cor);
    }
}
