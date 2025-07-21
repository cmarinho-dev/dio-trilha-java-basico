import java.util.Scanner;

class ContaTerminal {
    public static void main(String args[]) {
        var sc = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Digite o número da agência: ");
        var agencia = sc.nextLine();

        System.out.print("Digite o número da conta: ");
        var numeroConta = sc.nextInt();

        System.out.print("Digite o saldo inicial: ");
        var saldo = sc.nextDouble();

        sc.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);
    }
} 