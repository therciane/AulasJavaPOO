package com.senai.Aula02.Exemplos.Carro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Carro> listaCarro = new ArrayList<>();

        System.out.println("Quantos carros voce deseja inserir no sistema?");

        int qtdCarro = scanner.nextInt();
        scanner.nextLine();
        System.out.println("preencha as informações a seguir:");

        for (int i = 0; i <qtdCarro ; i++) {
            System.out.println("\n carro" +(i+1) +"\n");
            System.out.println("Modelo");
            String modelo = scanner.nextLine();
            System.out.println("marca");
            String marca = scanner.nextLine();
            System.out.println("cor");
            String cor = scanner.nextLine();
            System.out.println("Ano");
            int ano = scanner.nextInt();
            scanner.nextLine();
            System.out.println("valorInicial");
            double valorInicial = scanner.nextDouble();
            scanner.nextLine();

            listaCarro.add(new Carro(modelo,marca,cor,ano,valorInicial));

        }
        listaCarro.forEach(System.out::println);
    }
}
