package com.senai.Aula05.Exercicios.GestaodeLivros;

public class LivroDigital extends Livro {
    private double qtdArquivoEmMB;

    public LivroDigital(String titulo, String autor, String editora, double qtdArquivoEmMB) {
        super(titulo, autor, editora);
        this.qtdArquivoEmMB = qtdArquivoEmMB;
    }

    public double getQtdArquivoEmMB() {
        return qtdArquivoEmMB;
    }

    public void setQtdArquivoEmMB(double qtdArquivoEmMB) {
        this.qtdArquivoEmMB = qtdArquivoEmMB;
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("\n O arquivo pesou: %f", qtdArquivoEmMB);
    }
}
