package com.senai.Aula05.Exercicios.ReservasHotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReservaSimples extends Reservas {
    public ReservaSimples(double valorReserva, String tipo, int qtdDePessoas, String hospede, LocalDate dataHopedagem) {
        super(valorReserva, tipo, qtdDePessoas, hospede, dataHopedagem);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Hóspede: " + hospede);
        System.out.println("Tipo: Simples");
        System.out.println("Dias: " + qtdDeDias);
        System.out.printf("Valor por dia: R$ %.2f\n", valorReserva);
        System.out.printf("Data da reserva: %s\n", dataHopedagem.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.printf("Custo Total: R$ %.2f\n", calcularCustoTotal());
        System.out.println("-----------------------------------");
    }
}
