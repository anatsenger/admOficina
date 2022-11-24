package Controller;
import Models.Servico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class NFController extends ServiceController {
    Locale brasil = new Locale("pt", "BR");
    LocalDateTime data = LocalDateTime.parse(LocalDateTime.now().plusDays(5).format(DateTimeFormatter.ofPattern("dd-MMM-yyyy", brasil)));

    public static void getNF() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o id do serviço que deseja gerar a Nota Fiscal?");
        int id = sc.nextInt();
        for (Servico servico : servicosList) {
            if (id == servico.getId()) {
                if (servico.isFinalizado()) {
                    gerarNF(servico);
                } else if (!servico.isFinalizado()) {
                    servico.setFinalizado(true);
                    gerarNF(servico);
                }
            } else {
                System.out.println("Serviço não encontrado!!");
            }
        }
    }

    public static void gerarNF(Servico servico) {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("----------------------------Nota Fiscal-------------------------------");
        System.out.println("-------------------------DIVINO AUTOCENTER----------------------------");
        System.out.println("Destinatário: "+ servico.getCliente());
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Seriços realizados: "+ servico.getListServico());
        System.out.println("Preço total: "+ servico.getPreco());
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Data de realização: "+ servico.getData());
        System.out.println("Data de vencimento: "+ servico.getData());
        System.out.println("----------------------------------------------------------------------");

    }
}
