package com.company;

public class Main {

    public static void main(String[] args) {

        Turma t1 = new Turma("9 ano", "A");
        Turma t2 = new Turma("8 ano", "C");

        t1.addEstudante(new Estudante("João", 15, 123, "9 ano"));
        t1.addEstudante(new Estudante("Gabriel", 14, 182, "9 ano"));
        t1.addEstudante(new Estudante("Caique", 15, 135, "9 ano"));
        t1.addEstudante(new Estudante("Paulo", 14, 192, "9 ano"));
        t1.addEstudante(new Estudante("Israel", 15, 112, "9 ano"));
        t1.setDisciplina(new Disciplina("Java 1", 60));

        t2.addEstudante(new Estudante("Oãoj", 13, 221, "8 ano"));
        t2.addEstudante(new Estudante("Leirbag", 14, 231, "8 ano"));
        t2.addEstudante(new Estudante("Euqiac", 15, 241, "8 ano"));
        t2.addEstudante(new Estudante("Oluap", 13, 251, "8 ano"));
        t2.addEstudante(new Estudante("Learsi", 13, 261, "8 ano"));
        t2.setDisciplina(new Disciplina("Fundamentos de Programação", 90));


        t1.print();
        t2.print();

    }
}
