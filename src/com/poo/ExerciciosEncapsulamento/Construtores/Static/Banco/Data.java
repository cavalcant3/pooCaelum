package com.poo.ExerciciosEncapsulamento.Construtores.Static.Banco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data {
//    IMPRIMIR ESSA DATA FORMATADA NA TELA
    private int dia;
    private int mes;
    private int ano;
     String dataAbertura;
     String Teste;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Calendar cal = Calendar.getInstance();

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    Date dataFormatada(String dataAbertura) throws ParseException {
       Date dataFinal = sdf.parse(dataAbertura);
       cal.setTime(dataFinal);
       cal.add(Calendar.MONTH,2);
       dataFinal = cal.getTime();
       Teste = sdf.format(dataFinal);



        return dataFinal;
    }

    public String getTeste() {
        return Teste;
    }
}
