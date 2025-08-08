package model;

import interfaces.ContaInterface;

import java.util.*;

public class Banco {
    private String nome;
    private List<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void adicionarCliente(Cliente cliente) {
        cliente.addConta(new ContaCorrente());
        cliente.addConta(new ContaPoupanca());
        clientes.add(cliente);
    }

    public void listarContasEClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("\n\n\n- CLIENTE: " + cliente.getNome().toUpperCase());
            cliente.getContas()
                    .forEach(ContaInterface::imprimirExtrato);
        }
    }
}
