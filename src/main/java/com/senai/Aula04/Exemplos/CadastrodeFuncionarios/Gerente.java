package com.senai.Aula04.Exemplos.CadastrodeFuncionarios;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void exibirdados() {
        System.out.printf("\n Nome: %s, salario: R$%,.2f", getNome(), salario+bonus);

    }
}
