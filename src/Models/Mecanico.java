package Models;

public class Mecanico extends Pessoa{
    private String nome;
    //salario

    public Mecanico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}