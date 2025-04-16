package com.senai.Aula06.Exemplos.Interfaces.AparelhoEletronico;

public class Televisao implements aparelhoEletronico {
    public Televisao() {
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
        System.out.println("A tv mudou de canal");
    }
}
