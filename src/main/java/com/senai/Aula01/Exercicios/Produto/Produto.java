package com.senai.Aula01.Exercicios.Produto;

public class Produto {
    String item;
    float valor;
    int qtdEstoque;

    public Produto(String item, float valor, int qtdEstoque) {
        this.item = item;
        this.valor = valor;
        this.qtdEstoque = qtdEstoque;
    }

    //Aqui demonstrei os detalhes do produto
    public void exibirDetalhes(){
        System.out.println("O estoque está desta forma:" + item + valor + qtdEstoque);
    }

    //o fori aqui deu certo
    public void atualizarEstoque(){
        for (int estoque = 0; estoque < qtdEstoque; estoque--) {
            estoque -= qtdEstoque-1;
        }
    }

    public float calcularValorEstoque(){
        return valor*qtdEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "item='" + item + '\'' +
                ", valor=" + valor +
                ", qtdEstoque=" + qtdEstoque +
                '}';
    }
}
