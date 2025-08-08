package interfaces;

import model.Conta;

public interface ContaInterface {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
