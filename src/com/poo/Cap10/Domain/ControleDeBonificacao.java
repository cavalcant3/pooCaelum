package com.poo.Cap10.Domain;

public  class ControleDeBonificacao {
    private double totalDeBonificacoes = 0;

    private void registra(Funcionario1 f) {
        System.out.println("Adicionando bonificacao: " + f);
        this.totalDeBonificacoes +=f.getBonificacao();
    }
    public double getTotalDeBonificacoes(){
        return this.totalDeBonificacoes;
    }
}
