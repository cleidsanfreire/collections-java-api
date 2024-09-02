package set.PesquisaSet;

import java.util.Objects;

public class Tarefa {
    private String description;
    private boolean completed;

    public Tarefa(String description) {
        this.description = description;
        this.completed = false;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "description='" + description + '\'' +
                ", completed=" + completed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(description, tarefa.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
