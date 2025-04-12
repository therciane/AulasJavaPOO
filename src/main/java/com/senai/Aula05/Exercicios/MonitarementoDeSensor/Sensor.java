package com.senai.Aula05.Exercicios.MonitarementoDeSensor;

public class Sensor {
    protected String id;

    public Sensor(String id) {
        this.id = id;
    }

    public void autualizarValor(){

    }

    public void reportarValor() {
        System.out.println("Sensor genérico não possui valor específico.");
    }
}
