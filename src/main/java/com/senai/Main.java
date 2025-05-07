package com.senai;

import com.senai.Aula07_mvc.crud_usuario.controller.OperadorController;
import com.senai.Aula07_mvc.crud_usuario.controller.SupervisorController;
import com.senai.Aula07_mvc.crud_usuario.model.Operador;
import com.senai.Aula07_mvc.crud_usuario.model.Supervisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadorController opController = new OperadorController();
        SupervisorController supController = new SupervisorController();

        String menu =
                """
                        Opções
                        1- Cadastrar usuario
                        2- Deletar usuario
                        3- Atualizar Usuario
                        4- Exibir usuarios
                        5- Ligar máquina
                        6- Demitir operador
                        7- sair
                       """;

        int opcao = 0;
        do {
            System.out.println("Qual tipo de usuario que você deseja cadastrar?");
            System.out.println("1 - Operador");
            System.out.println("2 - Supervisor");
            int escolhaTipo = scanner.nextInt();
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Preencha os dados a seguir:");

                    int id = scanner.nextInt();
                    scanner.nextLine();
                    String nome = scanner.nextLine();


                    if (escolhaTipo == 1) {
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome, id, setor);

                        if (opController.cadastrarOperador(operador)){
                            System.out.println("Cadastrado com sucesso");
                        }else {
                            System.out.println("Não foi possivel cadastrar");
                        }

                    } else if (escolhaTipo == 2) {
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                        supController.cadastrarSupervisor(supervisor); //(Ainda será criado)

                    }

                    break;

                case 2:
                    if (escolhaTipo == 1) {
                        opController.listarOperadores().forEach(System.out::println);
                    } else if (escolhaTipo == 2)
                        supController.listarSupervisores().forEach(System.out::println);

                    System.out.println("Escolha um usuario para deletar: ");
                    id = scanner.nextInt();

                    if (escolhaTipo == 1) {
                        opController.deletarOperador(id);
                    } else if (escolhaTipo == 2) {
                        supController.deletarSupervisor(id);
                    }

                    break;

                case 3:
                    if (escolhaTipo == 1) {
                        opController.listarOperadores().forEach(System.out::println);
                    } else if (escolhaTipo == 2)
                        supController.listarSupervisores().forEach(System.out::println);
                    System.out.println("Escolha um usuario para atualizar: ");

                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Atualize as seguintes informações: ");
                    System.out.println("Nome: ");

                    nome = scanner.nextLine();

                    if (escolhaTipo == 1) {
                        System.out.println("Setor: ");
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome, id, setor);
                        opController.atualizarOperador(operador);
                    } else if (escolhaTipo == 2)
                        System.out.println("Area: ");
                    String area = scanner.nextLine();
                    Supervisor supervisor = new Supervisor(nome, id, area);
                    supController.atualizarSupervisor(supervisor);


                    System.out.println("Usuario atualizado com sucesso!!!");

                    break;

                case 4:
                    if (escolhaTipo == 1) {
                        opController.listarOperadores().forEach(System.out::println);
                    } else if (escolhaTipo == 2)
                        supController.listarSupervisores().forEach(System.out::println);

                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    System.out.println("Adeus");
                    scanner.close();
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }while (opcao!= 7);
    }
}