package com.company;

public class Estudante {
    private String name;
    private int idade;
    private int numero_matricula;
    private String serie;

    public Estudante(String name, int idade, int numero_matricula, String serie){
        this.name = name;
        this.idade = idade;
        this.numero_matricula = numero_matricula;
        this.serie = serie;
    }

    public String getName() {
        return name;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public int getNumero_matricula() {
        return numero_matricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void print(){
        System.out.println("Nome: " + name + " - idade: " + idade + " - RA: " + numero_matricula + " - serie: " + serie);
    }
}
