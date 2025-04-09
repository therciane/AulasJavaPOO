package com.senai.Aula05.Exemplos.GestaoVeiculos;

public class Caminhao extends Veiculo{
    public Caminhao(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarManutecao() {
        System.out.println("Verificação dos freios foi realizada para o caminhão  " + getModelo());
    }
}
