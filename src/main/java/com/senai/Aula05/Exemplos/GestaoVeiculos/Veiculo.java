package com.senai.Aula05.Exemplos.GestaoVeiculos;

public class Veiculo {
    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void realizarManutecao(){
        System.out.println("Manutenção generica");
    }
}
