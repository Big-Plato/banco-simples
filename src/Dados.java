package src;

public class Dados {
    double saldo;
    String name;

    Dados(double saldoDaConta, String nome) {
        saldo = saldoDaConta;
        name = nome;
    }

    double mostrarSaldo() {
        return this.saldo;
    }

    double recebimento(double valor) {
        this.saldo += valor;
        return this.saldo;
    }

    double transferencia(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }
}
