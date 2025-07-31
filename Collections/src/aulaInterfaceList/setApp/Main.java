package aulaInterfaceList.setApp;

public class Main {

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 111);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 222);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 333);
        // Objeto abaixo não vai ser adicionado ao Set por ter um codigo ja existente
        conjuntoConvidados.adicionarConvidado("Convidado 4", 111);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");
        conjuntoConvidados.exibirConvidados();

    }
}
