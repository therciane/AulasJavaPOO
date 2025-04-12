package com.senai.Aula05.Exercicios.GestaoBeneficiosFuncionarios;

public class Beneficio {
    protected String nomeFuncionario;
    protected String cargoFuncionario;
    protected int idade;
    protected double salario;

    public Beneficio(String nomeFuncionario, String cargoFuncionario, int idade, double salario) {
        this.nomeFuncionario = nomeFuncionario;
        this.cargoFuncionario = cargoFuncionario;
        this.idade = idade;
        this.salario = salario;
    }

    public double calcularDesconto(int salario){
        return salario;
    }

    public void mostrarInformacoes(){
        System.out.println("Os dados do funcionario é: " + nomeFuncionario + idade + salario + cargoFuncionario);
    }
}
