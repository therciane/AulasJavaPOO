package com.senai.Aula04.Exemplos.GerenciamentoBancario;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Therciane", 19000.5, 1500);
        //ContaPoupanca contaPoupanca = new ContaPoupanca("Therciane", 500, 100);

        contaCorrente.exibirSaldo();
        // contaPoupanca.exibirSaldo();

        contaCorrente.sacar(20000);
        contaCorrente.sacar(900);

        //  contaPoupanca.aplicarRendimento();
    }
}

