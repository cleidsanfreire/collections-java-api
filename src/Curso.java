public class Curso {
    private String name;
    private int cargaHoraria;
    private int quantidadeAlunos;


    public Curso(String name, int cargaHoraria, int quantidadeAlunos) {
        this.name = name;
        this.cargaHoraria = cargaHoraria;
        this.quantidadeAlunos = quantidadeAlunos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "name='" + name + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", quantidadeAlunos=" + quantidadeAlunos +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }
}
