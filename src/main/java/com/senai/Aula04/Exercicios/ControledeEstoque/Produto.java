package com.senai.Aula04.Exercicios.ControledeEstoque;

public class Produto {
    protected String nome;
    protected double preco;
    protected int qtd;

    //Construtor
    public Produto(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
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

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

//Metodo para incremento do código, onde criei um "mini crud"

    public void adicionarEstoque(int quantidade) {
        this.qtd += quantidade;
        System.out.println(quantidade + " Produtos adicionados ao estoque");
    }

    //Aqui é o de remoção, usei um if/else como condição, para que os produtos fossem removidos do estoque.
    public boolean removerEstoque(int qtd) {
        if (qtd > this.qtd) {
            System.out.println("Erro! Estoque insuficiente.");
            return false;
        } else {
            this.qtd -= qtd;
            System.out.println(qtd + " unidades retiradas do estoque.");
            return true;
        }
    }

    public void exibirDetalhes() {
        System.out.printf("\n O produto adquirido foi:  %s,  O preço do produto é: R$,.2f, a quantidade adquirida é:  ", nome, preco, qtd);
        //Usei um printf para melhor visualização das informações retiradas
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qtd=" + qtd +
                '}';
    }
}
