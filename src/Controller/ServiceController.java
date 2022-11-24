package Controller;

import Enums.Servicos;
import Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceController extends ClientController{
    Scanner sc = new Scanner(System.in);
    static Cliente clientService;
    static List<Servico> servicosList = new ArrayList<>();

    static Veiculo veiculoService;

    public static List<Servico> addService() {
        Scanner sc = new Scanner(System.in);
        System.out.println("|----------------------------------------------------------------|");
        System.out.println("|------------------------ Novo serviço: -------------------------|");
        System.out.println("Nome do cliente para qual será realizado o serviço:");
        String nome = sc.next();
        for (Cliente cliente : clientes) {
            if (nome.equals(cliente.getNome())) {
                clientService = cliente;
            }
        }
        System.out.println("|---------------- LISTA DOS SERVIÇOS QUE PRESTAMOS --------------|");
        System.out.println(" 1 - Revisão Completa;");
        System.out.println(" 2 - Troca de óleo;");
        System.out.println(" 3 - Troca de Embreagem;");
        System.out.println(" 4 - Troca de pastilha de freio;");
        System.out.println(" 5 - Troca de amortecedor;");
        System.out.println(" 6 - Troca de ar condicionado;");
        System.out.println(" 7 - Troca de vela;");
        System.out.println(" 8 - Limpeza do TBI;");
        System.out.println(" 9 - Sangria do óleo de freio;");
        System.out.println(" 10 - Troca de disco de freio;");
        System.out.println(" 11 - Troca de tensor;");
        System.out.println(" 12 - Troca de correia dentada;");
        System.out.println("|----------------------------------------------------------------|");

        System.out.println("Qual serviço deseja realizar no carro?");
        int tipoServicos = sc.nextInt();
        List<Servicos> servicosEnum = new ArrayList<>();
        servicosEnum.add(Servico.servicoTipo(tipoServicos));


        System.out.println("--------Carros do cliente " + nome + ": ---------");
        clientService.getVeiculo();
        System.out.println("Qual o id co carro que os serviços serão realizados: ");
        String id = sc.next();
        for (Veiculo veiculo : clientService.getVeiculo()) {
            if (id.equals(veiculo.getId())) {
                veiculoService = veiculo;
            }
        }

        System.out.println("Qual mecânico ficará responsavel pelo serviço? ");
        String mecanicoNome = sc.next();
        Pessoa mecanicoService = null;
        for (Pessoa mecanico : MecanicoController.mecanicos) {
            if (mecanicoNome.equals(mecanico.getNome())){
                 mecanicoService = mecanico;
            }
        }

        Double preco = calculaPreco(servicosEnum);


        servicosList.add(new Servico(clientService, servicosEnum, veiculoService, (Mecanico) mecanicoService, preco));
        return servicosList;
        }


        public static Double calculaPreco(List<Servicos> servicos) {
            Double preco = 0d;
            for (Servicos servico : servicos) {
                switch (servico) {
                    case REVIASAO_COMPLETA:
                        preco += 500d;
                        break;
                    case TROCA_DE_OLEO:
                        preco += 50d;
                        break;
                    case TROCA_DE_EMBREAGEM:
                        preco += 200d;
                        break;
                    case TROCA_DE_PASTILHA_DE_FREIO:
                        preco += 80d;
                        break;
                    case TROCA_DE_AMORTECIMENTO:
                        preco += 200d;
                        break;
                    case HIGIENIZACAO_AR_CONDICIONADO:
                        preco += 80d;
                        break;
                    case TROCA_DE_VELA:
                        preco += 120d;
                        break;
                    case LIMPEZA_DO_TBI:
                        preco += 50d;
                        break;
                    case SAGRIA_DO_OLEO_DE_FREIO:
                        preco += 60d;
                        break;
                    case TROCA_DE_DISCO_DE_FREIO:
                        preco += 80d;
                        break;
                    case TROCA_DE_TENSOR:
                        preco += 150d;
                        break;
                    case TROCA_DE_CORREIA_DENTADA:
                        preco += 200d;
                        break;
                    case ATENDIMENTO_RÁPIDO:
                        preco += 50d;
                }
            }
            return preco;
        }

    public static void finalizarServico(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o id do serviço que deseja alterar?");
        String id = sc.next();
        for(Servico servico : servicosList){
            if(id.equals(servico.getId())){
                System.out.println(servico);
                servico.setFinalizado(true);
                System.out.println("Serviço finalizado com sucesso");
            } else {
                System.out.println("Serviço " + id + " não encontrado");
            }
        }
    }

    public static void listService(){
        for(Servico servico : servicosList){
            System.out.println(servico);
        }
    }


    }
