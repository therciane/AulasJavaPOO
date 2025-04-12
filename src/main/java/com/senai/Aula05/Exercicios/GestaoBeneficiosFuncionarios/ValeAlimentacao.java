package com.senai.Aula05.Exercicios.GestaoBeneficiosFuncionarios;

public class ValeAlimentacao extends Beneficio{
    private double valorVale;

    public ValeAlimentacao(String nomeFuncionario, String cargoFuncionario, int idade, double salario, double valorVale) {
        super(nomeFuncionario, cargoFuncionario, idade, salario);
        this.valorVale = valorVale;
    }

    @Override
    public double calcularDesconto(int salario) {
        return salario * 0.2;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("O valor do vale é: " + valorVale);
    }
}
