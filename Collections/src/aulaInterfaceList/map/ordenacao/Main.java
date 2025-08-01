package aulaInterfaceList.map.mapApp.ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2029, Month.JULY, 12), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 10), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2026, Month.APRIL, 29), "Evento 3", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2027, Month.JANUARY, 1), "Evento 4", "Atracao 3");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
