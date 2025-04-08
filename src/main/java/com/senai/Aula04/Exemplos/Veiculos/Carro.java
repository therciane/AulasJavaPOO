package com.senai.Aula04.Exemplos.Veiculos;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String modelo, int ano, int portas) {
        super(modelo, ano);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("portas: " + portas);
    }
}
