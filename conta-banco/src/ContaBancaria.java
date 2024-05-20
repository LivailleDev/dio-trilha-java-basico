public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia;
            System.out.println("Depósito realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("A quantia para depósito deve ser positiva.");
        }
    }

    public void sacar(double quantia) {
        if (quantia > 0 && quantia <= saldo) {
            saldo -= quantia;
            System.out.println("Saque realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Saque inválido. Verifique o saldo ou a quantia.");
        }
    }
}
