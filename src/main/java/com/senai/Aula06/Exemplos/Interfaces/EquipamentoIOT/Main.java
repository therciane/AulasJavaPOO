package com.senai.Aula06.Exemplos.Interfaces.EquipamentoIOT;

public class Main {
    public static void main(String[] args) {
        testarAparelhos(new TvSmart());
        testarAparelhos(new LampadaInteligente());
    }

    public static void testarAparelhos(AparelhoInteligente aparelhoInteligente){
        System.out.printf("Teste %s\n ", aparelhoInteligente.getClass().getSimpleName());
        aparelhoInteligente.ligar();
        if(aparelhoInteligente instanceof LampadaInteligente lampadaInteligente){
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.baixarBrilho();
            lampadaInteligente.baixarBrilho();
            lampadaInteligente.baixarBrilho();
        }else if (aparelhoInteligente instanceof TvSmart tvSmart){
            tvSmart.aumentarVolume();
            tvSmart.aumentarVolume();
            tvSmart.baixarVolume();
            tvSmart.baixarVolume();
            tvSmart.baixarVolume();
        }
        aparelhoInteligente.desligar();
    }
}
