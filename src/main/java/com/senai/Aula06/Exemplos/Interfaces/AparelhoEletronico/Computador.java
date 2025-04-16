package com.senai.Aula06.Exemplos.Interfaces.AparelhoEletronico;

public class Computador implements aparelhoEletronico{
    public Computador() {
    }

    @Override
    public void ligar() {
        System.out.println("Computador ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Computador desligado");
    }

    @Override
    public void mudarCanal() {
    }

}
