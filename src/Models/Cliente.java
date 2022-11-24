package Models;

import java.util.List;

public class Cliente extends Pessoa{
    private String nome;
    private String CPF;
    private Endereco endereco;
    private List<Veiculo> veiculo;

    //pagamentos


    public Cliente(String nome, String CPF, Endereco endereco, List<Veiculo> veiculo) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Veiculo> getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(List<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", endereco=" + endereco +
                ", veiculo=" + veiculo +
                '}';
    }
}


