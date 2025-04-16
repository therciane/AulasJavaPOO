package com.senai.Aula06.Exemplos.Interfaces.EquipamentoIOT;

public interface AparelhoInteligente {
    int NIVEL_MAXIMO = 100;

    void ligar();
    void desligar();

    default int ajusteNivel(int nivelAtual, int nivelAjuste){
        if (validarNivel(nivelAtual,nivelAjuste)){
            return nivelAtual + nivelAjuste;
        }else{
            return nivelAtual;
        }
    }

    private boolean validarNivel(int nivelAtual, int nivelAjuste){
        return nivelAtual <=0 && nivelAtual >= NIVEL_MAXIMO && (nivelAtual + nivelAjuste) != -1 && (nivelAtual + nivelAjuste) != 100;
    }

    static void mensagemBoasVindas(){
        System.out.println("Bem vindo ao controle remoto inteligente");
    }
}
