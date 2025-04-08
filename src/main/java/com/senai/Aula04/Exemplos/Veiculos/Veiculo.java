package com.senai.Aula04.Exemplos.Veiculos;

public class Veiculo {
    private String modelo;
    private int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //exibir detales substitui o toString.
    public void exibirDetalhes(){
        System.out.println("Modelo: " + modelo + "\n ano: " + ano);
    }
}
