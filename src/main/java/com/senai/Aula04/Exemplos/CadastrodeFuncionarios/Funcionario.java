package com.senai.Aula04.Exemplos.CadastrodeFuncionarios;

public class Funcionario {
    private String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirdados(){
        System.out.printf("\n Nome: %s, salario: R$%,.2f", nome, salario);
        //Ultilização do printf, onde podemos deixar a mensagem de exibição mais "organizada".
    }
}
