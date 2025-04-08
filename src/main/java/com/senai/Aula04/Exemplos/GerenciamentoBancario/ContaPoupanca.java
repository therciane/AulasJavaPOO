package com.senai.Aula04.Exemplos.GerenciamentoBancario;

public class ContaPoupanca extends ContaBancaria{
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    //Um pequeno cálculo para o utilizador ver o rendimento da sua conta poupança
    public void aplicarRendimento() {
        double saldo = (getSaldo() * taxaRendimento / 100);
    }
}
