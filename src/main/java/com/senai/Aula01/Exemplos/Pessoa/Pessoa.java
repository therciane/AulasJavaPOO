package com.senai.Aula01.Exemplos.Pessoa;

public class Pessoa {
    String nome;
    int idade;
    float altura;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String dado, int idade, float altura) {
    }

    public void falar(String frase) {
        System.out.println(nome +  "falou: " + frase);
    }


    public void comer(String comida) {
        System.out.println(nome + "comeu: " + comida);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
