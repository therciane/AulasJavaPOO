package com.senai.Aula03.Exercicios.CadastroProdutoSimples;

public class Produto {
    private String nome;
    private double preco;

    //construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    //Set modificado para ter um argumento "illegal" neste caso para o preço não ser negativo.
    public void setPreco(double preco) {
        if (preco >= 0){
            this.preco = preco;
        }else{
            throw new IllegalArgumentException("O preço não pode ser negativo");
        }
    }
}
