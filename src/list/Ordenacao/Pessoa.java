package list.Ordenacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pessoa implements Comparable<Pessoa>{
    private String name;
    private int age;
    private double length;

    public Pessoa(String name, int age, double length) {
        this.name = name;
        this.age = age;
        this.length = length;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(age, p.getAge());
    }
    @Override
    public String toString() {
        return "Pessoa --> " +
                "Nome: " + this.getName() +
                ", Idade: " + this.getAge() +
                ", Altura: " + this.getLength() +
                "\n";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getLength() {
        return length;
    }

}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getLength(), p2.getLength());
    }
}
