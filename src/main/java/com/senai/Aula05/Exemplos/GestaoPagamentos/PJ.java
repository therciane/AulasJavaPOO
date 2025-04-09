package com.senai.Aula05.Exemplos.GestaoPagamentos;

public class PJ extends Pagamento{
    private double horasTrabalhadas;
    private double valorHora;

    public PJ(String nome, double horasTrabalhadas, double valorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double CalcularPagamento() {
        return horasTrabalhadas*valorHora;
    }
}
