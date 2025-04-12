package com.senai.Aula05.Exercicios.GestaoBeneficiosFuncionarios;

public class PlanoSaude extends Beneficio{
    private String marcaPlano;

    public PlanoSaude(String nomeFuncionario, String cargoFuncionario, int idade, double salario, String marcaPlano) {
        super(nomeFuncionario, cargoFuncionario, idade, salario);
        this.marcaPlano = marcaPlano;
    }

    @Override
    public double calcularDesconto(int salario) {
        return salario - 150;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Marca do plano:" + marcaPlano);
    }
}
