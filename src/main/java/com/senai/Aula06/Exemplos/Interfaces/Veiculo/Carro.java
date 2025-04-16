package com.senai.Aula06.Exemplos.Interfaces.Veiculo;

public class Carro implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }

    @Override
    public void buzinar() { //opcional
        Veiculo.super.buzinar();
    }
}
