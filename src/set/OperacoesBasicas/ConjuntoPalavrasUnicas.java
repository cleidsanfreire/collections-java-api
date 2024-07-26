package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("A palavra '"+ palavra +"' Não contem no SET");
            }
        } else {
            System.out.println("Set de palavras está vazio.");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("Set de palavras está vazio.");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();
        // Adicionando palavras ao SET
        palavrasUnicas.adicionarPalavra("Dutch");
        palavrasUnicas.adicionarPalavra("Montana");
        palavrasUnicas.adicionarPalavra("Kakum");
        palavrasUnicas.adicionarPalavra("Kohh");
        palavrasUnicas.adicionarPalavra("Kohh");
        palavrasUnicas.adicionarPalavra("Loota");

        // Exibindo as palavras adicionadas
        palavrasUnicas.exibirPalavrasUnicas();

        // Removendo palavras do SET
        palavrasUnicas.removerPalavra("Kakum");
        // Removendo uma palavra inexistente no SET
        palavrasUnicas.removerPalavra("Zorn");

        // Exibindo as palavras do SET apos atualizacao
        palavrasUnicas.exibirPalavrasUnicas();

        // Verificando se há uma palavra no SET
        System.out.println(palavrasUnicas.verificarPalavra("Loota"));
        System.out.println(palavrasUnicas.verificarPalavra("Kohh"));

        palavrasUnicas.exibirPalavrasUnicas();
    }
}
