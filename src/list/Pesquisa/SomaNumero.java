package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumero {
    // Attributes
    private List<Integer> listNumber;

    public SomaNumero() {
        this.listNumber = new ArrayList<>();
    }

    public void addNumber(int numero) {
        this.listNumber.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if (!listNumber.isEmpty()) {
            for (Integer i : listNumber) {
                soma += i;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int numMaior = Integer.MIN_VALUE;
        if (!listNumber.isEmpty()) {
            for (Integer i : listNumber) {
                if (i >= numMaior) {
                    numMaior = i;
                }
            }
            return numMaior;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int numMenor = Integer.MAX_VALUE;
        if (!listNumber.isEmpty()) {
            for (Integer i : listNumber) {
                if (i <= numMenor) {
                    numMenor = i;
                }
            }
            return numMenor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!listNumber.isEmpty()) {
            System.out.println(listNumber);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumero num = new SomaNumero();

        // Adicionando números à lista
        num.addNumber(251);
        num.addNumber(100);
        num.addNumber(110);
        num.addNumber(251);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        num.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + num.calcularSoma());
        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + num.encontrarMaiorNumero());
        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + num.encontrarMenorNumero());

    }
}
