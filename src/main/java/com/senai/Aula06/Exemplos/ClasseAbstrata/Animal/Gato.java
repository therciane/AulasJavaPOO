package com.senai.Aula06.Exemplos.ClasseAbstrata.Animal;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome + "Miou: miau miau");

    }
}
