package com.senai.Aula01.Exemplos.Concessionaria;

public class Carro {
        String modelo;
        String marca;
        String cor;
        int anoDeFabricacao;
        double valorInicial;

        //Construtor, onde "criamos o objeto"
    public Carro(String modelo, String marca, String cor, int anoDeFabricacao, double valorInicial) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.anoDeFabricacao = anoDeFabricacao;
        this.valorInicial = valorInicial;
    }

    //classe onde damos "vida" ao objeto, mostrando suas habilidades
        public void testeDriver(){
            System.out.println("*barulhodecarro*" + modelo + "Funcionou");

        }

        public void comprar(String nomeCliente){
            System.out.println("Parabéns " + nomeCliente + "adquireste um" + modelo );
        }

        public void valorTabelaFipe(int ano){
            double valorFinal = valorInicial;
            int idade = anoDeFabricacao - ano;

            for (int i = 0; i < idade; i++) {
                valorFinal -= valorFinal*0.02;
            }
            System.out.println(modelo + "A desvalorização do ano de lançamento pro ano atual foi: " + String.format("0.2%f",valorFinal));
        }
        //metodo toStrind, onde ainda não sei o que faz, porém entendi que no Programação Orientado Objeto, tem que ter.

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", anoDeFabricacao=" + anoDeFabricacao +
                ", valorInicial=" + valorInicial +
                '}';
    }
}