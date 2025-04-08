package com.senai.Aula01.Exercicios.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(
                "Therciane",
                18,
                8.5f);
        System.out.println(aluno);

        Aluno aluno1 = new Aluno(
                "Mariana",
                17,
                8.8f);

        System.out.println(aluno1);

        Aluno aluno2 = new Aluno(
                "Felipe",
                18,
                4.5f);

        System.out.println(aluno2);

        aluno.exibirInformacões();
        aluno.verificarAprovacao();
        aluno.atualizarNota(9);

        aluno1.exibirInformacões();
        aluno1.verificarAprovacao();
        aluno1.atualizarNota(9);

        aluno2.exibirInformacões();
        aluno2.verificarAprovacao();
        aluno2.atualizarNota(10);
    }
}
