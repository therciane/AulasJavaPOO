package com.senai.Aula06.Exemplos.Interfaces.Veiculo;

public interface Veiculo {
    void acelerar();
    default void buzinar(){
        System.out.println("bebebebe");
    }
}
