package Controller;

import Models.Cliente;
import Models.Endereco;
import Models.Mecanico;
import Models.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MecanicoController extends ServiceController{

    public static List<Pessoa> mecanicos = new ArrayList<>();

    public static List<Pessoa> addMecanic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("|----------------------------------------------------------------|");
        System.out.println("|---------------------Cadastro de Mecânico:----------------------|");
        System.out.println("Nome do novo profissonal Mecânico: ");
        String nome = sc.next();
        Mecanico mecanico = (Mecanico) new Pessoa(nome);
        mecanico.toString();
        mecanicos.add(mecanico);
        return mecanicos;
    }
    public static void listMecanic(){
        for(Pessoa mecanico : mecanicos){
            System.out.println(mecanico.toString());
        }
    }

    public static void putMecanic(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do mecânico que deseja alterar?");
        String nome = sc.next();
        for(Pessoa mecanico : mecanicos){
            if(nome.equals(mecanico.getNome())){
                System.out.println(mecanico);
                System.out.println("Digite o novo nome: ");
                mecanico.setNome(sc.next());
                System.out.println("Mecânico alterado de " + nome + " para " + mecanico.getNome());
            } else {
                System.out.println("Mecânico " + nome + " não encontrado");
            }
        }
    }

    public void deleteMecanic(){
        System.out.println("Qual o nome do mecânico que deseja deletar?");
        String nome = sc.next();
        for(Pessoa mecanico : mecanicos){
            if(nome.equals(mecanico.getNome())){
                mecanicos.remove(mecanico);
                System.out.println("Mecânico " +nome+ " deletado!!");
            } else {
                System.out.println("Mecânico " + nome + " não encontrado");
            }
        }
    }


}
