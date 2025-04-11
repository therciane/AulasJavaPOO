package com.senai.Aula05.Exercicios.GestaodeLivros;

public class Main {
    public static void main(String[] args) {
        Livro[] livros = new Livro[4];

        livros[0] = new LivroDigital(
                "É assim que acaba",
                "Coolen Hover",
                "Record",
                24);

        livros[1] = new LivroFisico(
                "Crepúsculo",
                "Stephenie",
                "intriseca",
                355);

        livros[2] = new LivroDigital(
                "A biblioteca da meia noite",
                "Matt Haing",
                "Bertrand Brasil",
                23.7);

        livros[3] = new LivroFisico(
                "Manual de assasinato para boas garotas",
                "Holly Jackson",
                "intrissica",
                422);

        for (Livro livro : livros){
            livro.exibirDetalhes();
        }
    }
}
