package com.poo.aniversario;

public class Pessoa {
    String nome;
    int idade;

    void fazAniversario() {
        idade += 1;
    }

    String mostrarDados(String nome, int idade) {
        String s ="\nNome: " + this.nome;
        s += "\nidade: " + this.idade;
        return s;
    }
}
