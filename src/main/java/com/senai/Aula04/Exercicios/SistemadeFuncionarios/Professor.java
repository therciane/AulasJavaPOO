package com.senai.Aula04.Exercicios.SistemadeFuncionarios;

public class Professor extends Funcionario{
    private String disciplina;


    public Professor(Professor professor) {
        this.disciplina = disciplina;
    }

    public Professor(String nomeProf, double salarioProf, String disciplina) {

    }
    public double salario(double valorAula){
        return valorAula *getSalario();
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void exibirDados(){
        System.out.println("Professor: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Disciplina: " + disciplina);
    }
}
