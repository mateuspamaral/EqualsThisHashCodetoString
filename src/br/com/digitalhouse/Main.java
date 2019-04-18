package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Cursos*/
        Curso cursoAndroid = new Curso("Curso Mobile Android");
        Curso cursoFullStack = new Curso("Curso FullStack");

        /*Alunos*/
        Aluno mateus = new Aluno(32, "Mateus", cursoAndroid);
        Aluno eu = new Aluno(32, "Mateus", cursoAndroid);
        Aluno carolina = new Aluno(30, "Carolina", cursoFullStack);
        Aluno fred = new Aluno(29, "Frederico", cursoFullStack);
        Aluno tutt = new Aluno(18, "Tutt", cursoAndroid);

        /*Lista de alunos*/
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(mateus);
        alunos.add(eu);
        alunos.add(carolina);
        alunos.add(fred);
        alunos.add(tutt);

        System.out.println(mateus.equals(carolina)); //false
        System.out.println(mateus.equals(eu)); //true
        System.out.println(alunos.contains(eu)); //true pq o equal para o objeto aluno foi alterado
        System.out.println(mateus.toString());
        System.out.println(alunos);


    }
}
