package br.com.digitalhouse;

public class Aluno {
    //Attributes
    private Integer registroAcademico;
    private String nome;
    private Curso curso;

    //Constructors
    public Aluno(Integer registroAcademico, String nome, Curso curso) {
        this.registroAcademico = registroAcademico;
        this.nome = nome;
        this.curso = curso;
    }

    public Aluno() {
    }

    //Getters & Setters
    public Integer getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(Integer registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    //Overrides
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Aluno)) {
            return false;
        }

        if (((Aluno) obj).getRegistroAcademico() == this.getRegistroAcademico() &&
                ((Aluno) obj).getNome().equals(this.getNome())) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return registroAcademico + this.nome.hashCode();
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "registroAcademico=" + registroAcademico +
                ", nome='" + nome + '\'' +
                ", curso=" + curso.toString() +
                '}';
    }
}
