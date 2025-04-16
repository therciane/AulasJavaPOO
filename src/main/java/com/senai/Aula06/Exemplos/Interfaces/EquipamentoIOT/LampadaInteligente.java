package com.senai.Aula06.Exemplos.Interfaces.EquipamentoIOT;

public class LampadaInteligente implements AparelhoInteligente {
    private int brilho;

    public LampadaInteligente() {
        this.brilho = brilho;
    }

    @Override
    public void ligar() {
        System.out.println("Lamapada ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Lamapada desligada");

    }

    public void aumentarBrilho(){
        System.out.printf("\n brilho:  %d", brilho = ajusteNivel(brilho,1));
    }

    public void baixarBrilho(){
        System.out.printf("\n brilho:  %d", brilho = ajusteNivel(brilho,-1));
    }
}
