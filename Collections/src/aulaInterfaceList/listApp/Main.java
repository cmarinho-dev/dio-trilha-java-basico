package aulaInterfaceList.listApp;

/* TODO:
    Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo.
    Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo
    de descrição. Implemente os seguintes métodos:

     - adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.
     - removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.
     - obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
     - obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.
     */

class Main {
    public static void main(String[] args) {
        ListaTarefas list = new ListaTarefas();
        list.adicionarTarefa("Learn Java");
        list.adicionarTarefa("Learn Spring");
        list.adicionarTarefa("Create Java Sring Project");

        System.out.println("Number of tasks: " + list.numeroTotalTarefas());
        list.exibirDescricoesTarefas();
        list.removerTarefa("Learn Java");
        list.exibirDescricoesTarefas();

    }
}