package entities.subclasse;

import entities.Aluno;
import entities.Endereco;

public class Python extends Aluno {

    private String finalizou;

    public Python(int id, String nome, String sobrenome, Endereco end, String finalizou) {
        super(id, nome, sobrenome, end);
        this.finalizou = finalizou;
    }
@Override
    public void estudar(){
        System.out.println("O aluno " +getNome() + " " +getSobrenome() + " ainda estuda? " + finalizou);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Python{" +
                "finalizou='" + finalizou + '\'' +
                '}';
    }
}
