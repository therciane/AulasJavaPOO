package com.senai.Aula05.Exercicios.MonitarementoDeSensor;

import java.util.Random;

public class SensorUmidade extends Sensor {
    private double umidade;
    private Random random = new Random();

    public SensorUmidade(String id) {
        super(id);
        this.umidade = umidade;
    }

    @Override
    public void autualizarValor() {
        umidade = random.nextDouble() * 100;
    }

    @Override
    public void reportarValor() {
        System.out.println("O sensor " + id + " que a umidade está em: " + umidade);
    }
}
