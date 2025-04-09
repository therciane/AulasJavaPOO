package com.senai.Aula05.Exemplos.GestaoVeiculos;

public class Main {
    public static void main(String[] args) {
        realizarManutencao(new Carro("Porsche"));
        realizarManutencao(new Moto("Kawasaki Ninja ZX-10R "));
        realizarManutencao(new Caminhao("Volvo FH 540 - 770"));
    }

    private static void realizarManutencao(Veiculo veiculo){
        veiculo.realizarManutecao();
    }
}
