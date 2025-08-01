package aulaInterfaceList.map.mapApp.operacoesBasicas;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Abel J",111111);
        agendaContatos.adicionarContato("Beatrice",22222);
        agendaContatos.adicionarContato("Beatrice",33333);
        agendaContatos.adicionarContato("Jhon",99999);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Jhon");

        agendaContatos.exibirContatos();
    }
}
