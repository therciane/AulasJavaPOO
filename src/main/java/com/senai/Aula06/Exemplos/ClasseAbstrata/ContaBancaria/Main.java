package com.senai.Aula06.Exemplos.ClasseAbstrata.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        testarContas(new ContaCorrente("Therciane", 78500));
        testarContas(new ContaPoupanca("Felix", 10000));
    }

    public static void testarContas(ContaBancaria contaBancaria){
        contaBancaria.exibirSaldo();
        contaBancaria.sacar(800);
        contaBancaria.aplicarTaxaMensal();
        contaBancaria.exibirSaldo();
        contaBancaria.depositar(446);
    }
}
