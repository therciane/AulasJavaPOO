package com.senai.Aula06.Exemplos.ClasseAbstrata.ContaBancaria;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void aplicarTaxaMensal() {
        saldo += saldo*0.05;
    }
}
