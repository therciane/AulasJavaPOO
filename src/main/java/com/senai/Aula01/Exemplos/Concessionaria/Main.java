package com.senai.Aula01.Exemplos.Concessionaria;

public class Main {
    public static void main(String[] args) {
        //Aqui montamos o objeto com suas caracteriscas principais
        Carro carro = new Carro(
                "Daytona SP3",
                "Ferrari",
                "Rosa",
                2021,
                2.200000); //Dois milhôes e duzentos


        Carro carro1 = new Carro(
                "Yangwang U9",
                "BYD",
                "Vemelho",
                2023,
                1.100000);

//Mostramos o objeto
        System.out.println(carro);
        System.out.println(carro1);

        //Chamamos a classe para poder rodar direitinho
        carro.testeDriver();
        carro.comprar("Therciane");
        carro.valorTabelaFipe(2025);
        carro1.testeDriver();
        carro1.comprar("Therciane");
        carro1.valorTabelaFipe(2025);
    }
}
