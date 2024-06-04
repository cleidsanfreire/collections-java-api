package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // Attributes
    private List<Item> itemCarrinho;

    public CarrinhoDeCompras() {
        this.itemCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String name, Double price, int quantity) {
        itemCarrinho.add(new Item(name,price,quantity));
    }

    public void removerItem(String name) {
        List<Item> removeItem = new ArrayList<>();
        if (!itemCarrinho.isEmpty()) {
            for (Item i : itemCarrinho) {
                if (i.getName().equalsIgnoreCase(name)) {
                    removeItem.add(i);
                }
            }
            itemCarrinho.removeAll(removeItem);
        } else {
            System.out.println("Sua Lista de Compras está Vazia.");
        }
    }
    public Double calcularValorTotal() {
        Double valorTotal = 0.0;
        if (!itemCarrinho.isEmpty()) {
            for (Item i : itemCarrinho) {
                Double valor = i.getPrice() * i.getQuantity();
                valorTotal += valor;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!itemCarrinho.isEmpty()) {
            System.out.println(this.itemCarrinho);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
// Criando uma instância do carrinho de compras
        // Criando uma instancia do carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando os itens ao carrinho
        carrinho.adicionarItem("Lapis", 2.0,3);
        carrinho.adicionarItem("Lápis", 2d, 3);
        carrinho.adicionarItem("Caderno", 35d, 1);
        carrinho.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinho.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O Valor total da compra é: " + carrinho.calcularValorTotal());

        // Removendo os itens no carrinho
        carrinho.removerItem("Lapis");

        // Exibindo os itens no carrinho
        carrinho.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O Valor total da compra é: " + carrinho.calcularValorTotal());
    }
}
