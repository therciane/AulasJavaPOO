package com.senai.Aula06.Exemplos.ClasseAbstrata.Veiculo;

abstract class Veiculo {
    private int velocidade;

    public Veiculo() {
        this.velocidade = velocidade;
    }

    void acelerar(int incremento){
        velocidade+=incremento;
        System.out.println("Acelerando para " + velocidade + "km por hora");
    }

    abstract void ligar(); //so podemos ter metodos abstratos se a classe for abstrata
}
