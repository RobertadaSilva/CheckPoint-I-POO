import entities.Aluno;
import entities.Endereco;
import entities.subclasse.Html;
import entities.subclasse.Java;
import entities.subclasse.Python;

public class Program {

    public static void main(String[] args) {
        Endereco end1 = new Endereco(1, "São Paulo", "SP");
        Aluno al1 = new Aluno(1, "Roberta", "Silva", end1);
        al1.estudar();
        System.out.println(al1);

        Endereco end2 = new Endereco(2, "Moema", "SP");
        Java j1  = new Java(2, "Kevin", "Guzi", end2, "online");
        j1.estudar();
        System.out.println(j1);

        Endereco end3 = new Endereco(3, "Vila Olimpia", "SP");
        Html h1  = new Html(3, "Francisco", "Almeida", end3, "400");
        h1.estudar();
        System.out.println(h1);



        Endereco end4 = new Endereco(4, "Taboão da Serra", "SP");
        Python p1  = new Python(4, "Ademir", "Alves", end4, "sim");
        p1.estudar();
        System.out.println(p1);



    }

}
