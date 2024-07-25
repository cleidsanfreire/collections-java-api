package list.OperacoesBasicas;

public class Item {
    // Attributes
    private String name;
    private int quantity;
    private Double price;

    // Constructor
    public Item(String name, int quantity, Double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item --> " + "\n" +
                "Name: " + name + "\n" +
                "Quantity: " + quantity + "\n" +
                "Price: " + price + "\n" +
                "<-- \n";
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }
}
