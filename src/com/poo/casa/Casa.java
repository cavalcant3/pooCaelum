package com.poo.casa;

public class Casa {
    String cor;
    boolean porta1;
    boolean porta2;
    boolean porta3;

    void pintar(String s){
        cor = s;
    }
    int quantasPortasEstaoAbertas(){
         int i=0;
        if (porta1==true){
             i++;
        }
        if (porta2 == true){
             i++;
        }
        if (porta3 == true){
            i++;
        }
        return i;
    }
}
