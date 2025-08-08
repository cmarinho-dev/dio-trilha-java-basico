package model;

import java.time.OffsetDateTime;

public class Movimentacao {
    private OffsetDateTime dateTime;
    private double valor;

    public Movimentacao(OffsetDateTime dateTime, double valor) {
        this.dateTime = dateTime;
        this.valor = valor;
    }

    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    public double getValor() {
        return valor;
    }
}
