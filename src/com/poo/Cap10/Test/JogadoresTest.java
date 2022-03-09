package com.poo.Cap10.Test;

import com.poo.Cap10.Domain.Jogadores;
import com.poo.Cap10.Domain.Time;

public class JogadoresTest {
    public static void main(String[] args) {
        Jogadores jogador1 = new Jogadores("tiririca");
        //  Jogadores jogador2 = new Jogadores("maracanã");
        //  Jogadores jogador3 = new Jogadores("ai papai");

//        Jogadores[] jogador = {jogador1,jogador2,jogador3};
//        for (Jogadores jogadores : jogador) {
//            jogadores.imprime();
//        }
//        Fazenod a associação 1 -- N. Classe jogadores nao inicia novo objeto
//        private Time time;
        Time time = new Time("brasil");
        jogador1.setTime(time);
        jogador1.imprime();

    }
}
