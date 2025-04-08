package com.senai.Aula04.Exercicios.AtendimentoaoPaciente;

public class Paciente {
    private String nome;
    private int idade;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirInformacoes(){
        System.out.printf("\n Nome do Paciente: %s, \n Idade do Paciente: ", nome, idade);
    }
}
