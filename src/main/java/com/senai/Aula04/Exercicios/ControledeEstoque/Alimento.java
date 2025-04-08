package com.senai.Aula04.Exercicios.ControledeEstoque;

public class Alimento extends Produto{
    private String dataValidade;

    public Alimento(String nome, double preco, int qtd, String dataValidade) {
        super(nome, preco, qtd);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Data de Validade: " + dataValidade);
    }
}
