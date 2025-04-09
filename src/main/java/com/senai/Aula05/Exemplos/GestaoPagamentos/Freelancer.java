package com.senai.Aula05.Exemplos.GestaoPagamentos;

public class Freelancer extends Pagamento {
    private double valorProjeto;

    public Freelancer(String nome, double projeto) {
        super(nome);
        this.valorProjeto = projeto;
    }

    @Override
    public double CalcularPagamento() {
        return valorProjeto;
    }
}
