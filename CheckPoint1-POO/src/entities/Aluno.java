package entities;

import java.sql.SQLOutput;

public class Aluno {


    private int id;
    private String nome;
    private String sobrenome;
    private Endereco end;

    public Aluno() {
    }

    public Aluno(int id, String nome, String sobrenome, Endereco end) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.end = end;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    //MÉTODO ESTUDAR
    public void estudar(){
        System.out.println("Aluna " + getNome() + " " +getSobrenome()+ " está estudando");
    }

    @Override
    public String toString() {
        return "Aluno {" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", end=" + end +
                '}';
    }
}
