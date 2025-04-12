package com.senai.Aula05.Exercicios.GestaoBeneficiosFuncionarios;

import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
      // Criando lista de benefícios
      ArrayList<Beneficio> beneficios = new ArrayList<>();

      // Criando objetos diretamente
      Beneficio funcionario1 = new ValeAlimentacao(
              "Therciane Vasconcelos",
              "Analista de Dados",
              18,
              7.800,
              1.500);
      Beneficio funcionario2 = new PlanoSaude(
              "Chris",
              "Produtor",
              27,
              6.700,
              "Metrus Saúde");

      Beneficio funcionario3 = new ValeTransporte(
              "Felix Lee",
              "Administrador",
              25,
              4.500,
              "Rua Nova Deli 8",
              4.5);

      funcionario1.calcularDesconto(7800);
      funcionario2.calcularDesconto(6700);
      funcionario3.calcularDesconto(4500);
      funcionario1.mostrarInformacoes();
      funcionario2.mostrarInformacoes();
      funcionario3.mostrarInformacoes();

      // Adicionando na lista
      beneficios.add(funcionario1);
      beneficios.add(funcionario2);
      beneficios.add(funcionario3);

      // Simulando listagem
   }
}
