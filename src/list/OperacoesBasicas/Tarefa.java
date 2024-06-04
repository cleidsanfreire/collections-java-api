package list.OperacoesBasicas;

public class Tarefa {
    // Attributes
    private String description;

    @Override
    public String toString() {
        return description;
    }

    public Tarefa(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
