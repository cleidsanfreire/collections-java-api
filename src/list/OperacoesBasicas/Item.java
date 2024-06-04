package list.OperacoesBasicas;

public class Item {
    // Attributes
    private String name;
    private Double price;
    private int quantity;

    public Item(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
       return "Exibindo Items do Carrinho de Compras --> \n" +
               "Name: " + getName() + "\n" +
               "Price: " + getPrice() + "\n" +
               "Quantity: " + getQuantity() + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
