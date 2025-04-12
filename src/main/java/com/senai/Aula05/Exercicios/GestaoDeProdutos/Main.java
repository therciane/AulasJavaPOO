package com.senai.Aula05.Exercicios.GestaoDeProdutos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new ProdutoFisico(
                "Celular",
                4.000,
                "Iphone",
                100,
                "Eletronico"));
        produtos.add(new ProdutoDigital(
                "E-book Java",
                50,
                "Kindle",
                5,
                "Livros"
                ));
        produtos.add(new ProdutoServico(
                "Acessoria de casamento",
                1.500,
                "Blasques",
                30,
                "Buffet"
                ));
        produtos.add(new ProdutoFisico(
                "Saia Jeans",
                130,
                "Shein",
                15,
                "Vestuario"
                ));

        System.out.println("RELATÓRIO DE PRODUTOS\n");
        for (Produto p : produtos) {
            p.mostrarDetalhes();
        }
    }
}
