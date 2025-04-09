package com.senai.Aula06.Exemplos.ClasseAbstrata.ContaBancaria;

abstract class ContaBancaria {
    private String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    abstract void aplicarTaxaMensal();

//Das partes acima não houve mudanças comparados as aulas anteriores

    //Neste metódo, fizemos o mesmo esquema do exemplo anterior para economizar repetições de palavras.
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

    public static void mensagemSucesso(String operacao, ContaBancaria minhaConta){
        System.out.println("Ação realizada na conta do: " + minhaConta.titular + "Realizado com sucesso");
        System.out.println("Saldo restante: " + minhaConta.saldo);
    }

    //metodo para mostrar as informações do usuario.
    public void exibirSaldo(){
        System.out.printf("\n Nome do titular: %s, saldo: R$%,.2f", titular, saldo);
    }
}
