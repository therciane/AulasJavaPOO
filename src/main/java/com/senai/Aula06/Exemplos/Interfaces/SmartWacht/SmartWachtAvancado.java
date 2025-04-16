package com.senai.Aula06.Exemplos.Interfaces.SmartWacht;

public class SmartWachtAvancado implements SensorCardiaco, SensorPassos, SensorSono{
    @Override
    public void medirFrequenciaCardiaca() {
        System.out.println("Medição cardiaca: 90bpm");
    }

    @Override
    public void contarPassos() {
        System.out.println("Você deu: 350 passos hoje");

    }

    @Override
    public void medirqualidadeSono() {
        System.out.println("Você dormiu por: 12 horas, sendo um sono extenso");

    }

    void exibirInfoDispositivo(){
        System.out.println("Dispositvos concectados: ...");
    }
}
