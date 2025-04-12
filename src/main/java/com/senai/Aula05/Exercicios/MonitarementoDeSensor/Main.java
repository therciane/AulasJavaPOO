package com.senai.Aula05.Exercicios.MonitarementoDeSensor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Sensor> sensores = new ArrayList<>();

        sensores.add(new SensorTemperatura("T001"));
        sensores.add(new SensorUmidade("U001"));
        sensores.add(new SensorTemperatura("T002"));
        sensores.add(new SensorUmidade("U002"));

        System.out.println("INICIANDO MONITORAMENTO DE SENSORES\n");

        for (int i = 0; i < 5; i++) { // Simula 5 ciclos de leitura
            System.out.printf(">>> Ciclo %d:\n", i + 1);

            for (Sensor sensor : sensores) {
                sensor.autualizarValor(); // gera um novo valor
                sensor.reportarValor();  // exibe valor
            }

            System.out.println("----------------------------");
            Thread.sleep(3000); // espera 3 segundos entre ciclos
        }

        System.out.println("MONITORAMENTO ENCERRADO");
    }
}
