package com.senai.Aula01.Exercicios.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(
                "Chocolate",
                8.9f,
                70);

        System.out.println(produto);

        Produto produto1 = new Produto(
                "Doce de leite",
                15.7f,
                30);

        System.out.println(produto1);

        produto.atualizarEstoque();
        produto.exibirDetalhes();
        produto.calcularValorEstoque();
        produto1.calcularValorEstoque();
        produto1.exibirDetalhes();
        produto1.atualizarEstoque();
    }
}
