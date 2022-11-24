package Models;

import Enums.Servicos;
import Interfaces.id;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class Servico implements id{

    private Cliente cliente;
    private List<Integer> tipo;

    public List<Servicos> listServico;
    private Veiculo veiculo;
    private Mecanico mecanico;
    private LocalDateTime data;
    private Double preco;
    private boolean finalizado = false;

    private Integer id;
    private static Integer contador = 0;

    Locale brasil = new Locale("pt", "BR");

    public Servico(Cliente cliente, List<Servicos> listServico, Veiculo veiculo, Mecanico mecanico, Double preco) {
        this.listServico = listServico;
        this.veiculo = veiculo;
        this.mecanico = mecanico;
        this.cliente = cliente;
        this.preco = preco;
        this.data = LocalDateTime.parse(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy", brasil)));
        this.id = contador;
        contador++;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Integer> getTipo() {
        return tipo;
    }

    public void setTipo(List<Integer> tipo) {
        this.tipo = tipo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getId() {return id;}

    public boolean isFinalizado() {
        return finalizado;
    }

    public LocalDateTime getData() {
        return data;
    }

    public List<Servicos> getListServico() {
        return listServico;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public static Servicos servicoTipo(int opcao) {
            switch (opcao){
                case 1: return Servicos.REVIASAO_COMPLETA;
                case 2: return Servicos.TROCA_DE_OLEO;
                case 3: return Servicos.TROCA_DE_EMBREAGEM;
                case 4: return Servicos.TROCA_DE_PASTILHA_DE_FREIO;
                case 5: return Servicos.TROCA_DE_AMORTECIMENTO;
                case 6: return Servicos.HIGIENIZACAO_AR_CONDICIONADO;
                case 7: return Servicos.TROCA_DE_VELA;
                case 8: return Servicos.LIMPEZA_DO_TBI;
                case 9: return Servicos.SAGRIA_DO_OLEO_DE_FREIO;
                case 10: return Servicos.TROCA_DE_DISCO_DE_FREIO;
                case 11: return Servicos.TROCA_DE_TENSOR;
                case 12: return Servicos.TROCA_DE_CORREIA_DENTADA;
                default: return Servicos.ATENDIMENTO_RÁPIDO;
            }
    }

    @Override
    public String toString() {
        return "Servico{" +
                "cliente=" + cliente +
                ", tipo=" + tipo +
                ", listServico=" + listServico +
                ", veiculo=" + veiculo +
                ", mecanico=" + mecanico +
                ", data=" + data +
                ", preco=" + preco +
                ", finalizado=" + finalizado +
                ", id='" + id + '\'' +
                '}';
    }
}











