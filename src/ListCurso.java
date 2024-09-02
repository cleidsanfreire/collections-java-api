import list.OperacoesBasicas.ListaTarefa;
import list.Pesquisa.Livro;

import java.util.ArrayList;
import java.util.List;

public class ListCurso {
    private List<Curso> cursoList;

    public ListCurso() {
        this.cursoList = new ArrayList<>();
    }

    public void addCurso(String name, int cargaHoraria, int quantidadeAlunos) {
        cursoList.add(new Curso(name, cargaHoraria, quantidadeAlunos));
    }

    public void removeCurso(String name) {
        List<Curso> removeCurso = new ArrayList<>();
        if (!cursoList.isEmpty()) {
            for (Curso i : cursoList) {
                if (i.getName().equals(name)) {
                    removeCurso.add(i);
                    break;
                }
            }
        } else {
            System.out.println("Lista vazia!");
        }
        cursoList.removeAll(removeCurso);
    }

    public List<Curso> searchCurso(String name){
        List<Curso> bookPorCurso = new ArrayList<>();
        if (!cursoList.isEmpty()){
            for (Curso i : cursoList) {
                if (i.getName().equalsIgnoreCase(name)) {
                    bookPorCurso.add(i);
                }
            }
        }
        return bookPorCurso;
    }
    public void imprimirCursos() {
        System.out.println(cursoList);
    }

    public static void main(String[] args) {
        ListCurso curso = new ListCurso();

        curso.addCurso("Java",240,25);
        curso.addCurso("C#",200,20);
        curso.addCurso("C++",240,25);
        curso.addCurso("C++",240,25);

        curso.imprimirCursos();

        curso.imprimirCursos();

        System.out.println(curso.searchCurso("C++"));


    }
}
