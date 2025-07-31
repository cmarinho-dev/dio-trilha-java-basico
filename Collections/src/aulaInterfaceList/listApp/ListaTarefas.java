package aulaInterfaceList.listApp;

import java.util.ArrayList;
import java.util.List;

class ListaTarefas {

    private List<Tarefa> taskList;

    public ListaTarefas() {
        taskList = new ArrayList<>();
    }

    public List<Tarefa> getTaskList() {
        return taskList;
    }

    public void adicionarTarefa(String description) {
        taskList.add(new Tarefa(description));
    }

    public void removerTarefa(String description) {
        List<Tarefa> tasksToRemove = new ArrayList<>();
        for (Tarefa task : taskList) {
            if (task.getDescricao().equalsIgnoreCase(description)) {
                tasksToRemove.add(task);
            }
        }
        taskList.removeAll(tasksToRemove);
    }

    public int numeroTotalTarefas() {
        return taskList.size();
    }

    public void exibirDescricoesTarefas() {
        System.out.println(taskList.toString());
    }
}