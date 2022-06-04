package entities;

public class Endereco {

    private int id;
    private String cidade;
    private String estado;

    public Endereco() {
    }

    public Endereco(int id, String cidade, String estado) {
        this.id = id;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
