package map.pesquisaEmMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> produtoMap;

    public EstoqueProdutos() {
        this.produtoMap = new HashMap<>();
    }

    public void addProduct(long cod, String name, int quantity, double price){
        produtoMap.put(cod, new Produto(name, price, quantity));
    }

    public void displayProduct() {
        if (!produtoMap.isEmpty()) {
            System.out.println(produtoMap);
        } else {
            System.out.println("No products.");
        }
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        if (!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                totalValue += p.getQuantity() * p.getPrice();
            }
        }
        return totalValue;
    }

    public Produto productMoreExpensive() {
        Produto moreExpensive = null;
        double morePrice = Double.NEGATIVE_INFINITY;
        if (!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                if (p.getPrice() > morePrice) {
                    morePrice = p.getPrice();
                    moreExpensive = p;
                }
            }
        }
        return moreExpensive;
    }

    public Produto productMoreCheap() {
        Produto moreCheap = null;
        double smallerPrice = Double.MAX_VALUE;
        if (!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()){
                if (p.getPrice() < smallerPrice) {
                    smallerPrice = p.getPrice();
                    moreCheap = p;
                }
            }
        }
        return moreCheap;
    }

    public Produto productBiggerQuantityTotalValueStock() {
        Produto biggerProduct = null;
        double totalValue = 0;
        if (!produtoMap.isEmpty()) {
            for (Map.Entry<Long,Produto> entry : produtoMap.entrySet()) {
                double valueProductStock = entry.getValue().getPrice() * entry.getValue().getQuantity();
                if (valueProductStock > totalValue) {
                    totalValue = valueProductStock;
                    biggerProduct = entry.getValue();
                }
            }
        }
        return biggerProduct;
    }

    public static void main(String[] args) {
        EstoqueProdutos esotuqe = new EstoqueProdutos();

        //esotuqe.displayProduct();
        esotuqe.addProduct(1L,"Monitor1",9,10.00);
        esotuqe.addProduct(2L,"Monitor2",10,2.00);
        esotuqe.addProduct(3L,"Monitor3",5,9.00);
        esotuqe.addProduct(4L,"Monitor8",7,10.00);
        esotuqe.addProduct(5L,"Monitor9",3,10.00);
        //esotuqe.displayProduct();
        //System.out.println(esotuqe.calculateTotalValue());
        System.out.println(esotuqe.productMoreExpensive());
        System.out.println(esotuqe.productMoreCheap());

        Produto biggerValueProduct = esotuqe.productBiggerQuantityTotalValueStock();
        System.out.println("Produto com maior quantidade em valor no estoque: " + biggerValueProduct);
    }

}
