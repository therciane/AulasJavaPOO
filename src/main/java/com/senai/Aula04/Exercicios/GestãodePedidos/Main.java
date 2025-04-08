package com.senai.Aula04.Exercicios.GestãodePedidos;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new PedidoOnline(
                300,
                123,
                "R. Francisco José Viana 463",
                13.9);
        Pedido pedido2 = new PedidoPresencial(
                500,
                234,
                20,
                5);

        pedido1.exibirdados();
        pedido2.exibirdados();

        pedido1.setValorTotal(500);
        pedido2.setValorTotal(450);
    }
}
