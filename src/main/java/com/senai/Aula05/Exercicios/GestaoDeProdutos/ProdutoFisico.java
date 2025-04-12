package com.senai.Aula05.Exercicios.GestaoDeProdutos;

public class ProdutoFisico extends Produto{
    public ProdutoFisico(String nomeProduto, double precoInicial, String marca, double desconto, String categoria) {
        super(nomeProduto, precoInicial, marca, desconto, categoria);
    }

    @Override
    public double calcularDesconto() {
        return (precoInicial - desconto * 0.10);
    }
}
