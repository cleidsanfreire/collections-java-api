package set.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // Attributes
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> searchContatos = new HashSet<>();
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().startsWith(nome)) {
                    searchContatos.add(c);
                }
            }
        }
        return searchContatos;
    }


    public Contato atualizarNumeroContato(String nome, String novoNumero) {
        Contato atualizado = null;
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumber(novoNumero);
                    atualizado = c;
                    break;
                }
            }
        }
        return atualizado;
    }

    public static void main(String[] args) {
        AgendaContatos contato = new AgendaContatos();

        contato.exibirContatos();

        contato.adicionarContato("Cleidsan babum", "61123456");
        contato.adicionarContato("Cleidsan babum", "61456789");
        contato.adicionarContato("Wagne", "61789123");
        contato.adicionarContato("Cleidsan Junior", "61456789");
        contato.adicionarContato("Cleidsan Freire", "61456123");

        contato.exibirContatos();
        System.out.println(contato.pesquisarPorNome("Cleidsan"));

        System.out.println("Contato Atualizado: " + contato.atualizarNumeroContato("Wagne", "61951753"));

        contato.exibirContatos();
    }
}