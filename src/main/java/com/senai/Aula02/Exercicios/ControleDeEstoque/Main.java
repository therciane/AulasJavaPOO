package com.senai.Aula02.Exercicios.ControleDeEstoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Produtos> estoque = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Atualizar quantidade");
            System.out.println("4. Remover produto");
            System.out.println("5. Buscar produto");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;

                case 2:
                    listarProdutos();
                    break;

                case 3:
                    atualizarQuantidade();
                    break;

                case 4:
                    removerProduto();
                    break;

                case 5:
                    buscarProduto();
                    break;

                case 6:
                    System.out.println("Saindo!! até mais!!");
                    break;

                default:
                    throw new IllegalArgumentException("Opção inexistente!");
            }
        } while (opcao != 6);
    }

    private static void cadastrarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        estoque.add(new Produtos(nome, quantidade));
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void listarProdutos() {
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            for (Produtos p : estoque) {
                System.out.println(p);
            }
        }
    }

    private static void atualizarQuantidade() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        for (Produtos p : estoque) {
            if (p.getNomeProduto().equalsIgnoreCase(nome)) {
                System.out.print("Nova quantidade: ");
                int novaQuantidade = scanner.nextInt();
                scanner.nextLine();
                p.setQtdProduto(novaQuantidade);
                System.out.println("Quantidade atualizada.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    private static void removerProduto() {
        System.out.print("Nome do produto a remover: ");
        String nome = scanner.nextLine();

        for (Produtos p : estoque) {
            if (p.getNomeProduto().equalsIgnoreCase(nome)) {
                estoque.remove(p);
                System.out.println("Produto removido.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    private static void buscarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        for (Produtos p : estoque) {
            if (p.getNomeProduto().equalsIgnoreCase(nome)) {
                System.out.println(p);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
}
