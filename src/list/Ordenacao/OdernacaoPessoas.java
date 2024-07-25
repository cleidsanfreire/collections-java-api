package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OdernacaoPessoas {
    //Attribute
    private List<Pessoa> pessoaList;

    public OdernacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void addPessoa(String name, int age, double length) {
        pessoaList.add(new Pessoa(name, age, length));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OdernacaoPessoas odernacaoPessoas = new OdernacaoPessoas();
        odernacaoPessoas.addPessoa("Nome 1", 20,1.56);
        odernacaoPessoas.addPessoa("Nome 2", 30,1.80);
        odernacaoPessoas.addPessoa("Nome 3", 25,1.70);
        odernacaoPessoas.addPessoa("Nome 4", 17,1.56);

        System.out.println(odernacaoPessoas.pessoaList);

        System.out.println(odernacaoPessoas.ordenarPorIdade());
        System.out.println(odernacaoPessoas.ordenarPorAltura());

    }
}
