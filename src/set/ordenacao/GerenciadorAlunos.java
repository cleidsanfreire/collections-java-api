package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String name, long matricula, double nota) {
        alunosSet.add(new Alunos(name,matricula,nota));
    }

    public void removeAluno(long matricula) {
        Alunos removAluno = null;
        if (!alunosSet.isEmpty()) {
            for (Alunos a : alunosSet) {
                if (a.getMatricula() == matricula) {
                    removAluno = a;
                    break;
                }
            }
        }
        alunosSet.remove(removAluno);
    }

    public Set<Alunos> exibirAlunosPorNome() {
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Alunos> exibirAlunosPorNota() {
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();
        alunos.exibirAlunos();//ABCDEFGH
        alunos.adicionarAluno("Hug",4309433,10);
        alunos.adicionarAluno("Elif",4309,5);
        alunos.adicionarAluno("Forg",4433,1);
        alunos.adicionarAluno("Grug",4433,8);
        alunos.adicionarAluno("Abel",43433,4);

        alunos.exibirAlunos();

        alunos.removeAluno(43433);

        alunos.exibirAlunos();

        System.out.println("-------**********--------");

        System.out.println(alunos.exibirAlunosPorNome());
        System.out.println(alunos.exibirAlunosPorNota());


    }
}
