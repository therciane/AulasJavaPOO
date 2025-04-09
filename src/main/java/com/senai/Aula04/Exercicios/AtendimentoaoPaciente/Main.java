package com.senai.Aula04.Exercicios.AtendimentoaoPaciente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tipo de paciente (1 - Particular | 2 - Convênio):");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Segmento da consulta: ");
        String tipoConsulta = scanner.nextLine();

        if (tipo == 1) {
            System.out.print("Custo da consulta: R$ ");
            double custo = scanner.nextDouble();
            PacienteParticular p = new PacienteParticular(nome, idade, tipoConsulta, custo);
            System.out.println("\nDados do Paciente");
            p.exibirDados();
        } else if (tipo == 2) {
            System.out.print("Custo da consulta: R$ ");
            double custo = scanner.nextDouble();

            System.out.print("Desconto: R$ ");
            double desconto = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Tipo de convênio: ");
            String tipoConvenio = scanner.nextLine();

            System.out.print("Marca do convênio: ");
            String marca = scanner.nextLine();

            PacienteConvenio p = new PacienteConvenio(nome, idade, tipoConsulta, custo, desconto, tipoConvenio, marca);
            System.out.println("\n=== Dados do Paciente ===");
            p.exibirDados();
        } else {
            throw new IllegalArgumentException("Ação invalida");
        }
        scanner.close();
    }
}
