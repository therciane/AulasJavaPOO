package com.senai.Aula05.Exercicios.GestaoBeneficiosFuncionarios;

public class Beneficio {
    private double salario;
    protected double calcularDesconto;

    public void exibirDetalhes(){
        System.out.println("O Salario do funcionario com os devidos descontos é:  " + salario);
    }

    public double calcularDesconto(double remuneracao) {
        return salario - calcularDesconto(3500);
    }
}
