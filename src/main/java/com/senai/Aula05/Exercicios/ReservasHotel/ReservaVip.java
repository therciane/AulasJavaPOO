package com.senai.Aula05.Exercicios.ReservasHotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReservaVip extends Reservas{
    private double taxaServico = 50.80;

    public ReservaVip(double valorReserva, String tipo, int qtdDePessoas, String hospede, LocalDate dataHopedagem, double taxaServico) {
        super(valorReserva, tipo, qtdDePessoas, hospede, dataHopedagem);
        this.taxaServico = taxaServico;
    }

    @Override
    public double calcularCustoTotal() {
        return super.calcularCustoTotal() + taxaServico;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Hóspede: " + hospede);
        System.out.println("Tipo: VIP");
        System.out.println("Dias: " + qtdDeDias);
        System.out.printf("Valor por dia: R$ %.2f\n", valorReserva);
        System.out.printf("Taxa de serviço VIP: R$ %.2f\n", taxaServico);
        System.out.printf("Data da reserva: %s\n", dataHopedagem.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.printf("Custo Total: R$ %.2f\n", calcularCustoTotal());
        System.out.println("-----------------------------------");
    }
}
