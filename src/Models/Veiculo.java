package Models;
import Interfaces.id;

public class Veiculo implements id{
    private String marca;
    private String modelo;
    private String ano;

    private Integer id;
    private static Integer contador = 0;

    public Veiculo(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.id = contador;
        contador++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
