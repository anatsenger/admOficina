import Controller.ClientController;
import Controller.MecanicoController;
import Controller.NFController;
import Controller.ServiceController;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        inicializa();
        int opcao = 0;
        while (opcao != 11){
            opcao = getOption();
            cadastro(opcao);
        }

        }

    public static void inicializa(){
        System.out.println("==================================================================");
        System.out.println("|-----------------------DIVINO AUTOCENTER------------------------|");
        System.out.println("|----------------------------------------------------------------|");
        System.out.println("|Op��es de opera��es:                                            |");
        System.out.println("| 1 - Cadastrar novo cliente;                                    |");
        System.out.println("| 2 - Adicionar carro no cadastro de cliente;                    |");
        System.out.println("| 3 - Cadastrar novo mec�nico;                                   |");
        System.out.println("| 4 - Alterar cadastro de mec�nico;                              |");
        System.out.println("| 5 - Iniciar novo servi�o;                                      |");
        System.out.println("| 6 - Finalizar servi�o;                                         |");
        System.out.println("| 7 - Listar Clientes;                                           |");
        System.out.println("| 8 - Listar Mec�nicos;                                          |");
        System.out.println("| 9 - Listar Servi�os;                                           |");
        System.out.println("| 10 - Gerar NF;                                                 |");
        System.out.println("| 11 - Encerrar sistema;                                         |");

    }
     public static int getOption(){
         System.out.println("|-------------DIGITE OP��O DO QUE DESEJA REALIZAR:---------------|");
         return sc.nextInt();
     }

     public static void cadastro(int opcao){
        switch (opcao){
            case 1:
                ClientController.addClient();
                break;
            case 2:
                ClientController.putClient();
                break;
            case 3:
                MecanicoController.addMecanic();
                break;
            case 4:
                MecanicoController.putMecanic();
                break;
            case 5:
                ServiceController.addService();
                break;
            case 6:
                ServiceController.finalizarServico();
                break;
            case 7:
                ClientController.getClientes().toString();
                break;
            case 8:
                MecanicoController.listMecanic();
                break;
            case 9:
                ServiceController.listService();
                break;
            case 10:
                NFController.getNF();
                break;
            case 11:
                System.out.println("----------------------Encerrando Sistema--------------------------");
                System.out.println("==================================================================");
                break;
            default:
                System.out.println("n�o entendi, tente novamente uma op��o v�lida(apenas numeros s�o aceitos)");

        }
     }

}