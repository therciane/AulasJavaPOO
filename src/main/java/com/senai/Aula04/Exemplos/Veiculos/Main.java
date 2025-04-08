package com.senai.Aula04.Exemplos.Veiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("BMW", 2023, 2);
        Moto moto = new Moto("Vespa", 2024, false);

        carro.exibirDetalhes();
        moto.exibirdetalhes();
    }
}
