package com.senai.Aula05.Exemplos.GestaoPagamentos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagamento> listaPagamentos = new ArrayList<>();

        listaPagamentos.add(new CLT("Therciane", 7000.5));
        listaPagamentos.add(new PJ("Lucas", 4.3, 2.5));
        listaPagamentos.add(new Freelancer("Maria", 4000));

        /* Expressão "Lambda" */
        listaPagamentos.forEach(pagamento -> {
            System.out.printf("%s recebe R$%,.2f \n"
                    , pagamento.getNome(), pagamento.CalcularPagamento()
            );
        });
    }
}
