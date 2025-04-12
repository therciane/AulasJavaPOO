package com.senai.Aula05.Exercicios.ReservasHotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservas {
    protected double valorReserva;
    protected String tipo;
    protected int qtdDeDias;
    protected String hospede;
    protected LocalDate dataHopedagem;

    public Reservas(double valorReserva, String tipo, int qtdDePessoas, String hospede, LocalDate dataHopedagem) {
        this.valorReserva = valorReserva;
        this.tipo = tipo;
        this.qtdDeDias = qtdDePessoas;
        this.hospede = hospede;
        this.dataHopedagem = dataHopedagem;
    }

    public double calcularCustoTotal() {
       return qtdDeDias * valorReserva;
    }

    public void exibirDetalhes(){
        System.out.println("Hóspede: " + hospede);
        System.out.println("Tipo: Comum" + tipo);
        System.out.println("Dias: " + qtdDeDias);
        System.out.printf("Valor por dia: R$ %.2f\n", valorReserva);
        System.out.printf("Data da reserva: %s\n", dataHopedagem.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.printf("Custo Total: R$ %.2f\n", calcularCustoTotal());
        System.out.println("-----------------------------------");
    }
}
