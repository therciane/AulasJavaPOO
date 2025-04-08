package com.senai.Aula01.Exemplos.Pessoa;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Pessoa pessoa1 = new Pessoa(
                    "Chris",
                    18);

//Colocamos o scanner apenas aqui.

            Scanner scanner = new Scanner(System.in);
            String cabecalho [] = {"Nome", "idade", "Altura","Endereço\n\t Rua","\t numero", "\t bairro",
                    "\t Cidade", "\t Estado"};
            String dados [] = new String[8];

            System.out.println("Preencha os dados a seguir:");
            for (int i = 0; i < cabecalho.length ; i++) {
                System.out.print(cabecalho[i]);
                dados[i] = scanner.nextLine();
            }
//new = construtor
            Endereço endereco = new Endereço();

            System.out.println(endereco);

            Pessoa pessoa2 = new Pessoa(
                    dados[0],
                    Integer.parseInt(dados[1]),
                    Float.parseFloat(dados[2]));
            System.out.println(pessoa2);

            pessoa1.comer("Pizza de peperoni");
            pessoa2.comer("Salada de brocolis");
        }
    }
