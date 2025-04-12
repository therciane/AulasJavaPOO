package com.senai.Aula05.Exercicios.MonitarementoDeSensor;
import java.util.Random;

public class SensorTemperatura extends Sensor {
    private double temperatura;
    private Random random = new Random();

    public SensorTemperatura(String id) {
        super(id);
        this.temperatura = temperatura;
    }

    @Override
    public void autualizarValor() {
        temperatura = -10 + random.nextDouble() * 50;
    }

    @Override
    public void reportarValor() {
        System.out.println("A temperatura do ambiente: " + temperatura + " o sensor foi: " + id);
    }
}
