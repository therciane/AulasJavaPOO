package com.senai.Aula04.Exercicios.GestãodePedidos;

public class Pedido {
    protected double valorTotal;
    private int numeroPedido;

    public Pedido(double valorTotal, int numeroPedido) {
        this.valorTotal = valorTotal;
        this.numeroPedido = numeroPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void exibirdados(){
        System.out.printf("\n O valor total do seu pedido foi:R$%,.2f  ", valorTotal);
    }
}
