package com.senai.Aula04.Exercicios.AtendimentoaoPaciente;

public class PacienteConvenio extends Paciente {
    private double custoConsulta;
    private double desconto;
    private String tipoConvenio;
    private String marca;

    public PacienteConvenio(String nome, int idade, String segmentoConsulta, double custoConsulta, double desconto, String tipoConvenio, String marca) {
        super(nome, idade, segmentoConsulta);
        this.custoConsulta = custoConsulta;
        this.desconto = desconto;
        this.tipoConvenio = tipoConvenio;
        this.marca = marca;
    }

    public double getCustoConsulta() {
        return custoConsulta;
    }

    public void setCustoConsulta(double custoConsulta) {
        this.custoConsulta = custoConsulta;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = 20;
    }

    public String getTipoConvenio() {
        return tipoConvenio;
    }

    public void setTipoConvenio(String tipoConvenio) {
        this.tipoConvenio = tipoConvenio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double valorFinal(){
        return custoConsulta - desconto;
    }

    @Override
    public void exibirDados() {
        System.out.println("O valor final da consulta ficou: " + valorFinal());
    }
}
