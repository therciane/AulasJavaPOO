package com.senai.Aula06.Exemplos.ClasseAbstrata.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listaAnimal = new ArrayList<>();

        listaAnimal.add(new Cachorro("Totó"));
        listaAnimal.add(new Gato("Marrie"));

        listaAnimal.forEach(animal -> {
            animal.dormir();
            animal.dormir();
        });
    }
}
