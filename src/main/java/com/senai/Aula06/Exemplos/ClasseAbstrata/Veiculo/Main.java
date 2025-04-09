package com.senai.Aula06.Exemplos.ClasseAbstrata.Veiculo;

public class Main {
    public static void main(String[] args) {
        testarVeiculo(new Carro(),40);
        testarVeiculo(new Moto(),70);
    }
    private static void testarVeiculo(Veiculo veiculo, int incremento){
        veiculo.ligar();
        veiculo.acelerar(incremento);
    }
}
