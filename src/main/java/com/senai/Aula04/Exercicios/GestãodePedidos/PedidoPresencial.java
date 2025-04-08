package com.senai.Aula04.Exercicios.GestãodePedidos;

public class PedidoPresencial extends Pedido{
    private double descontoAVista;
    private int qtdProdutos;

    public PedidoPresencial(double valorTotal, int numeroPedido, double descontoAVista, int qtdProdutos) {
        super(valorTotal, numeroPedido);
        this.descontoAVista = descontoAVista;
        this.qtdProdutos = qtdProdutos;
    }

    public double getDescontoAVista() {
        return descontoAVista;
    }

    public void setDescontoAVista(double descontoAVista) {
        this.descontoAVista = descontoAVista;
    }

    public int getQtdProdutos() {
        return qtdProdutos;
    }

    public void setQtdProdutos(int qtdProdutos) {
        this.qtdProdutos = qtdProdutos;
    }

    public double valorDesconto(){
        if (descontoAVista == 20) {
        }
        return valorTotal - descontoAVista;
    }

    @Override
    public void exibirdados() {
        System.out.println("O valor da sua compra sem o desconto è de :  " + valorTotal + "Com o desconto aplicado ficou: " + valorDesconto());
    }
}
