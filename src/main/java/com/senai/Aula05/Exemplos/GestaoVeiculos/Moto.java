package com.senai.Aula05.Exemplos.GestaoVeiculos;

public class Moto extends Veiculo{
    public Moto(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarManutecao() {
        System.out.println("Troca de oleo realizada para a moto" + getModelo());
    }
}

