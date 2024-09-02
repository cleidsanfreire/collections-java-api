package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // Attributes
    private List<Item> itemCarrinho;

    public CarrinhoDeCompras() {
        this.itemCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String name, int quantity, Double price) {
        itemCarrinho.add(new Item(name, quantity, price));
    }

    public void removeItem(String name) {
        List<Item> removeItems = new ArrayList<>();
        if (!itemCarrinho.isEmpty()) {
            for (Item i : itemCarrinho) {
                if (i.getName().equalsIgnoreCase(name)) {
                    removeItems.add(i);
                }
            }
            itemCarrinho.removeAll(removeItems);
        } else {
            System.out.println("Lista Vazia!");
        }
    }

    public Double calcularValorTotal() {
        Double valorTotal = 0d;
        if (!itemCarrinho.isEmpty()) {
            for (Item i : itemCarrinho) {
                Double valorItem = i.getPrice() * i.getQuantity();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("Lista Vazia!");
        }

    }

    public void exibirItens() {
        if (!itemCarrinho.isEmpty()) {
            System.out.println(itemCarrinho);
            System.out.println("O Valor Total da sua compra é de: " + calcularValorTotal() + "\n");
        }else {
            System.out.println("Lista Vazia!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Cadeira",1,225.50);
        carrinho.adicionarItem("Cadeira",2,225.50);
        carrinho.adicionarItem("Mesa",2,125.00);
        carrinho.adicionarItem("Monitor",1,625.00);
        carrinho.adicionarItem("Teclado",1,280.00);
        carrinho.adicionarItem("Mouse",2,250.00);

        carrinho.exibirItens();

        carrinho.removeItem("Cadeiras");
        carrinho.adicionarItem("Cadeira",1,225.50);
        carrinho.exibirItens();
    }
}
