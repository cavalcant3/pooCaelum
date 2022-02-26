package com.poo;

public class Data {
    int dia;
    int mes;
    int ano;

    String formatada(int dia, int mes, int ano){
        String s = dia+"/"+mes+"/"+ano;
        return s;
    }
}
