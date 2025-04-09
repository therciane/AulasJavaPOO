package com.senai.Aula06.Exemplos.ClasseAbstrata.GerenciamentoFuncionarios;

public class Main {
    public static void main(String[] args) {
        pagarFuncionariod(new FuncionarioEfetivo(
                "Therciane",
                5000,
                15));
        pagarFuncionariod(new FuncionarioTemporario(
                "Feliz",
                3500,
                3,
                50));
    }

    public static void pagarFuncionariod(Funcionario funcionario){
        System.out.println("\n PAGAMENTO FUNCIONARO " + funcionario.nome);
        funcionario.exibirDados();
        funcionario.aumentarSalario(60);
        funcionario.exibirDados();
        funcionario.calcularBonus();
        funcionario.exibirDados();
    }
}
