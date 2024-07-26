package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Attributes
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void addConvidado(String name, int codConvite) {
        convidadoSet.add(new Convidado(name, codConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codConvite) {
        Convidado removeConvidado = null;
        if (!convidadoSet.isEmpty()) {
            for (Convidado c : convidadoSet) {
                if (c.getCodConvite() == codConvite) {
                    removeConvidado = c;
                    break;
                } else {
                    System.out.println("Codigo de convite nao encontrado!");
                }
            }
        } else {
            System.out.println("Lista de convidados vazia.");
        }
        convidadoSet.remove(removeConvidado);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        if (!convidadoSet.isEmpty()) {
            System.out.println(convidadoSet);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        System.out.println("Existem " + convidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        convidados.addConvidado("Convidado 1", 1234);
        convidados.addConvidado("Convidado 2", 1235);
        convidados.addConvidado("Convidado 3", 1235);
        convidados.addConvidado("Convidado 4", 1236);

        System.out.println("Existem " + convidados.contarConvidados() + " convidados(s) dentro do Set de Convidados");

        convidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + convidados.contarConvidados() + " convidados(s) dentro do Set de Convidados");

        convidados.exibirConvidados();
    }
}
