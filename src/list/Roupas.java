package list;

public class Roupas {
    private String name, large;
    private Double price;
    private int quantity;

    public Roupas(String name, String large, Double price, int quantity) {
        this.name = name;
        this.large = large;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Roupas{" +
                "name='" + name + '\'' +
                ", large='" + large + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLarge() {
        return large;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
