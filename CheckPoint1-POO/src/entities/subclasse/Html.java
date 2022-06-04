package entities.subclasse;

import entities.Aluno;
import entities.Endereco;

public class Html extends Aluno {
    private int horasestudo;

    public Html(int id, String nome, String sobrenome, Endereco end, String horasestudo) {
        super(id, nome, sobrenome, end);
        this.horasestudo = Integer.parseInt(horasestudo);
    }

    @Override
    public void estudar(){
        System.out.println("O aluno " +getNome() + " " +getSobrenome() + " estuda " + horasestudo + " horas no curso de HTML");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Html{" +
                "horasestudo=" + horasestudo +
                '}';
    }
}
