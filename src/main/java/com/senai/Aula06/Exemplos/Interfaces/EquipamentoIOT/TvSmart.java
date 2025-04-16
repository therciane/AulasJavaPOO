package com.senai.Aula06.Exemplos.Interfaces.EquipamentoIOT;

public class TvSmart implements AparelhoInteligente{
    private int volume;

    public TvSmart() {
        this.volume = volume;
    }


    @Override
    public void ligar() {
        System.out.println("Tv ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Tv desligada");
    }

    public void aumentarVolume(){
        System.out.printf("\n brilho:  %d", volume = ajusteNivel(volume,1));
    }

    public void baixarVolume(){
        System.out.printf("\n brilho:  %d", volume = ajusteNivel(volume,-1));

    }
}
