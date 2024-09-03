package map.pesquisaEmMap;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> textMap;

    public ContagemPalavras() {
        this.textMap = new HashMap<>();
    }

    public void add(String palavra, Integer contagem) {
        textMap.put(palavra, contagem);
    }

    public void removePalavra(String palavra) {
        if (!textMap.isEmpty()) {
            textMap.remove(palavra);
        } else {
            System.out.println("Sem palavras para remover, Map vazio.");
        }
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem=0;
        if (!textMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : textMap.entrySet()) {
                if (entry.getValue() > maiorContagem) {
                    maiorContagem = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }
        return palavraMaisFrequente;
    }

    public int exibirContagemPalavras() {
        int contagemT = 0;
        if (!textMap.isEmpty()) {
            for (int contagem : textMap.values()) {
                contagemT += contagem;
            }
        }
        return contagemT;
    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.add("Oceans", 5);
        contagem.add("Oceanss", 5);
        contagem.add("Feliz", 55);
        contagem.add("Sad", 5);
        contagem.add("Brut", 5);
        contagem.add("Tree", 15);

        contagem.removePalavra("Tre");

        System.out.println(contagem.exibirContagemPalavras());
        System.out.println(contagem.encontrarPalavraMaisFrequente());;
    }
}
