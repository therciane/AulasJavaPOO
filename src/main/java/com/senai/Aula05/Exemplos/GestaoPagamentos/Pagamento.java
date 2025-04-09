package com.senai.Aula05.Exemplos.GestaoPagamentos;

public class Pagamento {
    private String nome;

    public Pagamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double CalcularPagamento(){
        return 0.0;
    }
}
