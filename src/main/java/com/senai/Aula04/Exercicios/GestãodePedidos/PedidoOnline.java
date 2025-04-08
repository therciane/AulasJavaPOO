package com.senai.Aula04.Exercicios.GestãodePedidos;

public class PedidoOnline extends Pedido{
    private double taxaEntrega;
    private String endereco;

    public PedidoOnline(double valorTotal, int numeroPedido, String endereco, double taxaEntrega) {
        super(valorTotal, numeroPedido);
        this.endereco = endereco;
        this.taxaEntrega = taxaEntrega;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double valorFrete(double velocidade, double tempo){
        taxaEntrega = 4.5;
        return velocidade*tempo/taxaEntrega;
    }

    @Override
    public void exibirdados() {
        System.out.println("A valorFrete de entrega será de  " + valorFrete(2.5, 25));
    }
}
