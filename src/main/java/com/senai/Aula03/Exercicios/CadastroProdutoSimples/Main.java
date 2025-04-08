package com.senai.Aula03.Exercicios.CadastroProdutoSimples;

public class Main {
    public static void main(String[] args) {

    //No preenchimento do encapsulamento não muda nada em relação a aula 1.
        Produto produto1 = new Produto("Chocolate", 15.98);
        Produto produto2 = new Produto("Hidratante", 45.50);


        System.out.println("Preço negativo");
        produto1.setPreco(-11);
        produto2.setPreco(-44);


    }
}
