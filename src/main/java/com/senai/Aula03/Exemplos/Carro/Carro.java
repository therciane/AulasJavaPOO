package com.senai.Aula03.Exemplos.Carro;

public class Carro {
    //Caso estivesse privado, seria apenas acessado dentro da própia classe, porém
    //deixei publico, ele pode ser acessado de "qualquer" lugar
    public int velocidade;

    public Carro(){
        velocidade = 0;
    }
    public int getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        if (velocidade >= 0){

        } else {
            System.out.println("velocidade invalidade");
        }
    }
}
