package com.senai.Aula04.Exercicios.ControledeEstoque;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Produto> estoque = new ArrayList<>();

    public static void main(String[] args) {
        //Aqui foi pensado para que o utilizador do sistema escrevesse
        //ArrayList para retornar os produtos descritos em uma lista

        while (true) {
            System.out.println("\n Sistema de Controle de Estoque");
            System.out.println("1. Adicionar Alimento");
            System.out.println("2. Adicionar Eletrônico");
            System.out.println("3. Listar Estoque");
            System.out.println("4. Atualizar Estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); //Para ele ir para proxima linha

            //Aqui criei metodos para que o código ficasse mais facil para ler e entender o que cada case fazia.
            switch (opcao) {
                case 1:
                    descreverAlimento();
                    break;

                case 2:
                    descreverEletronico();
                    break;

                case 3:
                    quantidadeEstoque();
                    break;

                case 4:
                    atualizarProduto();
                    break;

                case 5:
                    System.out.println("Saindo do sistema");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inexistente!");
            }
        }
    }

    public static void descreverAlimento() {
        System.out.print("Nome do Alimento: ");
        String nomeAlimento = scanner.nextLine();

        System.out.print("Preço: ");
        double precoAlimento = scanner.nextDouble(); //Caso o usuario coloque o preço com centavos

        System.out.print("Quantidade: ");
        int qtdAlimento = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Data de Validade: ");
        String validade = scanner.nextLine();

        estoque.add(new Alimento(nomeAlimento, precoAlimento, qtdAlimento, validade));
        System.out.println("Alimento adicionado ao estoque!");
    }

    public static void descreverEletronico() {
        System.out.print("Nome do Eletrônico: ");
        String nomeEletronico = scanner.nextLine();
        System.out.print("Preço: ");
        double precoEletronico = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int qtdEletronico = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha
        System.out.print("Voltagem: ");
        String voltagem = scanner.nextLine();

        estoque.add(new Eletronico(nomeEletronico, precoEletronico,qtdEletronico,voltagem));
        System.out.println("Eletrônico adicionado ao estoque!");
    }

    public static boolean quantidadeEstoque() {
        if (estoque.isEmpty()) {
            System.out.println("Não há produtos no estoque atual.");
            return false;
        } else {
            System.out.println("\n Produtos no presente estoque: ");
            for (Produto p : estoque) {
                System.out.println(p + "\n-------------------");
            }
            return true;
        }
    }

    public static void atualizarProduto() {
        System.out.print("Digite o nome do produto para atualizar estoque: ");
        String nomeBusca = scanner.nextLine();
        boolean encontrado = false;

        for (Produto p : estoque) {
            if (p.getNome().equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                System.out.print("Deseja adicionar ou remover estoque? (1 = Adicionar, 2 = Remover): ");
                int escolha = scanner.nextInt();
                System.out.print("Quantidade: ");
                int qtd = scanner.nextInt();

                if (escolha == 1) {
                    p.adicionarEstoque(qtd);
                } else if (escolha == 2) {
                    p.removerEstoque(qtd);
                } else {
                    System.out.println("Opção inválida!");
                }
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado!");
        }
    }
}