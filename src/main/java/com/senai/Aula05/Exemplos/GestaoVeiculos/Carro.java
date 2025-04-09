package com.senai.Aula05.Exemplos.GestaoVeiculos;

public class Carro extends Veiculo{
    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarManutecao() {
        System.out.println("Manutençao preventiva para o carro." + getModelo());
    }
}
