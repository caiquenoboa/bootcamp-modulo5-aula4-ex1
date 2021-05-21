package com.company;

import java.util.ArrayList;


public class Turma {
    private String serie;
    private String codigo;
    private ArrayList<Estudante> listEstudate;
    private Disciplina disciplina;

    public Turma(String serie, String codigo) {
        this.serie = serie;
        this.codigo = codigo;
        listEstudate = new ArrayList<>();
    }

    public String getSerie(){
        return this.serie;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public void addEstudante(Estudante estudante){
        listEstudate.add(estudante);
    }

    public void printEstudantes(){
        for(Estudante e: listEstudate){
            e.print();
        }
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void printDisciplina(){
        disciplina.print();
    }

    public void print() {
        printDisciplina();
        printEstudantes();
        System.out.println();
    }
}
