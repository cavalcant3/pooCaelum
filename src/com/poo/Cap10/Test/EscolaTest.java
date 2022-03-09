package com.poo.Cap10.Test;

import com.poo.Cap10.Domain.Escola;
import com.poo.Cap10.Domain.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor = new Professor("java");
        Professor professor2 = new Professor("tiririca");
//        A escola recebe um array, então temos que passar em array
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("barragem", professores);

        escola.imprime();
    }
}
