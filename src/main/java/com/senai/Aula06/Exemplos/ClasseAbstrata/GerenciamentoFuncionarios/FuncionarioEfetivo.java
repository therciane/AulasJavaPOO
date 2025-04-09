package com.senai.Aula06.Exemplos.ClasseAbstrata.GerenciamentoFuncionarios;

public class FuncionarioEfetivo extends Funcionario{
    private double bonusMensal;

    public FuncionarioEfetivo(String nome, double salario, double bonusMensal) {
        super(nome, salario);
        this.bonusMensal = bonusMensal;
    }

    @Override
    public double calcularBonus() {
        return salario += bonusMensal;
    }
}
