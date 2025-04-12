package com.senai.Aula05.Exercicios.GestaoBeneficiosFuncionarios;

public class ValeTransporte extends Beneficio{
   private String endereco;
   private double distancia;

    public ValeTransporte(String nomeFuncionario, String cargoFuncionario, int idade, double salario, String endereco, double distancia) {
        super(nomeFuncionario, cargoFuncionario, idade, salario);
        this.endereco = endereco;
        this.distancia = distancia;
    }

    @Override
    public double calcularDesconto(int salario) {
        return distancia + 10;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("O endereço do funcionario é: " + endereco + "A distancia até a empresa é: " + distancia);
    }
}
