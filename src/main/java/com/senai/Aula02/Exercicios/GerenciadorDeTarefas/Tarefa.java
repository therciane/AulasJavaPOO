package com.senai.Aula02.Exercicios.GerenciadorDeTarefas;

public class Tarefa {
    private String nomeTarefa;
    private boolean statusTarefa;

    public Tarefa(boolean statusTarefa, String nomeTarefa) {
        this.statusTarefa = statusTarefa;
        this.nomeTarefa = nomeTarefa;
    }

    public Tarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public boolean isStatusTarefa() {
        return statusTarefa;
    }

    public void setStatusTarefa(boolean statusTarefa) {
        this.statusTarefa = statusTarefa;
    }

    public void marcarComoConcluida() {
        this.statusTarefa = true;
    }

    @Override
    public String toString() {
        return nomeTarefa + " - " + (statusTarefa ? "Concluída!!" : "Pendente...");
    }
}
