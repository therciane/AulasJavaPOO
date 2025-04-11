package com.senai.Aula05.Exercicios.GestaodeLivros;

public class LivroFisico extends Livro{
    private int numerodePagina;

    public LivroFisico(String titulo, String autor, String editora, int numerodePagina) {
        super(titulo, autor, editora);
        this.numerodePagina = numerodePagina;
    }

    public int getNumerodePagina() {
        return numerodePagina;
    }

    public void setNumerodePagina(int numerodePagina) {
        this.numerodePagina = numerodePagina;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.printf("\n O livro tem: %d", numerodePagina);
    }
}
