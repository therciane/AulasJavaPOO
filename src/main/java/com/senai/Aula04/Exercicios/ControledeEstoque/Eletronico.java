package com.senai.Aula04.Exercicios.ControledeEstoque;

public class Eletronico extends Produto {
    private String voltagem;

    public Eletronico(String nome, double preco, int qtd, String voltagem) {
        super(nome, preco, qtd);
        this.voltagem = voltagem;
    }

    public String getVoltagem() {
        return voltagem;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("A voltagem do produto é:  " + voltagem);
    }
}

