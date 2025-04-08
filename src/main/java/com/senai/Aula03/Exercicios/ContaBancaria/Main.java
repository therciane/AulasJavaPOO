package com.senai.Aula03.Exercicios.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("Therciane",41500.7);
        ContaBancaria contaBancaria2 = new ContaBancaria("Lucas", 95.8);

        System.out.println("Sacar");
        contaBancaria1.sacar(-10);
        contaBancaria2.sacar(-80);
        contaBancaria1.sacar(420000.2);

        System.out.println("Depositar");
        contaBancaria1.depositar(70);
        contaBancaria2.depositar(45);

        System.out.println("Trasferir");
        contaBancaria1.transferir(2.5,contaBancaria2);
    }
}
