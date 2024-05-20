import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao Banco! Por favor, insira o nome do titular da conta:");
        String titular = scanner.nextLine();
        
        System.out.println("Insira o saldo inicial da conta:");
        double saldoInicial = scanner.nextDouble();
        
        ContaBancaria conta = new ContaBancaria(titular, saldoInicial);
        
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Verificar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;
                case 2:
                    System.out.println("Insira a quantia para depósito:");
                    double quantiaDeposito = scanner.nextDouble();
                    conta.depositar(quantiaDeposito);
                    break;
                case 3:
                    System.out.println("Insira a quantia para saque:");
                    double quantiaSaque = scanner.nextDouble();
                    conta.sacar(quantiaSaque);
                    break;
                case 4:
                    System.out.println("Obrigado por usar nosso banco. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        scanner.close();
    }
}
