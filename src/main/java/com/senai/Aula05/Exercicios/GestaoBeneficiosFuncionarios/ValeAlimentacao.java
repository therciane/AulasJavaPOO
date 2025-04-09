package com.senai.Aula05.Exercicios.GestaoBeneficiosFuncionarios;

public class ValeAlimentacao extends Beneficio{
    @Override
    public double calcularDesconto(double remuneracao) {
        return remuneracao - 0.7;
    }
}
