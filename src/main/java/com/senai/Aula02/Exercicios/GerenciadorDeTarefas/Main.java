package com.senai.Aula02.Exercicios.GerenciadorDeTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n==== GERENCIADOR DE TAREFAS ====");
            System.out.println("1. Adicionar nova tarefa");
            System.out.println("2. Listar todas as tarefas");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Remover uma tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;

                case 2:
                    listarTarefas();
                    break;

                case 3:
                    marcarComoConcluida();
                    break;

                case 4:
                   excluirTarefa();
                    break;

                case 5:
                    System.out.println("Saindo do programa... Até logo!");
                    break;

                default:
                    throw new IllegalArgumentException("Opção invalida");
            }

        } while (opcao != 5);

        scanner.close();
    }

    public static void adicionarTarefa(){
        System.out.print("Digite o nome da tarefa: ");
        String nomeTarefa = scanner.nextLine();
        listaDeTarefas.add(new Tarefa(nomeTarefa));
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public static void listarTarefas(){
        if (listaDeTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            System.out.println("\nLista de tarefas:");
            for (int i = 0; i < listaDeTarefas.size(); i++) {
                System.out.println((i + 1) + ". " + listaDeTarefas.get(i));
            }
        }
    }

    public static void marcarComoConcluida(){
        System.out.print("Digite o número da tarefa a marcar como concluída: ");
        int indiceConcluir = scanner.nextInt() - 1;
        if (indiceConcluir >= 0 && indiceConcluir < listaDeTarefas.size()) {
            listaDeTarefas.get(indiceConcluir).marcarComoConcluida();
            System.out.println("Tarefa marcada como concluída!");
        } else {
            System.out.println("Número de tarefa inválido.");
        }
    }

    public static void excluirTarefa(){
        System.out.print("Digite o número da tarefa a remover: ");
        int indiceRemover = scanner.nextInt() - 1;
        if (indiceRemover >= 0 && indiceRemover < listaDeTarefas.size()) {
            listaDeTarefas.remove(indiceRemover);
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Número de tarefa inválido.");
        }
    }
}
