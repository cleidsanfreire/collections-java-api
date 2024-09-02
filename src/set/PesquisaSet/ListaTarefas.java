package set.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void addTask(String description){
        tarefaSet.add(new Tarefa(description));
    }

    public void removeTask(String description){
        Tarefa removeTask = null;
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet) {
                if (t.getDescription().equalsIgnoreCase(description)){
                    removeTask = t;
                    break;
                }
            }
            tarefaSet.remove(removeTask);
        }else {
            System.out.println("O conjunto está vazio");
        }

        if (removeTask == null) {
            System.out.println("Tarefa nao encontrada");
        }
    }

    public void exibirTarefa() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Tarefa markTaskCompleted(String description){
        Tarefa completedTask = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet){
                if (t.getDescription().equalsIgnoreCase(description)){
                    t.setCompleted(true);
                    completedTask = t;
                    break;
                }
            }
        }
        return completedTask;
    }

    public Tarefa markTaskPending(String description) {
        Tarefa pendingTask = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescription().equalsIgnoreCase(description)) {
                    t.setCompleted(false);
                    pendingTask = t;
                    break;
                }
            }
        }
        return pendingTask;
    }

    public Set<Tarefa> obtainTaskCompleted() {
        Set<Tarefa> obtainCompleted = new HashSet<>();
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (t.isCompleted()) {
                    obtainCompleted.add(t);
                }
            }
        }
        return obtainCompleted;
    }

    public Set<Tarefa> obtainTaskPending(){
        Set<Tarefa> obtainPending = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet){
                 if (!t.isCompleted()) {
                     obtainPending.add(t);
                 }
            }
        }
        return obtainPending;
    }

    public void cleanListTask() {
        Set<Tarefa> cleanTask = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                cleanTask.add(t);
            }
        }
        tarefaSet.removeAll(cleanTask);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.addTask("Java");
        listaTarefas.addTask("C#");
        listaTarefas.addTask("C++");
        listaTarefas.addTask("VSCode");

        listaTarefas.exibirTarefa();

        System.out.println(listaTarefas.contarTarefas());;

        //listaTarefas.removeTask("Pesquisa em Java");

        listaTarefas.markTaskCompleted("Java");
        listaTarefas.markTaskCompleted("C#");
        listaTarefas.markTaskCompleted("C++");
        listaTarefas.markTaskCompleted("VSCode");

        listaTarefas.markTaskPending("Java");
        listaTarefas.markTaskPending("C++");
        listaTarefas.markTaskPending("VSCode");

        listaTarefas.exibirTarefa();

        System.out.println(listaTarefas.obtainTaskCompleted());
        System.out.println(listaTarefas.obtainTaskPending());

        listaTarefas.exibirTarefa();
        listaTarefas.cleanListTask();
        listaTarefas.exibirTarefa();
    }
}
