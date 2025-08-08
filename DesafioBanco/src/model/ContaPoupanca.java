package model;

public class ContaPoupanca extends Conta {
    public ContaPoupanca() {}

    @Override
    public void imprimirExtrato() {
        super.imprimirExtrato("Conta Poupança");
    }
}
