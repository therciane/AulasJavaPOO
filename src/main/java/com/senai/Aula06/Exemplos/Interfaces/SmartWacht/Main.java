package com.senai.Aula06.Exemplos.Interfaces.SmartWacht;

public class Main {
    public static void main(String[] args) {
        SmartWachtAvancado smartWachtAvancado = new SmartWachtAvancado();

        smartWachtAvancado.contarPassos();
        smartWachtAvancado.medirFrequenciaCardiaca();
        smartWachtAvancado.medirqualidadeSono();
        smartWachtAvancado.exibirInfoDispositivo();
    }
}
