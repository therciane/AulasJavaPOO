package com.senai.Aula01.Exemplos.Pessoa;

public class Endereço {
    String rua;
    int number;
    String bairro;
    String city;
    String estado;

    //Usa o construtor.
    public void Endereco(String rua, int number, String bairro, String city, String Estado) {
        this.rua = rua;
        this.number = number;
        this.bairro = bairro;
        this.city = city;
        this.estado = estado;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + ", number=" + number + ", bairro='" + bairro +
                ", cidade='" +  ", city='" + city +
                ", estado='" + estado;
    }
}
