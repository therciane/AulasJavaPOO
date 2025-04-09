package com.senai.Aula05.Exemplos.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Chocolate prestigio");

        Produto produto2 = new Produto("Chocolate milka morango",15.00);

        Produto produto3 = new Produto("Chocolate galak",7.00,1);

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
    }
}
