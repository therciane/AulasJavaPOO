package com.senai.Aula01.Exercicios.Aluno;

public class Aluno {
    String nome;
    int idade;
    float nota;

    public Aluno(String nome, int idade, float nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public void exibirInformacões() {
        System.out.println("As informções do aluno solicitado são " + nome + " "+ idade + " anos " + nota);
    }

    // Os parametros ficam () podendo-se criar outra variavel.
    public void atualizarNota(float novaNota) {
        this.nota = novaNota;
        System.out.println("O aluno" + nome + "Teve sua nota alterada para:" + novaNota);

        if (novaNota >= 6) {
            System.out.println("O aluno está liberado");
        } else {
            System.out.println("O aluno continua retido");
        }

    }
    public void verificarAprovacao(){
        if (nota >= 6) {
            System.out.println("O aluno passou!");

        } else {
            System.out.println("O aluno reprovou!!!!");
        }
    }
}
