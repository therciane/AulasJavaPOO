package com.senai.Aula04.Exercicios.AtendimentoaoPaciente;

public class PacienteParticular extends Paciente {
    private double custoConsulta;

    public PacienteParticular(String nome, int idade, String segmentoConsulta, double custoConsulta) {
        super(nome, idade, segmentoConsulta);
        this.custoConsulta = custoConsulta;
    }

    public double getCustoConsulta() {
        return custoConsulta;
    }

    public void setCustoConsulta(double custoConsulta) {
        this.custoConsulta = custoConsulta;
    }

    @Override
    public void exibirDados() {
        System.out.println("O custo da consulta foi de: " + custoConsulta);
    }
}
