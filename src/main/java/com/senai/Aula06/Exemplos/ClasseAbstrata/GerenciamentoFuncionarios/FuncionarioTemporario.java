package com.senai.Aula06.Exemplos.ClasseAbstrata.GerenciamentoFuncionarios;

public class FuncionarioTemporario extends Funcionario{
    private int horasExtras;
    private double valorHoraExtras;

    public FuncionarioTemporario(String nome, double salario, int horasExtras, double valorHoraExtras) {
        super(nome, salario);
        this.horasExtras = horasExtras;
        this.valorHoraExtras = valorHoraExtras;
    }

    @Override
    public double calcularBonus() {
        return salario += horasExtras*valorHoraExtras;
    }
}
