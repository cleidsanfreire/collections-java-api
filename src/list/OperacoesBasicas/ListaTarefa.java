package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Attributes
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void addTarefa(String description) {
        tarefaList.add(new Tarefa(description));
    }

   public void removeTarefa(String description) {
        List<Tarefa> tarefasForRemove = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                tarefasForRemove.add(t);
            }
        }
        tarefaList.removeAll(tarefasForRemove);
   }
   public int obterNumberTotalTarefas() {
       return tarefaList.size();
   }

   public void obterDescriptionTarefa() {
       System.out.println(tarefaList);
   }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total ede elementos na lista é: " + listaTarefa.obterNumberTotalTarefas());

        listaTarefa.addTarefa("Tarefa 1");
        listaTarefa.addTarefa("Tarefa 1");
        listaTarefa.addTarefa("Tarefa 2");

        System.out.println("O numero total ede elementos na lista é: " + listaTarefa.obterNumberTotalTarefas());

        listaTarefa.removeTarefa("tarefa 1");

        System.out.println("O numero total ede elementos na lista é: " + listaTarefa.obterNumberTotalTarefas());

        listaTarefa.obterDescriptionTarefa();
    }
}
