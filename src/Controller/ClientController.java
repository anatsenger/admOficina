package Controller;

import Models.Cliente;
import Models.Endereco;
import Models.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientController{
    public static List<Cliente> clientes = new ArrayList<>();

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static void addClient(){
        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        Scanner sc = new Scanner(System.in);
        System.out.println("|----------------------------------------------------------------|");
        System.out.println("|---------------------Cadastro de cliente:-----------------------|");
        System.out.printf("Nome do novo Cliente: ");
        String nome = sc.next();
        System.out.printf("CPF: ");
        String cpf = sc.next();
        sc.nextLine();

        Endereco endereco = addEndereco(sc);

        System.out.printf("Quantos ve�culos o cl�ente possui?");
        int numCarros = sc.nextInt();
        System.out.println("-----Ve�culos: -----");
        for(int i = 0; i < numCarros; i++){
            veiculos.add(addVeiculo(sc, i));
        }

        Cliente cliente = new Cliente(nome, cpf, endereco, veiculos);
        cliente.toString();
        clientes.add(cliente);
    }


    public static Veiculo addVeiculo(Scanner sc, int i){
            int j = i;
            System.out.printf("Marca do ve�culo " + ++j + ":");
            String marca = sc.next();
            System.out.printf("Modelo do ve�culo " + j + ":");
            String modelo = sc.next();
            System.out.printf("Ano do ve�culo " + j + ":");
            String ano = sc.next();
            return new Veiculo(marca, modelo, ano);
    }

    public static Endereco addEndereco(Scanner sc){
        System.out.println("-----Endere�o: -----");
        System.out.printf("Cidade:");
        String cidade = sc.next();
        System.out.printf("Bairro:");
        String bairro = sc.next();
        System.out.printf("Rua:");
        String rua = sc.next();
        System.out.printf("N�mero:");
        String numero = sc.next();
        sc.nextLine();
        return new Endereco(cidade, bairro, rua, numero);
    }


    public static void listByName(String name){
        for(Cliente cliente : clientes) {
            if (name.equals(cliente.getNome())) {
                System.out.println(cliente.getVeiculo().toString());
            }else {
                System.out.println("Cliente n�o cadastrado");
            }
        }
    }

    public static Veiculo putClient(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do cliente que deseja adicionar carro?");
        String nome = sc.next();
        for(Cliente cliente : clientes){
            if(nome.equals(cliente.getNome())){
                System.out.println(cliente);
                System.out.println("Marca do novo ve�culo:");
                String marca = sc.next();
                System.out.println("Modelo do novo ve�culo:");
                String modelo = sc.next();
                System.out.println("Ano do novo ve�culo:");
                String ano = sc.next();
                return new Veiculo(marca, modelo, ano);
            } else {
                System.out.println("Cliente " + nome + " n�o encontrado");
            }
        } return null;
    }

    public void deleteClient(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do cliente que deseja deletar?");
        String nome = sc.next();
        for(Cliente cliente : clientes){
            if(nome.equals(cliente.getNome())){
                clientes.remove(cliente);
                System.out.println("Cliente " +nome+ " deletado!!");
            } else {
                System.out.println("Cliente " + nome + " n�o encontrado");
            }
        }
    }
}
