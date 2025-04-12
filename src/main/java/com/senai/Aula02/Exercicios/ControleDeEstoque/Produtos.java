package com.senai.Aula02.Exercicios.ControleDeEstoque;

public class Produtos {
    private String nomeProduto;
    private int qtdProduto;

    public Produtos(String nomeProduto, int qtdProduto) {
        this.nomeProduto = nomeProduto;
        this.qtdProduto = qtdProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    @Override
    public String toString() {
        return  "Produto: " + nomeProduto + " | Quantidade: " + qtdProduto;
    }
}
