package src;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco Diversity! \n\n");
        System.out.println("Digite os dados do cliente:");

        System.out.println("Primeiro, digite o nome: ");
        String nomeCliente = leitura.nextLine();
        System.out.println("Agora, digite o saldo atualizado: ");
        double saldoCliente = leitura.nextDouble();

        Dados usuario = new Dados(saldoCliente, nomeCliente);

        int opcao;
        do {
            String menu = """
                    ***********************
                    Operações: 
                    
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair 
                    
                    Digite a opção desejada: 
                    """;
            System.out.println(menu);

            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println(String.format("Saldo: R$ " + usuario.mostrarSaldo(), .2f));
            } else if (opcao == 2) {
                System.out.println("Digite o valor a ser recebido: ");
                double recebido = leitura.nextDouble();
                System.out.println(String.format("Novo saldo: R$ " + usuario.recebimento(recebido), .2f));
            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser transferido: ");
                double transferido = leitura.nextDouble();
                if (transferido > usuario.saldo) {
                    System.out.println("Valor de transferência maior do que o saldo");
                    System.out.println("Saldo: " + usuario.saldo);
                } else {
                    System.out.println(String.format("Novo saldo: R$ " + usuario.transferencia(transferido), .2f));
                }
            } else if (opcao <= 0 && opcao > 4) {
                System.out.println("Opção inválida");
            }
        } while (opcao != 4);
    }
}
