package com.senai.Aula07_mvc.crud_usuario.view;

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
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Qual tipo de usuario que você deseja cadastrar?");
                    System.out.println("1 - Operador");
                    System.out.println("2 - Supervisor");
                    int escolhaTipo = scanner.nextInt();
                    System.out.println("Preencha os dados a seguir:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    String nome = scanner.nextLine();


                    if (escolhaTipo == 1){
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome, id, setor);
                        //opController.cadastrarOperador(operador); //(Ainda será criado)

                    } else if (escolhaTipo == 2) {
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                       // opController.cadastrarSupervisor(Supervisor); //(Ainda será criado)

                    }

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                   opController.listarOperadores().forEach(System.out::println);
                  //  supController.listarSupervisores().stream().forEach(System.out::println);

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