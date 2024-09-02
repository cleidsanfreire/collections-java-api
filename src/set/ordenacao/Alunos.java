package set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos>{
    private String name;
    private long matricula;
    private double nota;

    public Alunos(String name, long matricula, double nota) {
        this.name = name;
        this.matricula = matricula;
        this.nota = nota;
    }

    @Override
    public int compareTo(Alunos a) {
        return name.compareToIgnoreCase(a.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return matricula == alunos.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "name='" + name + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                '}';
    }
}

class ComparatorPorNota implements Comparator<Alunos> {

    @Override
    public int compare(Alunos a1, Alunos a2) {
        return Double.compare(a1.getNota(),a2.getNota());
    }
}
