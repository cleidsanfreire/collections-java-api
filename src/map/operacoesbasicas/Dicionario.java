package map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void addWord(String word, String definition) {
        dicionarioMap.put(word,definition);
    }

    public void removeWord(String word) {
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(word);
        }
    }

    public void displayWords() {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        } else {
            System.out.println("O dicionario está vazio.");
        }
    }

    public String searchingForWord(String word) {
        String wordSeaching = dicionarioMap.get(word);
        if (dicionarioMap != null) {
            return wordSeaching;
        } else {
            return "Word Don't Found";
        }
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Dicionario dc = new Dicionario();

        // Mostrando palavras // Showing Words
        dc.displayWords();

        // Adicionando as palavras // Adding words
        dc.addWord("Ola","oi");
        dc.addWord("Baum","Bom");
        dc.addWord("Simbora","Vamos la");
        dc.addWord("Opa","Eai");

        // Mostrando palavras // Showing Words
        dc.displayWords();

        // Removendo palavras // Removing Words
        System.out.println("Qual palavra deseja remover? ");
        String remove = tec.next();
        dc.removeWord(remove);
        System.out.println(remove + " Removida.");

        // Mostrando palavras // Showing Words
        dc.displayWords();

        //Pesquisando por palavras // Searching for words
        System.out.println("Qual palavra deseja pesquisar? ");
        String search = tec.next();
        String definition = dc.searchingForWord(search);
        System.out.println("Definition of " + search + ": " + definition);


    }
}
