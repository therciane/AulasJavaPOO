package com.senai.Aula04.Exercicios.AtendimentoaoPaciente;

public class Paciente {
    private String nome;
    private int idade;
    private String segmentoConsulta;

    public Paciente(String nome, int idade, String segmentoConsulta) {
        this.nome = nome;
        this.idade = idade;
        this.segmentoConsulta = segmentoConsulta;
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

    public String getSegmentoConsulta() {
        return segmentoConsulta;
    }

    public void setSegmentoConsulta(String segmentoConsulta) {
        this.segmentoConsulta = segmentoConsulta;
    }

    public void exibirDados(){
        System.out.printf("Os dados do paciente são: %s, idade %d, e o tipo é %s" + nome, idade, segmentoConsulta);
    }
}
