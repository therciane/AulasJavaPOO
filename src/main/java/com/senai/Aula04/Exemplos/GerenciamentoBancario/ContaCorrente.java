package com.senai.Aula04.Exemplos.GerenciamentoBancario;

public class ContaCorrente extends ContaBancaria {
    private double limite; //Encapsulamento do dado

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    //Aqui usei o boolean para ter um retorno sincero.
    public boolean sacar(double valor){
        if (valor>0 && (valor<= saldo + limite)){
            saldo -= valor;
            mensagemSucesso("saque", this);
            return true;
        }else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    //Usando a herança da classe pai, no caso de mostrar as informações.
    @Override
    public void exibirSaldo() {
        System.out.printf("\n Nome do titular: %s, saldo: R$%,.2f, limite disponivel de  R$%,.2f:", getTitular(), saldo, limite);
    }
}
