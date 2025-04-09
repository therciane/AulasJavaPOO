package com.senai.Aula05.Exercicios.GestaoBeneficiosFuncionarios;

public class ValeTransporte extends Beneficio{
    @Override
    public double calcularDesconto(double remuneracao) {
        return remuneracao - 0.6;
    }
}
