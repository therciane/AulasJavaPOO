package com.senai.Aula03.Exercicios.ContaBancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;

    //Construtor  da conta bancaria.
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //Criação da conta com ultilização do if/else
    public void ContaBancaria(String titular, double saldo){
        this.titular = titular;
        if(saldo>=0){
            this.saldo = saldo;
        }else{
            System.out.println("O saldo não pode iniciar negativo, o saldo atribuido neste caso é 0,0.");
        }
    }

    //Metodo sacar. Aqui para ter menos linha e possuir um codigo mais "limpo/sem repetições" fizemos um metodo "Mensagem de sucessi"
    public boolean sacar(double valor){
        if(valor>0 && valor <=saldo){
            saldo -= valor;
            mensagemSucesso("Saque",this);
            return true;
        }else{
            System.out.println("O saque não pode ser concluido! para saber mais ligue 0800");
            return false;
        }
    }

    //ultilização de boolean para confirmação da ação.
    public boolean depositar(double valor){
        if(valor>=0){
            mensagemSucesso("Depositar",this);
            saldo+=valor;
            return true;
        }else{
            System.out.println("Operção invalida o valor tem que ser maior que 0,0.");
            return false;
        }
    }

    //criação de mensagem de sucesso, feito para evitar repetições de palavras.
    public static void mensagemSucesso(String operacao, ContaBancaria minhaConta){
        System.out.println("Ação realizada na conta do: " + minhaConta.titular + "Realizado com sucesso");
        System.out.println("Saldo restante: " + minhaConta.saldo);
    }

    //metodo transferir para outra conta.
    public void transferir(double valor, ContaBancaria contadestino){
        if(this.sacar(valor));
        contadestino.depositar(valor);
        System.out.println("Trasferencia com sucesso!" + "O saldo restante é: " + saldo);
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
