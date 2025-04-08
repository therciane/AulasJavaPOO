package com.senai.Aula04.Exercicios.SistemadeFuncionarios;

import java.util.ArrayList;

public class Coodernador extends Funcionario{
    private ArrayList<Professor> professores;

    public Coodernador(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public Coodernador(String nomeCoord, double salarioCoord) {
    }


    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
        System.out.println("✅ Professor " + professor.getNome() + " adicionado ao coordenador " + getNome());
    }

    @Override
    public void exibirDados(){
        System.out.println("Coordenador: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Professores:");
    }
}
