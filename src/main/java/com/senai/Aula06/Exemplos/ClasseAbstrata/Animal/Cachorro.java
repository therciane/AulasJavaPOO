package com.senai.Aula06.Exemplos.ClasseAbstrata.Animal;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome + "Latiu: au au au");
    }
}
