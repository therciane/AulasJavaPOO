package com.senai.Aula06.Exemplos.ClasseAbstrata.Animal;

abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    void dormir(){
        System.out.println(nome + "Está dormindo");

    }

    abstract void fazerSom(); //Uso de ponto-virgula pq em metodos abstratados não usamos chaves, o foco em si e falar o nome do metodo
}
