package model;

import interfaces.ContaInterface;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class Conta implements ContaInterface {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected List<Movimentacao> movimentacoes;

    public Conta() {
        this.movimentacoes = new ArrayList<>();
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        addMovimentacao(OffsetDateTime.now(), -valor);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        addMovimentacao(OffsetDateTime.now(), valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirExtrato(String tipoConta) {
        System.out.println("\n╔═══════════════════════════════════╗");
        System.out.println("       EXTRATO - " + tipoConta);
        System.out.println("╠═══════════════════════════════════╣");
        System.out.printf("Agência: %d%n", this.agencia);
        System.out.printf("Número:  %d%n", this.numero);
        System.out.printf("Saldo:   R$ %.2f%n", this.saldo);
        System.out.println("╠═══════════════════════════════════╣");

        if (!movimentacoes.isEmpty()) {
            System.out.println("Lançamentos:");
            System.out.println("-------------------------------------");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            System.out.printf("%-20s %15s%n", "Data", "Valor (R$)");
            System.out.println("-------------------------------------");
            for (Movimentacao movimentacao : movimentacoes) {
                String dataFormatada = movimentacao.getDateTime().format(formatter);
                System.out.printf("%-20s %15s%n", dataFormatada,
                        (movimentacao.getValor() >= 0 ? "+" : "") + String.format("%.2f", movimentacao.getValor()));
            }
            System.out.println("╚═══════════════════════════════════╝");
        } else {
            System.out.println("Nenhum lançamento registrado.");
            System.out.println("╚═══════════════════════════════════╝");
        }
    }


    public void addMovimentacao(OffsetDateTime tempo, Double valor) {
        this.movimentacoes.add(new Movimentacao(tempo, valor));
    }



}
