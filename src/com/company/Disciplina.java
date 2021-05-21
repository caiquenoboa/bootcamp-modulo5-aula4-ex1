package com.company;

public class Disciplina {
    private String name;
    private int carga_horaria;

    public Disciplina(String name, int carga_horaria){
        this.name = name;
        this.carga_horaria = carga_horaria;
    }

    public void print(){
        System.out.println("Disciplina: " + name + " - Carga horária: " + carga_horaria);
    }
}
