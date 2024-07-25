package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdernacaoNumeros {
    private List<Integer> numberList;

    public OrdernacaoNumeros() {
        this.numberList = new ArrayList<>();
    }

    public void addNumber(int number) {
        numberList.add(number);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numAscen = new ArrayList<>(numberList);
        if (!numberList.isEmpty()) {
            Collections.sort(numAscen);
            return numAscen;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numDescen = new ArrayList<>(numberList);
        if (!numberList.isEmpty()) {
            numDescen.sort(Collections.reverseOrder());
            return numDescen;
        } else {
            throw new RuntimeException("Lista Vazia.");
        }
    }

    public int maiorNumber() {
        int numMaior = Integer.MIN_VALUE;
        if (!numberList.isEmpty()) {
            for (Integer i : numberList) {
                if (i >= numMaior) {
                    numMaior = i;
                }
            }
            return numMaior;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public int menorNumber() {
        int numMenor = Integer.MAX_VALUE;
        if (!numberList.isEmpty()) {
            for (Integer i : numberList) {
                if (i <= numMenor) {
                    numMenor = i;
                }
            }
            return numMenor;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public int somaNumbers() {
        int soma = 0;
        if (!numberList.isEmpty()) {
            for (Integer i : numberList) {
                soma += i;
            }
            return soma;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public void exibirNumbers() {
        if (!numberList.isEmpty()) {
            System.out.println(numberList);
        } else {
            System.out.println("Lista vazia.");
        }
    }

    public static void main(String[] args) {
        OrdernacaoNumeros numbers = new OrdernacaoNumeros();

        // Adicionando os numeros a lista
        numbers.addNumber(7);
        numbers.addNumber(9);
        numbers.addNumber(4);
        numbers.addNumber(65);
        numbers.addNumber(51);
        numbers.addNumber(87);
        numbers.addNumber(62);
        numbers.addNumber(100);

        // Exibindo os numeros adicionados
        System.out.println("Numeros Adicionados.");
        numbers.exibirNumbers();

        // Ordenando a lista em Ascendente.
        System.out.println("Ordenado em Ascendente.");
        System.out.println(numbers.ordenarAscendente());

        // Ordenando a lista em Descendente
        System.out.println("Ordenado em Descendente");
        System.out.println(numbers.ordenarDescendente());

        // Somas

        //O Maior numero encontrado na lista.
        System.out.println("O Maior numero da lista é: " + numbers.maiorNumber());

        //O Menor numero encontrado na lista.
        System.out.println("O Menor numero da lista é: " + numbers.menorNumber());

        // A soma de todos os numeros da lista
        System.out.println("A soma de todos os numeros é: " + numbers.somaNumbers());
    }
}
