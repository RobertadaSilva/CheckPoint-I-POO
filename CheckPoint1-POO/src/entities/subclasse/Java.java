package entities.subclasse;

import entities.Aluno;
import entities.Endereco;

public class Java  extends Aluno {

    private String formatestudo;

    public Java(int id, String nome, String sobrenome, Endereco end, String formatestudo) {
        super(id, nome, sobrenome, end);
        this.formatestudo = formatestudo;
    }
    @Override
    public void estudar(){
        System.out.println("O aluno " + getNome() + " " + getSobrenome() + " está estudando de forma " + formatestudo);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Java{" +
                "formatestudo='" + formatestudo + '\'' +
                '}';
    }
}
