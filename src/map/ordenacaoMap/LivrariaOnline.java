package map.ordenacaoMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
    private Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor,double preco) {
        livroMap.put(link,new Livro(titulo,autor,preco));
    }

    public void removerLivro(String titulo) {
        List<String> listRemove = new ArrayList<>();
        if (!livroMap.isEmpty()) {
            for (Map.Entry<String,Livro> entry : livroMap.entrySet()){
                if (entry.getValue().getTitle().equalsIgnoreCase(titulo)){
                    listRemove.add(entry.getKey());
                }
            }
        }
        for (String chave : listRemove) {
            livroMap.remove(chave);
        }
    }
}
