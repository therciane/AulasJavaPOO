package com.senai.Aula05.Exercicios.GestaoDeProdutos;

public class Produto {
    protected String nomeProduto;
    protected double precoInicial;
    protected String marca;
    protected double desconto;
    protected String categoria;

    public Produto(String nomeProduto, double precoInicial, String marca, double desconto, String categoria) {
        this.nomeProduto = nomeProduto;
        this.precoInicial = precoInicial;
        this.marca = marca;
        this.desconto = desconto;
        this.categoria = categoria;
    }

    public double calcularImposto() {
        return 0; // padrão, sem imposto
    }

    public double calcularDesconto() {
        return precoInicial * (desconto / 100.0);
    }

    public double calcularPrecoFinal() {
        return precoInicial - calcularDesconto() + calcularImposto();
    }

    public void mostrarDetalhes() {
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Categoria: " + categoria);
        System.out.printf("Preço Base: R$ %.2f\n", precoInicial);
        System.out.println("A marca do produto é: " + marca);
        System.out.printf("Desconto (%.1f%%): -R$ %.2f\n", desconto, calcularDesconto());
        System.out.printf("Imposto: +R$ %.2f\n", calcularImposto());
        System.out.printf("Preço Final: R$ %.2f\n", calcularPrecoFinal());
        System.out.println("-------------------------------------");
    }
}