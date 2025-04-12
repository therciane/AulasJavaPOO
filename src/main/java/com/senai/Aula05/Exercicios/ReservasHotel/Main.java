package com.senai.Aula05.Exercicios.ReservasHotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Reservas> reservas = new ArrayList<>();
    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== MENU DE RESERVAS ===");
            System.out.println("1 - Cadastrar Reserva Simples");
            System.out.println("2 - Cadastrar Reserva VIP");
            System.out.println("3 - Listar Reservas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarHospedagemSimples();
                    break;

                case 2:
                    cadastrarHospedagemVip();
                    break;

                case 3:
                    listarHospedagens();
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }

    public static void cadastrarHospedagemSimples(){
        System.out.print("Nome do hóspede: ");
        String nomeSimples = sc.nextLine();
        System.out.println("Tipo da reserva: ");
        String tipo = sc.nextLine();
        System.out.println("Quantas pessoas se hospedaram?");
        int pessoas = sc.nextInt();
        System.out.print("Valor por diária: ");
        double valorSimples = sc.nextDouble();
        System.out.println("Data da hospedagem: ");
        LocalDate diasSimples = LocalDate.parse(sc.nextLine());
        reservas.add(new ReservaSimples(valorSimples, tipo, pessoas, nomeSimples, diasSimples));
        System.out.println("Reserva Simples cadastrada com sucesso!");
    }

    public static void cadastrarHospedagemVip(){
        System.out.println("Quantas pessoas se hospedaram?");
        int pessoas = sc.nextInt();
        System.out.println("Tipo da reserva: ");
        String tipo = sc.nextLine();
        System.out.print("Nome do hóspede: ");
        String nomeVIP = sc.nextLine();
        System.out.print("Valor por diária: ");
        double valorVIP = sc.nextDouble();
        System.out.println("Data da hospedagem: ");
        LocalDate diasVipi = LocalDate.parse(sc.nextLine());
        System.out.println("A taxa de serviço é: ");
        double taxa = sc.nextDouble();
        reservas.add(new ReservaVip(valorVIP, tipo, pessoas, nomeVIP, diasVipi, taxa));
        System.out.println("Reserva VIP cadastrada com sucesso!");
    }

    public static void listarHospedagens(){
        System.out.println("\nLISTA DE RESERVAS");
        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva cadastrada.");
        } else {
            for (Reservas r : reservas) {
                r.exibirDetalhes();
            }
        }
    }
}
