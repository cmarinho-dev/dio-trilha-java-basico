package aulaInterfaceList.pesquisa.agenda;

public class Main {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Joao Brito",111111111);
        agendaContatos.adicionarContato("Joao Cavalcante",222222222);
        agendaContatos.adicionarContato("Joao de Deus",333333333);
        agendaContatos.adicionarContato("Joao de Souza",444444444);
        agendaContatos.adicionarContato("Joao Brito",999999999);
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Joao de "));
        System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Joao Brito",555555555));
        agendaContatos.exibirContatos();

    }
}
