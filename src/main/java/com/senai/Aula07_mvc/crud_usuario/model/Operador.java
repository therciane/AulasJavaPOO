package com.senai.Aula07_mvc.crud_usuario.model;

public  class Operador extends Usuario{
    private String setor;

    public Operador(String nome, int id, String setor) {
        super(nome, id);
        this.setor = setor;
    }
}
// criação de 2 tabelas. Para eviar um null (É sempre bom evitar null).

