package com.senai.Aula04.Exercicios.SistemadeFuncionarios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Sistema de Gestão Escolar ===");
            System.out.println("1. Adicionar Professor");
            System.out.println("2. Adicionar Coordenador");
            System.out.println("3. Listar Funcionários");
            System.out.println("4. Adicionar Professor a um Coordenador");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarProfessor();
                    break;

                case 2:
                    adicionarCoodernador();
                    break;

                case 3:
                    listarFuncionarios();
                    break;

                case 4:
                    promoverProfessor();
                    break;

                case 5:
                    System.out.println("Saindo do sistema... ");
                    scanner.close();
                    return;

                default:
                    throw new IllegalArgumentException("Opção inexistente");
            }
        }
    }

    public static void adicionarProfessor(){
        System.out.print("Nome do Professor: ");
        String nomeProf = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioProf = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Disciplina: ");
        String disciplina = scanner.nextLine();

       funcionarios.add(new Professor(nomeProf, salarioProf, disciplina));
        System.out.println("Professor cadastrado com sucesso!");
    }

    public static void adicionarCoodernador(){
        System.out.print("Nome do Coordenador: ");
        String nomeCoord = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioCoord = scanner.nextDouble();

        funcionarios.add(new Coodernador(nomeCoord,salarioCoord));
        System.out.println("Coordenador cadastrado com sucesso!");
    }

    public static void listarFuncionarios(){
        if (funcionarios.isEmpty()) {
            System.out.println(" Nenhum funcionário cadastrado!");
        } else {
            System.out.println("\n=== Lista de Funcionários ===");
            for (Funcionario f : funcionarios) {
                f.exibirDados();
                System.out.println("-------------------");
            }
        }
    }

    public static boolean promoverProfessor(){
        System.out.print("Nome do Coordenador: ");
        String nomeCoordenador = scanner.nextLine();
        Coodernador coordenador = null;

        for (Funcionario f : funcionarios) {
            if (f instanceof Coodernador && f.getNome().equalsIgnoreCase(nomeCoordenador)) {
                coordenador = (Coodernador) f;
                break;
            }
            return true;
        }

        if (coordenador == null) {
            System.out.println("Coordenador não encontrado!");
        }

        System.out.print("Nome do Professor a adicionar: ");
        String nomeProfessor = scanner.nextLine();
        Professor professor = null;

        for (Funcionario f : funcionarios) {
            if (f instanceof Professor && f.getNome().equalsIgnoreCase(nomeProfessor)) {
                professor = (Professor) f;
                break;
            }
            return true;
        }

        if (professor == null){
            System.out.println("Professor não encontrado");
        }else{
            System.out.println("Digite novamente:");
        }
        return false;
    }
}
