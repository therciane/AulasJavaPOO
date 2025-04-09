package com.senai.Aula06.Exemplos.ClasseAbstrata.GerenciamentoFuncionarios;

abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagemdeAumento){
        salario += salario * porcentagemdeAumento/100;
    }

    public abstract double calcularBonus();

    public void exibirDados(){
        System.out.printf("\n %s recebe, R$%,.2f", nome, salario);
    }
}
