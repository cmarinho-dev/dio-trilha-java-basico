package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private String contato;
    private String endereco;
    private List<Conta> contas;

    public Cliente(String nome, String contato, String endereco) {
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereco;
        this.contas = new ArrayList<>();
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public List<Conta> getContas() { return contas; }

    public String getNome() {
        return nome;
    }
}
