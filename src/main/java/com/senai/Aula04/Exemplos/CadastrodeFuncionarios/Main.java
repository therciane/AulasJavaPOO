package com.senai.Aula04.Exemplos.CadastrodeFuncionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Therciane", 50000.8);
        Gerente gerente = new Gerente("Felix",  4500, 780);

        gerente.exibirdados();
        funcionario.exibirdados();
    }
}
