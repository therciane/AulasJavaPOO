package com.senai.Aula05.Exercicios.GestaoDeProdutos;

public class ProdutoDigital  extends  Produto{
    public ProdutoDigital(String nomeProduto, double precoInicial, String marca, double desconto, String categoria) {
        super(nomeProduto, precoInicial, marca, desconto, categoria);
    }

    @Override
    public double calcularDesconto() {
        return (precoInicial - desconto * 0.30);
    }
}
