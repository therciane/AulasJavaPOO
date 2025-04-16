package com.senai.Aula06.Exemplos.Interfaces.AparelhoEletronico;

public class Main {
    public static void main(String[] args) {
        testeAparelho(new Computador());
        testeAparelho(new Televisao());

        Televisao tv = new Televisao();
        tv.ligar();
        tv.mudarCanal();

        Computador pc = new Computador();
        pc.ligar();

    }

    private static void testeAparelho(aparelhoEletronico aparelhoEletronico) {
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }
}
