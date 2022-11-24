package Models;

public class Endereco {
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;

    public Endereco(String cidade, String bairro, String rua, String numero) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
