package com.senai.Aula05.Exercicios.GestaoBeneficiosFuncionarios;

public class Main {
    public static void main(String[] args) {
       Beneficio B1 = new PlanoSaude();
       Beneficio B2 = new ValeAlimentacao();
       Beneficio B3 = new ValeTransporte();

       B1.calcularDesconto(3500);
       B1.exibirDetalhes();

       B2.calcularDesconto(3500);
       B2.exibirDetalhes();

       B3.calcularDesconto(3400);
       B3.exibirDetalhes();
    }
}
