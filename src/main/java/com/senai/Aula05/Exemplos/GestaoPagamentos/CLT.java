package com.senai.Aula05.Exemplos.GestaoPagamentos;

public class CLT extends Pagamento{
    private double salario;

    public CLT(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public double CalcularPagamento() {
        return salario;
    }
}
