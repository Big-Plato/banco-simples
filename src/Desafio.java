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

        System.out.println(nomeCliente + " " + saldoCliente);

        Dados usuario = new Dados(saldoCliente, nomeCliente);
        System.out.println(usuario.name);

        int opcao;
        do {
            System.out.println("Operações \n");

            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair \n");
            System.out.println("Digite a opção desejada: ");
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo: " + usuario.mostrarSaldo());
            } else if (opcao == 2) {
                System.out.println("Digite o valor a ser recebeido: ");
                double recebido = leitura.nextDouble();
                System.out.println("Novo saldo: " + usuario.recebimento(recebido));
            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser transferido: ");
                double transferido = leitura.nextDouble();
                System.out.println("Novo saldo: " + usuario.transferencia(transferido));
            } else if (opcao <= 0 && opcao > 4) {
                System.out.println("Opção inválida");
            }
        } while (opcao != 4);
    }
}
