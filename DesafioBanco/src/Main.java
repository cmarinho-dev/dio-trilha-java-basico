import model.*;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco("Banco ABC");

        // Criar clientes
        Cliente cliente1 = new Cliente("Carlos", "9999-9999", "Rua A, 123");
        Cliente cliente2 = new Cliente("Ana", "8888-8888", "Rua B, 456");

        // Adicionar clientes ao banco (com contas criadas automaticamente)
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        // Realizar operações no cliente 1
        System.out.println("Operações no cliente: " + cliente1.getNome());
        Conta contaCorrente1 = cliente1.getContas().get(0); // Conta Corrente
        Conta contaPoupanca1 = cliente1.getContas().get(1); // Conta Poupança

        contaCorrente1.depositar(1000);
        contaCorrente1.sacar(200);
        contaCorrente1.transferir(100, contaPoupanca1);
        System.out.println("Foi realizado movimentações nesta conta com sucesso! \n");


        // Realizar operações no cliente 2
        System.out.println("Operações no cliente: " + cliente2.getNome());
        Conta contaCorrente2 = cliente2.getContas().get(0);
        Conta contaPoupanca2 = cliente2.getContas().get(1);

        contaCorrente2.depositar(500);
        contaCorrente2.sacar(50);
        contaCorrente2.transferir(150, contaPoupanca2);
        System.out.println("Foi realizado movimentações nesta conta com sucesso! \n");

        // Listar contas e extratos de todos clientes
        System.out.println("\n=== Extratos das Contas do Banco ===");
        banco.listarContasEClientes();
    }
}
