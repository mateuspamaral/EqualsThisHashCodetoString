package br.com.digitalhouse;

public class Curso {
    //Attributes
    private String nome;

    //Constructors
    public Curso(String nome) {
        this.nome = nome;
    }

    public Curso() {
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Overrides
    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
