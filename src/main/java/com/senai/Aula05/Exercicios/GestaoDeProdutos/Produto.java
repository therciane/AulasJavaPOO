package com.senai.Aula05.Exercicios.GestaoDeProdutos;

public class Produto {
    protected String nomeProduto;
    protected double precoInicial;
    protected String marca;

    public Produto(String nomeProduto, double precoInicial, String marca) {
        this.nomeProduto = nomeProduto;
        this.precoInicial = precoInicial;
        this.marca = marca;
    }
}
