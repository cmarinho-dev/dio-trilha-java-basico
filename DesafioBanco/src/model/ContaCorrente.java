package model;

public class ContaCorrente extends Conta {
    public ContaCorrente() {}

    @Override
    public void imprimirExtrato() {
        super.imprimirExtrato("Conta Corrente");
    }
}
